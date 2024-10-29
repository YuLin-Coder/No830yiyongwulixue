package com.entity.vo;

import com.entity.ShiyanpaikeEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 实验排课
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("shiyanpaike")
public class ShiyanpaikeVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 课程名称
     */

    @TableField(value = "shiyanpaike_name")
    private String shiyanpaikeName;


    /**
     * 课程类型
     */

    @TableField(value = "shiyanpaike_types")
    private Integer shiyanpaikeTypes;


    /**
     * 上课时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "shiyanpaike_time")
    private Date shiyanpaikeTime;


    /**
     * 上课教师
     */

    @TableField(value = "jiaoshi_id")
    private Integer jiaoshiId;


    /**
     * 上课班级
     */

    @TableField(value = "banji_types")
    private Integer banjiTypes;


    /**
     * 分组
     */

    @TableField(value = "shiyanpaike_fenzu")
    private String shiyanpaikeFenzu;


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
    public String getShiyanpaikeName() {
        return shiyanpaikeName;
    }


    /**
	 * 获取：课程名称
	 */

    public void setShiyanpaikeName(String shiyanpaikeName) {
        this.shiyanpaikeName = shiyanpaikeName;
    }
    /**
	 * 设置：课程类型
	 */
    public Integer getShiyanpaikeTypes() {
        return shiyanpaikeTypes;
    }


    /**
	 * 获取：课程类型
	 */

    public void setShiyanpaikeTypes(Integer shiyanpaikeTypes) {
        this.shiyanpaikeTypes = shiyanpaikeTypes;
    }
    /**
	 * 设置：上课时间
	 */
    public Date getShiyanpaikeTime() {
        return shiyanpaikeTime;
    }


    /**
	 * 获取：上课时间
	 */

    public void setShiyanpaikeTime(Date shiyanpaikeTime) {
        this.shiyanpaikeTime = shiyanpaikeTime;
    }
    /**
	 * 设置：上课教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：上课教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：上课班级
	 */
    public Integer getBanjiTypes() {
        return banjiTypes;
    }


    /**
	 * 获取：上课班级
	 */

    public void setBanjiTypes(Integer banjiTypes) {
        this.banjiTypes = banjiTypes;
    }
    /**
	 * 设置：分组
	 */
    public String getShiyanpaikeFenzu() {
        return shiyanpaikeFenzu;
    }


    /**
	 * 获取：分组
	 */

    public void setShiyanpaikeFenzu(String shiyanpaikeFenzu) {
        this.shiyanpaikeFenzu = shiyanpaikeFenzu;
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
