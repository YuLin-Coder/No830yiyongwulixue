package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.ShiyanpaikeDao;
import com.entity.ShiyanpaikeEntity;
import com.service.ShiyanpaikeService;
import com.entity.view.ShiyanpaikeView;

/**
 * 实验排课 服务实现类
 * @author 
 * @since 2021-04-14
 */
@Service("shiyanpaikeService")
@Transactional
public class ShiyanpaikeServiceImpl extends ServiceImpl<ShiyanpaikeDao, ShiyanpaikeEntity> implements ShiyanpaikeService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ShiyanpaikeView> page =new Query<ShiyanpaikeView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
