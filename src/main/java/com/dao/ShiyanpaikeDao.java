package com.dao;

import com.entity.ShiyanpaikeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanpaikeView;

/**
 * 实验排课 Dao 接口
 *
 * @author 
 * @since 2021-04-14
 */
public interface ShiyanpaikeDao extends BaseMapper<ShiyanpaikeEntity> {

   List<ShiyanpaikeView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
