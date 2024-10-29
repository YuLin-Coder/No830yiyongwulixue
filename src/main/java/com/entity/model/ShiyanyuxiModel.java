package com.entity.model;

import com.entity.ShiyanyuxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 实验预习
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-14
 */
public class ShiyanyuxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 预习课程
     */
    private Integer shiyanpaikeId;


    /**
     * 实验目的
     */
    private String shiyanyuxiMudi;


    /**
     * 实验要求
     */
    private String shiyanyuxiYiqiu;


    /**
     * 熟悉仪器
     */
    private String shiyanyuxiShuxi;


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
	 * 获取：预习课程
	 */
    public Integer getShiyanpaikeId() {
        return shiyanpaikeId;
    }


    /**
	 * 设置：预习课程
	 */
    public void setShiyanpaikeId(Integer shiyanpaikeId) {
        this.shiyanpaikeId = shiyanpaikeId;
    }
    /**
	 * 获取：实验目的
	 */
    public String getShiyanyuxiMudi() {
        return shiyanyuxiMudi;
    }


    /**
	 * 设置：实验目的
	 */
    public void setShiyanyuxiMudi(String shiyanyuxiMudi) {
        this.shiyanyuxiMudi = shiyanyuxiMudi;
    }
    /**
	 * 获取：实验要求
	 */
    public String getShiyanyuxiYiqiu() {
        return shiyanyuxiYiqiu;
    }


    /**
	 * 设置：实验要求
	 */
    public void setShiyanyuxiYiqiu(String shiyanyuxiYiqiu) {
        this.shiyanyuxiYiqiu = shiyanyuxiYiqiu;
    }
    /**
	 * 获取：熟悉仪器
	 */
    public String getShiyanyuxiShuxi() {
        return shiyanyuxiShuxi;
    }


    /**
	 * 设置：熟悉仪器
	 */
    public void setShiyanyuxiShuxi(String shiyanyuxiShuxi) {
        this.shiyanyuxiShuxi = shiyanyuxiShuxi;
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
