package com.entity.view;

import com.entity.ShiyanshujuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 实验数据
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("shiyanshuju")
public class ShiyanshujuView extends ShiyanshujuEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 shiyanpaike
			/**
			* 课程名称
			*/
			private String shiyanpaikeName;
			/**
			* 课程类型
			*/
			private Integer shiyanpaikeTypes;
				/**
				* 课程类型的值
				*/
				private String shiyanpaikeValue;
			/**
			* 上课时间
			*/
			private Date shiyanpaikeTime;
			/**
			* 上课教师
			*/
			private Integer jiaoshiId;
			/**
			* 上课班级
			*/
			private Integer banjiTypes;
				/**
				* 上课班级的值
				*/
				private String banjiValue;
			/**
			* 分组
			*/
			private String shiyanpaikeFenzu;

	public ShiyanshujuView() {

	}

	public ShiyanshujuView(ShiyanshujuEntity shiyanshujuEntity) {
		try {
			BeanUtils.copyProperties(this, shiyanshujuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

















				//级联表的get和set shiyanpaike
					/**
					* 获取： 课程名称
					*/
					public String getShiyanpaikeName() {
						return shiyanpaikeName;
					}
					/**
					* 设置： 课程名称
					*/
					public void setShiyanpaikeName(String shiyanpaikeName) {
						this.shiyanpaikeName = shiyanpaikeName;
					}
					/**
					* 获取： 课程类型
					*/
					public Integer getShiyanpaikeTypes() {
						return shiyanpaikeTypes;
					}
					/**
					* 设置： 课程类型
					*/
					public void setShiyanpaikeTypes(Integer shiyanpaikeTypes) {
						this.shiyanpaikeTypes = shiyanpaikeTypes;
					}


						/**
						* 获取： 课程类型的值
						*/
						public String getShiyanpaikeValue() {
							return shiyanpaikeValue;
						}
						/**
						* 设置： 课程类型的值
						*/
						public void setShiyanpaikeValue(String shiyanpaikeValue) {
							this.shiyanpaikeValue = shiyanpaikeValue;
						}
					/**
					* 获取： 上课时间
					*/
					public Date getShiyanpaikeTime() {
						return shiyanpaikeTime;
					}
					/**
					* 设置： 上课时间
					*/
					public void setShiyanpaikeTime(Date shiyanpaikeTime) {
						this.shiyanpaikeTime = shiyanpaikeTime;
					}
					/**
					* 获取： 上课教师
					*/
					public Integer getJiaoshiId() {
						return jiaoshiId;
					}
					/**
					* 设置： 上课教师
					*/
					public void setJiaoshiId(Integer jiaoshiId) {
						this.jiaoshiId = jiaoshiId;
					}
					/**
					* 获取： 上课班级
					*/
					public Integer getBanjiTypes() {
						return banjiTypes;
					}
					/**
					* 设置： 上课班级
					*/
					public void setBanjiTypes(Integer banjiTypes) {
						this.banjiTypes = banjiTypes;
					}


						/**
						* 获取： 上课班级的值
						*/
						public String getBanjiValue() {
							return banjiValue;
						}
						/**
						* 设置： 上课班级的值
						*/
						public void setBanjiValue(String banjiValue) {
							this.banjiValue = banjiValue;
						}
					/**
					* 获取： 分组
					*/
					public String getShiyanpaikeFenzu() {
						return shiyanpaikeFenzu;
					}
					/**
					* 设置： 分组
					*/
					public void setShiyanpaikeFenzu(String shiyanpaikeFenzu) {
						this.shiyanpaikeFenzu = shiyanpaikeFenzu;
					}








}
