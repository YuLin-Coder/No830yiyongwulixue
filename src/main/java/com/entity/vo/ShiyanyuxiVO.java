package com.entity.vo;

import com.entity.ShiyanyuxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 实验预习
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("shiyanyuxi")
public class ShiyanyuxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
