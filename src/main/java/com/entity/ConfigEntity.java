package com.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
* 类说明 : 
*/
@TableName("config")
public class ConfigEntity implements Serializable{
private static final long serialVersionUID = 1L;
	
	@TableId(type = IdType.AUTO)
	private Integer id;
	
	/**
	 * key
	 */
	private String name;
	
	/**
	 * value
	 */
	private String value;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
