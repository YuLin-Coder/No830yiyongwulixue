package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NewsEntity;
import java.util.Map;

/**
 * 在线帮助 服务类
 * @author 
 * @since 2021-04-14
 */
public interface NewsService extends IService<NewsEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}