package com.entity.vo;

import com.entity.ShiyanshujuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 实验数据
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("shiyanshuju")
public class ShiyanshujuVO implements Serializable {
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

}
