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
 * 实验数据
 *
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("shiyanshuju")
public class ShiyanshujuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShiyanshujuEntity() {

	}

	public ShiyanshujuEntity(T t) {
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
     * 原理与方法
     */
    @TableField(value = "shiyanshuju_yuanli")

    private String shiyanshujuYuanli;


    /**
     * 使用仪器
     */
    @TableField(value = "shiyanshuju_yiqi")

    private String shiyanshujuYiqi;


    /**
     * 实验步骤
     */
    @TableField(value = "shiyanshuju_buzou")

    private String shiyanshujuBuzou;


    /**
     * 实验数据处理
     */
    @TableField(value = "shiyanshuju_content")

    private String shiyanshujuContent;


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
	 * 设置：原理与方法
	 */
    public String getShiyanshujuYuanli() {
        return shiyanshujuYuanli;
    }


    /**
	 * 获取：原理与方法
	 */

    public void setShiyanshujuYuanli(String shiyanshujuYuanli) {
        this.shiyanshujuYuanli = shiyanshujuYuanli;
    }
    /**
	 * 设置：使用仪器
	 */
    public String getShiyanshujuYiqi() {
        return shiyanshujuYiqi;
    }


    /**
	 * 获取：使用仪器
	 */

    public void setShiyanshujuYiqi(String shiyanshujuYiqi) {
        this.shiyanshujuYiqi = shiyanshujuYiqi;
    }
    /**
	 * 设置：实验步骤
	 */
    public String getShiyanshujuBuzou() {
        return shiyanshujuBuzou;
    }


    /**
	 * 获取：实验步骤
	 */

    public void setShiyanshujuBuzou(String shiyanshujuBuzou) {
        this.shiyanshujuBuzou = shiyanshujuBuzou;
    }
    /**
	 * 设置：实验数据处理
	 */
    public String getShiyanshujuContent() {
        return shiyanshujuContent;
    }


    /**
	 * 获取：实验数据处理
	 */

    public void setShiyanshujuContent(String shiyanshujuContent) {
        this.shiyanshujuContent = shiyanshujuContent;
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
        return "Shiyanshuju{" +
            "id=" + id +
            ", shiyanpaikeId=" + shiyanpaikeId +
            ", shiyanshujuYuanli=" + shiyanshujuYuanli +
            ", shiyanshujuYiqi=" + shiyanshujuYiqi +
            ", shiyanshujuBuzou=" + shiyanshujuBuzou +
            ", shiyanshujuContent=" + shiyanshujuContent +
            ", createTime=" + createTime +
        "}";
    }
}
