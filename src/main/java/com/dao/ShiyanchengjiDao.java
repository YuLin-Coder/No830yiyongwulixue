package com.dao;

import com.entity.ShiyanchengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanchengjiView;

/**
 * 实验成绩 Dao 接口
 *
 * @author 
 * @since 2021-04-14
 */
public interface ShiyanchengjiDao extends BaseMapper<ShiyanchengjiEntity> {

   List<ShiyanchengjiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
