package com.dao;

import com.entity.ShiyanshujuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanshujuView;

/**
 * 实验数据 Dao 接口
 *
 * @author 
 * @since 2021-04-14
 */
public interface ShiyanshujuDao extends BaseMapper<ShiyanshujuEntity> {

   List<ShiyanshujuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
