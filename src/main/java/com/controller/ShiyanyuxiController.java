package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

import com.service.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.ShiyanyuxiEntity;

import com.entity.view.ShiyanyuxiView;
import com.entity.ShiyanpaikeEntity;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 实验预习
 * 后端接口
 * @author
 * @email
 * @date 2021-04-14
*/
@RestController
@Controller
@RequestMapping("/shiyanyuxi")
public class ShiyanyuxiController {
    private static final Logger logger = LoggerFactory.getLogger(ShiyanyuxiController.class);

    @Autowired
    private ShiyanyuxiService shiyanyuxiService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private ShiyanpaikeService shiyanpaikeService;
    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "学生".equals(role)){
            params.put("banjiTypes",yonghuService.selectById((Integer)request.getSession().getAttribute("userId")).getBanjiTypes());
        }
        if(StringUtil.isNotEmpty(role) && "教师".equals(role)){
            params.put("jiaoshiId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = shiyanyuxiService.queryPage(params);

        //字典表数据转换
        List<ShiyanyuxiView> list =(List<ShiyanyuxiView>)page.getList();
        for(ShiyanyuxiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShiyanyuxiEntity shiyanyuxi = shiyanyuxiService.selectById(id);
        if(shiyanyuxi !=null){
            //entity转view
            ShiyanyuxiView view = new ShiyanyuxiView();
            BeanUtils.copyProperties( shiyanyuxi , view );//把实体数据重构到view中

            //级联表
            ShiyanpaikeEntity shiyanpaike = shiyanpaikeService.selectById(shiyanyuxi.getShiyanpaikeId());
            if(shiyanpaike != null){
                BeanUtils.copyProperties( shiyanpaike , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setShiyanpaikeId(shiyanpaike.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ShiyanyuxiEntity shiyanyuxi, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shiyanyuxi:{}",this.getClass().getName(),shiyanyuxi.toString());
        Wrapper<ShiyanyuxiEntity> queryWrapper = new EntityWrapper<ShiyanyuxiEntity>()
            .eq("shiyanpaike_id", shiyanyuxi.getShiyanpaikeId())
            .eq("shiyanyuxi_mudi", shiyanyuxi.getShiyanyuxiMudi())
            .eq("shiyanyuxi_yiqiu", shiyanyuxi.getShiyanyuxiYiqiu())
            .eq("shiyanyuxi_shuxi", shiyanyuxi.getShiyanyuxiShuxi())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShiyanyuxiEntity shiyanyuxiEntity = shiyanyuxiService.selectOne(queryWrapper);
        if(shiyanyuxiEntity==null){
            shiyanyuxi.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      shiyanyuxi.set
        //  }
            shiyanyuxiService.insert(shiyanyuxi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShiyanyuxiEntity shiyanyuxi, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,shiyanyuxi:{}",this.getClass().getName(),shiyanyuxi.toString());
        //根据字段查询是否有相同数据
        Wrapper<ShiyanyuxiEntity> queryWrapper = new EntityWrapper<ShiyanyuxiEntity>()
            .notIn("id",shiyanyuxi.getId())
            .andNew()
            .eq("shiyanpaike_id", shiyanyuxi.getShiyanpaikeId())
            .eq("shiyanyuxi_mudi", shiyanyuxi.getShiyanyuxiMudi())
            .eq("shiyanyuxi_yiqiu", shiyanyuxi.getShiyanyuxiYiqiu())
            .eq("shiyanyuxi_shuxi", shiyanyuxi.getShiyanyuxiShuxi())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShiyanyuxiEntity shiyanyuxiEntity = shiyanyuxiService.selectOne(queryWrapper);
        if(shiyanyuxiEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      shiyanyuxi.set
            //  }
            shiyanyuxiService.updateById(shiyanyuxi);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        shiyanyuxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = shiyanyuxiService.queryPage(params);

        //字典表数据转换
        List<ShiyanyuxiView> list =(List<ShiyanyuxiView>)page.getList();
        for(ShiyanyuxiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShiyanyuxiEntity shiyanyuxi = shiyanyuxiService.selectById(id);
            if(shiyanyuxi !=null){
                //entity转view
        ShiyanyuxiView view = new ShiyanyuxiView();
                BeanUtils.copyProperties( shiyanyuxi , view );//把实体数据重构到view中

                //级联表
                    ShiyanpaikeEntity shiyanpaike = shiyanpaikeService.selectById(shiyanyuxi.getShiyanpaikeId());
                if(shiyanpaike != null){
                    BeanUtils.copyProperties( shiyanpaike , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setShiyanpaikeId(shiyanpaike.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ShiyanyuxiEntity shiyanyuxi, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,shiyanyuxi:{}",this.getClass().getName(),shiyanyuxi.toString());
        Wrapper<ShiyanyuxiEntity> queryWrapper = new EntityWrapper<ShiyanyuxiEntity>()
            .eq("shiyanpaike_id", shiyanyuxi.getShiyanpaikeId())
            .eq("shiyanyuxi_mudi", shiyanyuxi.getShiyanyuxiMudi())
            .eq("shiyanyuxi_yiqiu", shiyanyuxi.getShiyanyuxiYiqiu())
            .eq("shiyanyuxi_shuxi", shiyanyuxi.getShiyanyuxiShuxi())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
    ShiyanyuxiEntity shiyanyuxiEntity = shiyanyuxiService.selectOne(queryWrapper);
        if(shiyanyuxiEntity==null){
            shiyanyuxi.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      shiyanyuxi.set
        //  }
        shiyanyuxiService.insert(shiyanyuxi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}

