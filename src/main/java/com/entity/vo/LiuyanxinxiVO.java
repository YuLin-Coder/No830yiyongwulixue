package com.entity.vo;

import com.entity.LiuyanxinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 留言
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("liuyanxinxi")
public class LiuyanxinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * id
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 留言信息
     */

    @TableField(value = "note")
    private String note;


    /**
     * 留言人
     */

    @TableField(value = "yhnote")
    private String yhnote;


    /**
     * 留言时间 Search
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "note_time")
    private Date noteTime;


    /**
     * 回复
     */

    @TableField(value = "reply")
    private String reply;


    /**
     * 回复人
     */

    @TableField(value = "glreply")
    private String glreply;


    /**
     * 回复时间 Search
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "reply_time")
    private Date replyTime;


    /**
	 * 设置：id
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：id
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：留言信息
	 */
    public String getNote() {
        return note;
    }


    /**
	 * 获取：留言信息
	 */

    public void setNote(String note) {
        this.note = note;
    }
    /**
	 * 设置：留言人
	 */
    public String getYhnote() {
        return yhnote;
    }


    /**
	 * 获取：留言人
	 */

    public void setYhnote(String yhnote) {
        this.yhnote = yhnote;
    }
    /**
	 * 设置：留言时间 Search
	 */
    public Date getNoteTime() {
        return noteTime;
    }


    /**
	 * 获取：留言时间 Search
	 */

    public void setNoteTime(Date noteTime) {
        this.noteTime = noteTime;
    }
    /**
	 * 设置：回复
	 */
    public String getReply() {
        return reply;
    }


    /**
	 * 获取：回复
	 */

    public void setReply(String reply) {
        this.reply = reply;
    }
    /**
	 * 设置：回复人
	 */
    public String getGlreply() {
        return glreply;
    }


    /**
	 * 获取：回复人
	 */

    public void setGlreply(String glreply) {
        this.glreply = glreply;
    }
    /**
	 * 设置：回复时间 Search
	 */
    public Date getReplyTime() {
        return replyTime;
    }


    /**
	 * 获取：回复时间 Search
	 */

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

}
