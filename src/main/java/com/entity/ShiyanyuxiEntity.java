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
 * 实验预习
 *
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("shiyanyuxi")
public class ShiyanyuxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShiyanyuxiEntity() {

	}

	public ShiyanyuxiEntity(T t) {
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
     * 预习课程
     */
    @TableField(value = "shiyanpaike_id")

    private Integer shiyanpaikeId;


    /**
     * 实验目的
     */
    @TableField(value = "shiyanyuxi_mudi")

    private String shiyanyuxiMudi;


    /**
     * 实验要求
     */
    @TableField(value = "shiyanyuxi_yiqiu")

    private String shiyanyuxiYiqiu;


    /**
     * 熟悉仪器
     */
    @TableField(value = "shiyanyuxi_shuxi")

    private String shiyanyuxiShuxi;


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
	 * 设置：预习课程
	 */
    public Integer getShiyanpaikeId() {
        return shiyanpaikeId;
    }


    /**
	 * 获取：预习课程
	 */

    public void setShiyanpaikeId(Integer shiyanpaikeId) {
        this.shiyanpaikeId = shiyanpaikeId;
    }
    /**
	 * 设置：实验目的
	 */
    public String getShiyanyuxiMudi() {
        return shiyanyuxiMudi;
    }


    /**
	 * 获取：实验目的
	 */

    public void setShiyanyuxiMudi(String shiyanyuxiMudi) {
        this.shiyanyuxiMudi = shiyanyuxiMudi;
    }
    /**
	 * 设置：实验要求
	 */
    public String getShiyanyuxiYiqiu() {
        return shiyanyuxiYiqiu;
    }


    /**
	 * 获取：实验要求
	 */

    public void setShiyanyuxiYiqiu(String shiyanyuxiYiqiu) {
        this.shiyanyuxiYiqiu = shiyanyuxiYiqiu;
    }
    /**
	 * 设置：熟悉仪器
	 */
    public String getShiyanyuxiShuxi() {
        return shiyanyuxiShuxi;
    }


    /**
	 * 获取：熟悉仪器
	 */

    public void setShiyanyuxiShuxi(String shiyanyuxiShuxi) {
        this.shiyanyuxiShuxi = shiyanyuxiShuxi;
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
        return "Shiyanyuxi{" +
            "id=" + id +
            ", shiyanpaikeId=" + shiyanpaikeId +
            ", shiyanyuxiMudi=" + shiyanyuxiMudi +
            ", shiyanyuxiYiqiu=" + shiyanyuxiYiqiu +
            ", shiyanyuxiShuxi=" + shiyanyuxiShuxi +
            ", createTime=" + createTime +
        "}";
    }
}
