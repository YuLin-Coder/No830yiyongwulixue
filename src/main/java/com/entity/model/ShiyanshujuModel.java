package com.entity.model;

import com.entity.ShiyanshujuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 实验数据
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-14
 */
public class ShiyanshujuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 课程名称
     */
    private Integer shiyanpaikeId;


    /**
     * 原理与方法
     */
    private String shiyanshujuYuanli;


    /**
     * 使用仪器
     */
    private String shiyanshujuYiqi;


    /**
     * 实验步骤
     */
    private String shiyanshujuBuzou;


    /**
     * 实验数据处理
     */
    private String shiyanshujuContent;


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
    public Integer getShiyanpaikeId() {
        return shiyanpaikeId;
    }


    /**
	 * 设置：课程名称
	 */
    public void setShiyanpaikeId(Integer shiyanpaikeId) {
        this.shiyanpaikeId = shiyanpaikeId;
    }
    /**
	 * 获取：原理与方法
	 */
    public String getShiyanshujuYuanli() {
        return shiyanshujuYuanli;
    }


    /**
	 * 设置：原理与方法
	 */
    public void setShiyanshujuYuanli(String shiyanshujuYuanli) {
        this.shiyanshujuYuanli = shiyanshujuYuanli;
    }
    /**
	 * 获取：使用仪器
	 */
    public String getShiyanshujuYiqi() {
        return shiyanshujuYiqi;
    }


    /**
	 * 设置：使用仪器
	 */
    public void setShiyanshujuYiqi(String shiyanshujuYiqi) {
        this.shiyanshujuYiqi = shiyanshujuYiqi;
    }
    /**
	 * 获取：实验步骤
	 */
    public String getShiyanshujuBuzou() {
        return shiyanshujuBuzou;
    }


    /**
	 * 设置：实验步骤
	 */
    public void setShiyanshujuBuzou(String shiyanshujuBuzou) {
        this.shiyanshujuBuzou = shiyanshujuBuzou;
    }
    /**
	 * 获取：实验数据处理
	 */
    public String getShiyanshujuContent() {
        return shiyanshujuContent;
    }


    /**
	 * 设置：实验数据处理
	 */
    public void setShiyanshujuContent(String shiyanshujuContent) {
        this.shiyanshujuContent = shiyanshujuContent;
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
