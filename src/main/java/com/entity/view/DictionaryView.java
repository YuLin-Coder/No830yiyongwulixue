package com.entity.view;

import com.entity.DictionaryEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 字典表
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("dictionary")
public class DictionaryView extends DictionaryEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 父字段id的值
		*/
		private String superValue;



	public DictionaryView() {

	}

	public DictionaryView(DictionaryEntity dictionaryEntity) {
		try {
			BeanUtils.copyProperties(this, dictionaryEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 父字段id的值
			*/
			public String getSuperValue() {
				return superValue;
			}
			/**
			* 设置： 父字段id的值
			*/
			public void setSuperValue(String superValue) {
				this.superValue = superValue;
			}












}
