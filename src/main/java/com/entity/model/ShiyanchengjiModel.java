package com.entity.model;

import com.entity.ShiyanchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 实验成绩
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-14
 */
public class ShiyanchengjiModel implements Serializable {
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
     * 实验学生
     */
    private Integer yonghuId;


    /**
     * 评分
     */
    private Integer chengjiPingfen;


    /**
     * 实验数据
     */
    private String chengjiContent;


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
	 * 获取：实验学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：实验学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：评分
	 */
    public Integer getChengjiPingfen() {
        return chengjiPingfen;
    }


    /**
	 * 设置：评分
	 */
    public void setChengjiPingfen(Integer chengjiPingfen) {
        this.chengjiPingfen = chengjiPingfen;
    }
    /**
	 * 获取：实验数据
	 */
    public String getChengjiContent() {
        return chengjiContent;
    }


    /**
	 * 设置：实验数据
	 */
    public void setChengjiContent(String chengjiContent) {
        this.chengjiContent = chengjiContent;
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
