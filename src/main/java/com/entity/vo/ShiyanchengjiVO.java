package com.entity.vo;

import com.entity.ShiyanchengjiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 实验成绩
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("shiyanchengji")
public class ShiyanchengjiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 课程名称
     */

    @TableField(value = "shiyanpaike_id")
    private Integer shiyanpaikeId;


    /**
     * 实验学生
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 评分
     */

    @TableField(value = "chengji_pingfen")
    private Integer chengjiPingfen;


    /**
     * 实验数据
     */

    @TableField(value = "chengji_content")
    private String chengjiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：课程名称
	 */
    public Integer getShiyanpaikeId() {
        return shiyanpaikeId;
    }


    /**
	 * 获取：课程名称
	 */

    public void setShiyanpaikeId(Integer shiyanpaikeId) {
        this.shiyanpaikeId = shiyanpaikeId;
    }
    /**
	 * 设置：实验学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：实验学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：评分
	 */
    public Integer getChengjiPingfen() {
        return chengjiPingfen;
    }


    /**
	 * 获取：评分
	 */

    public void setChengjiPingfen(Integer chengjiPingfen) {
        this.chengjiPingfen = chengjiPingfen;
    }
    /**
	 * 设置：实验数据
	 */
    public String getChengjiContent() {
        return chengjiContent;
    }


    /**
	 * 获取：实验数据
	 */

    public void setChengjiContent(String chengjiContent) {
        this.chengjiContent = chengjiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
