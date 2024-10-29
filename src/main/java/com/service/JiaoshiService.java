package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshiEntity;
import java.util.Map;

/**
 * 教师 服务类
 * @author 
 * @since 2021-04-14
 */
public interface JiaoshiService extends IService<JiaoshiEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}