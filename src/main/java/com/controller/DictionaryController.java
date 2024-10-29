package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.DictionaryEntity;

import com.service.DictionaryService;
import com.entity.view.DictionaryView;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 字典表
 * 后端接口
 * @author
 * @email
 * @date 2021-04-14
*/
@RestController
@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
    private static final Logger logger = LoggerFactory.getLogger(DictionaryController.class);

    @Autowired
    private DictionaryService dictionaryService;


    @Autowired
    private TokenService tokenService;



    //级联表service


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    @IgnoreAuth
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = dictionaryService.queryPage(params);

        //字典表数据转换
        List<DictionaryView> list =(List<DictionaryView>)page.getList();
        for(DictionaryView c:list){
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
        DictionaryEntity dictionary = dictionaryService.selectById(id);
        if(dictionary !=null){
            //entity转view
            DictionaryView view = new DictionaryView();
            BeanUtils.copyProperties( dictionary , view );//把实体数据重构到view中

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
    public R save(@RequestBody DictionaryEntity dictionary, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,dictionary:{}",this.getClass().getName(),dictionary.toString());
        Wrapper<DictionaryEntity> queryWrapper = new EntityWrapper<DictionaryEntity>()
            .eq("dic_code", dictionary.getDicCode())
            .eq("code_index", dictionary.getCodeIndex())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        DictionaryEntity dictionaryEntity = dictionaryService.selectOne(queryWrapper);
        if(dictionaryEntity==null){
            dictionary.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      dictionary.set
        //  }
            dictionaryService.insert(dictionary);
            //如果字典表新增数据的话,把数据再重新查出,放入监听器中
            List<DictionaryEntity> dictionaryEntities = dictionaryService.selectList(new EntityWrapper<DictionaryEntity>());
            ServletContext servletContext = ContextLoader.getCurrentWebApplicationContext().getServletContext();
            Map<String, Map<Integer,String>> map = new HashMap<>();
            for(DictionaryEntity d :dictionaryEntities){
                Map<Integer, String> m = map.get(d.getDicCode());
                if(m ==null || m.isEmpty()){
                    m = new HashMap<>();
                }
                m.put(d.getCodeIndex(),d.getIndexName());
                map.put(d.getDicCode(),m);
            }
            servletContext.setAttribute("dictionaryMap",map);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody DictionaryEntity dictionary, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,dictionary:{}",this.getClass().getName(),dictionary.toString());
        //根据字段查询是否有相同数据
        Wrapper<DictionaryEntity> queryWrapper = new EntityWrapper<DictionaryEntity>()
            .notIn("id",dictionary.getId())
            .eq("dic_code", dictionary.getDicCode())
            .eq("code_index", dictionary.getCodeIndex())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        DictionaryEntity dictionaryEntity = dictionaryService.selectOne(queryWrapper);
        if(dictionaryEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      dictionary.set
            //  }
            dictionaryService.updateById(dictionary);//根据id更新
            //如果字典表修改数据的话,把数据再重新查出,放入监听器中
            List<DictionaryEntity> dictionaryEntities = dictionaryService.selectList(new EntityWrapper<DictionaryEntity>());
            ServletContext servletContext = ContextLoader.getCurrentWebApplicationContext().getServletContext();
            Map<String, Map<Integer,String>> map = new HashMap<>();
            for(DictionaryEntity d :dictionaryEntities){
                Map<Integer, String> m = map.get(d.getDicCode());
                if(m ==null || m.isEmpty()){
                    m = new HashMap<>();
                }
                m.put(d.getCodeIndex(),d.getIndexName());
                map.put(d.getDicCode(),m);
            }
            servletContext.setAttribute("dictionaryMap",map);
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
        dictionaryService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }



}

