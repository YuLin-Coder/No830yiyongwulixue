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

import com.entity.YonghuEntity;

import com.service.YonghuService;
import com.entity.view.YonghuView;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 学生
 * 后端接口
 * @author
 * @email
 * @date 2021-04-14
*/
@RestController
@Controller
@RequestMapping("/yonghu")
public class YonghuController {
    private static final Logger logger = LoggerFactory.getLogger(YonghuController.class);

    @Autowired
    private YonghuService yonghuService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        params.put("orderBy","id");
        PageUtils page = yonghuService.queryPage(params);

        //字典表数据转换
        List<YonghuView> list =(List<YonghuView>)page.getList();
        for(YonghuView c:list){
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
        YonghuEntity yonghu = yonghuService.selectById(id);
        if(yonghu !=null){
            //entity转view
            YonghuView view = new YonghuView();
            BeanUtils.copyProperties( yonghu , view );//把实体数据重构到view中

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
    public R save(@RequestBody YonghuEntity yonghu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,yonghu:{}",this.getClass().getName(),yonghu.toString());
        Wrapper<YonghuEntity> queryWrapper = new EntityWrapper<YonghuEntity>()
            .eq("username", yonghu.getUsername())
            .or()
            .eq("yonghu_phone", yonghu.getYonghuPhone())
            .or()
            .eq("yonghu_id_number", yonghu.getYonghuIdNumber());
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YonghuEntity yonghuEntity = yonghuService.selectOne(queryWrapper);
        if(yonghuEntity==null){
            yonghu.setCreateTime(new Date());
            yonghu.setPassword("123456");
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      yonghu.set
        //  }
            yonghuService.insert(yonghu);
            return R.ok();
        }else {
            return R.error(511,"账户或者身份证号或者手机号已经被使用");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody YonghuEntity yonghu, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,yonghu:{}",this.getClass().getName(),yonghu.toString());
        //根据字段查询是否有相同数据
        Wrapper<YonghuEntity> queryWrapper = new EntityWrapper<YonghuEntity>()
            .notIn("id",yonghu.getId())
            .andNew()
            .eq("username", yonghu.getUsername())
            .or()
            .eq("yonghu_phone", yonghu.getYonghuPhone())
            .or()
            .eq("yonghu_id_number", yonghu.getYonghuIdNumber());
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YonghuEntity yonghuEntity = yonghuService.selectOne(queryWrapper);
        if("".equals(yonghu.getYonghuPhoto()) || "null".equals(yonghu.getYonghuPhoto())){
                yonghu.setYonghuPhoto(null);
        }
        if(yonghuEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      yonghu.set
            //  }
            yonghuService.updateById(yonghu);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"账户或者身份证号或者手机号已经被使用");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        yonghuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

    /**
    * 登录
    */
    @IgnoreAuth
    @RequestMapping(value = "/login")
    public R login(String username, String password, String captcha, HttpServletRequest request) {
        YonghuEntity yonghu = yonghuService.selectOne(new EntityWrapper<YonghuEntity>().eq("username", username));
        if(yonghu==null || !yonghu.getPassword().equals(password)) {
            return R.error("账号或密码不正确");
        }
        String token = tokenService.generateToken(yonghu.getId(),username, "yonghu", "学生");
        R r = R.ok();
        r.put("token", token);
        r.put("role","学生");
        r.put("username",yonghu.getYonghuName());
        r.put("tableName","yonghu");
        r.put("userId",yonghu.getId());
        return r;
    }

    /**
    * 注册
    */
    @IgnoreAuth
    @PostMapping(value = "/register")
    public R register(@RequestBody YonghuEntity yonghu){
    //    	ValidatorUtils.validateEntity(user);
        if(yonghuService.selectOne(new EntityWrapper<YonghuEntity>().eq("username", yonghu.getUsername()).orNew().eq("yonghu_phone",yonghu.getYonghuPhone()).orNew().eq("yonghu_id_number",yonghu.getYonghuIdNumber())) !=null) {
            return R.error("账户已存在或手机号或身份证号已经被使用");
        }
        yonghuService.insert(yonghu);
        return R.ok();
    }

    /**
     * 重置密码
     */
    @GetMapping(value = "/resetPassword")
    public R resetPassword(Integer  id){
        YonghuEntity yonghu = new YonghuEntity();
        yonghu.setPassword("123456");
        yonghu.setId(id);
        yonghuService.updateById(yonghu);
        return R.ok();
    }

    /**
    * 获取学生的session学生信息
    */
    @RequestMapping("/session")
    public R getCurrYonghu(HttpServletRequest request){
        Integer id = (Integer)request.getSession().getAttribute("userId");
        YonghuEntity yonghu = yonghuService.selectById(id);
        return R.ok().put("data", yonghu);
    }


    /**
    * 退出
    */
    @GetMapping(value = "logout")
    public R logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return R.ok("退出成功");
    }



}

