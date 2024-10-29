package com.entity.vo;

import com.entity.NewsEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 在线帮助
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("news")
public class NewsVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 名称
     */

    @TableField(value = "news_name")
    private String newsName;


    /**
     * 图片
     */

    @TableField(value = "news_photo")
    private String newsPhoto;


    /**
     * 时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 详情
     */

    @TableField(value = "news_content")
    private String newsContent;


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
	 * 设置：名称
	 */
    public String getNewsName() {
        return newsName;
    }


    /**
	 * 获取：名称
	 */

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }
    /**
	 * 设置：图片
	 */
    public String getNewsPhoto() {
        return newsPhoto;
    }


    /**
	 * 获取：图片
	 */

    public void setNewsPhoto(String newsPhoto) {
        this.newsPhoto = newsPhoto;
    }
    /**
	 * 设置：时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：详情
	 */
    public String getNewsContent() {
        return newsContent;
    }


    /**
	 * 获取：详情
	 */

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
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
