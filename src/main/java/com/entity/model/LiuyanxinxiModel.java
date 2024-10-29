package com.entity.model;

import com.entity.LiuyanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 留言
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-14
 */
public class LiuyanxinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * id
     */
    private Integer id;


    /**
     * 留言信息
     */
    private String note;


    /**
     * 留言人
     */
    private String yhnote;


    /**
     * 留言时间 Search
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date noteTime;


    /**
     * 回复
     */
    private String reply;


    /**
     * 回复人
     */
    private String glreply;


    /**
     * 回复时间 Search
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date replyTime;


    /**
	 * 获取：id
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：id
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：留言信息
	 */
    public String getNote() {
        return note;
    }


    /**
	 * 设置：留言信息
	 */
    public void setNote(String note) {
        this.note = note;
    }
    /**
	 * 获取：留言人
	 */
    public String getYhnote() {
        return yhnote;
    }


    /**
	 * 设置：留言人
	 */
    public void setYhnote(String yhnote) {
        this.yhnote = yhnote;
    }
    /**
	 * 获取：留言时间 Search
	 */
    public Date getNoteTime() {
        return noteTime;
    }


    /**
	 * 设置：留言时间 Search
	 */
    public void setNoteTime(Date noteTime) {
        this.noteTime = noteTime;
    }
    /**
	 * 获取：回复
	 */
    public String getReply() {
        return reply;
    }


    /**
	 * 设置：回复
	 */
    public void setReply(String reply) {
        this.reply = reply;
    }
    /**
	 * 获取：回复人
	 */
    public String getGlreply() {
        return glreply;
    }


    /**
	 * 设置：回复人
	 */
    public void setGlreply(String glreply) {
        this.glreply = glreply;
    }
    /**
	 * 获取：回复时间 Search
	 */
    public Date getReplyTime() {
        return replyTime;
    }


    /**
	 * 设置：回复时间 Search
	 */
    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    }
