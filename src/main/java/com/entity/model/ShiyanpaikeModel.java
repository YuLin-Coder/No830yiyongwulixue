package com.entity.model;

import com.entity.ShiyanpaikeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 实验排课
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-14
 */
public class ShiyanpaikeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 课程名称
     */
    private String shiyanpaikeName;


    /**
     * 课程类型
     */
    private Integer shiyanpaikeTypes;


    /**
     * 上课时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
     * 分组
     */
    private String shiyanpaikeFenzu;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：课程名称
	 */
    public String getShiyanpaikeName() {
        return shiyanpaikeName;
    }


    /**
	 * 设置：课程名称
	 */
    public void setShiyanpaikeName(String shiyanpaikeName) {
        this.shiyanpaikeName = shiyanpaikeName;
    }
    /**
	 * 获取：课程类型
	 */
    public Integer getShiyanpaikeTypes() {
        return shiyanpaikeTypes;
    }


    /**
	 * 设置：课程类型
	 */
    public void setShiyanpaikeTypes(Integer shiyanpaikeTypes) {
        this.shiyanpaikeTypes = shiyanpaikeTypes;
    }
    /**
	 * 获取：上课时间
	 */
    public Date getShiyanpaikeTime() {
        return shiyanpaikeTime;
    }


    /**
	 * 设置：上课时间
	 */
    public void setShiyanpaikeTime(Date shiyanpaikeTime) {
        this.shiyanpaikeTime = shiyanpaikeTime;
    }
    /**
	 * 获取：上课教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 设置：上课教师
	 */
    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 获取：上课班级
	 */
    public Integer getBanjiTypes() {
        return banjiTypes;
    }


    /**
	 * 设置：上课班级
	 */
    public void setBanjiTypes(Integer banjiTypes) {
        this.banjiTypes = banjiTypes;
    }
    /**
	 * 获取：分组
	 */
    public String getShiyanpaikeFenzu() {
        return shiyanpaikeFenzu;
    }


    /**
	 * 设置：分组
	 */
    public void setShiyanpaikeFenzu(String shiyanpaikeFenzu) {
        this.shiyanpaikeFenzu = shiyanpaikeFenzu;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
