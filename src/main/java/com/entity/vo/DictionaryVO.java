package com.entity.vo;

import com.entity.DictionaryEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 字典表
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-14
 */
@TableName("dictionary")
public class DictionaryVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 字段
     */

    @TableField(value = "dic_code")
    private String dicCode;


    /**
     * 字段名
     */

    @TableField(value = "dic_name")
    private String dicName;


    /**
     * 编码
     */

    @TableField(value = "code_index")
    private Integer codeIndex;


    /**
     * 编码名字
     */

    @TableField(value = "index_name")
    private String indexName;


    /**
     * 父字段id
     */

    @TableField(value = "super_types")
    private Integer superTypes;


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
	 * 设置：字段
	 */
    public String getDicCode() {
        return dicCode;
    }


    /**
	 * 获取：字段
	 */

    public void setDicCode(String dicCode) {
        this.dicCode = dicCode;
    }
    /**
	 * 设置：字段名
	 */
    public String getDicName() {
        return dicName;
    }


    /**
	 * 获取：字段名
	 */

    public void setDicName(String dicName) {
        this.dicName = dicName;
    }
    /**
	 * 设置：编码
	 */
    public Integer getCodeIndex() {
        return codeIndex;
    }


    /**
	 * 获取：编码
	 */

    public void setCodeIndex(Integer codeIndex) {
        this.codeIndex = codeIndex;
    }
    /**
	 * 设置：编码名字
	 */
    public String getIndexName() {
        return indexName;
    }


    /**
	 * 获取：编码名字
	 */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }
    /**
	 * 设置：父字段id
	 */
    public Integer getSuperTypes() {
        return superTypes;
    }


    /**
	 * 获取：父字段id
	 */

    public void setSuperTypes(Integer superTypes) {
        this.superTypes = superTypes;
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
