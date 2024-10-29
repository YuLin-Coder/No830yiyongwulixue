package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 实验成绩
 *
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("shiyanchengji")
public class ShiyanchengjiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShiyanchengjiEntity() {

	}

	public ShiyanchengjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Shiyanchengji{" +
            "id=" + id +
            ", shiyanpaikeId=" + shiyanpaikeId +
            ", yonghuId=" + yonghuId +
            ", chengjiPingfen=" + chengjiPingfen +
            ", chengjiContent=" + chengjiContent +
            ", createTime=" + createTime +
        "}";
    }
}
