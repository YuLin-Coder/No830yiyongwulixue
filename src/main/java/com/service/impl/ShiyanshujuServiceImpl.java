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

import com.dao.ShiyanshujuDao;
import com.entity.ShiyanshujuEntity;
import com.service.ShiyanshujuService;
import com.entity.view.ShiyanshujuView;

/**
 * 实验数据 服务实现类
 * @author 
 * @since 2021-04-14
 */
@Service("shiyanshujuService")
@Transactional
public class ShiyanshujuServiceImpl extends ServiceImpl<ShiyanshujuDao, ShiyanshujuEntity> implements ShiyanshujuService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ShiyanshujuView> page =new Query<ShiyanshujuView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
