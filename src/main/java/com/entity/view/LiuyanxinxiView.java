package com.entity.view;

import com.entity.LiuyanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("liuyanxinxi")
public class LiuyanxinxiView extends LiuyanxinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;



	public LiuyanxinxiView() {

	}

	public LiuyanxinxiView(LiuyanxinxiEntity liuyanxinxiEntity) {
		try {
			BeanUtils.copyProperties(this, liuyanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}















}
