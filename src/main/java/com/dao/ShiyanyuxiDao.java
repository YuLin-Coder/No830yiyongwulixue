package com.dao;

import com.entity.ShiyanyuxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanyuxiView;

/**
 * 实验预习 Dao 接口
 *
 * @author 
 * @since 2021-04-14
 */
public interface ShiyanyuxiDao extends BaseMapper<ShiyanyuxiEntity> {

   List<ShiyanyuxiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
