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
 * 健康教育
 *
 * @author 
 * @email
 */
@TableName("jiankangjiaoyu")
public class JiankangjiaoyuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiankangjiaoyuEntity() {

	}

	public JiankangjiaoyuEntity(T t) {
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
     * 健康教育标题
     */
    @TableField(value = "jiankangjiaoyu_name")

    private String jiankangjiaoyuName;


    /**
     * 健康教育类型
     */
    @TableField(value = "jiankangjiaoyu_types")

    private Integer jiankangjiaoyuTypes;


    /**
     * 健康教育图片
     */
    @TableField(value = "jiankangjiaoyu_photo")

    private String jiankangjiaoyuPhoto;


    /**
     * 健康教育时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 健康教育详情
     */
    @TableField(value = "jiankangjiaoyu_content")

    private String jiankangjiaoyuContent;


    /**
     * 假删
     */
    @TableField(value = "jiankangjiaoyu_delete")

    private Integer jiankangjiaoyuDelete;


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
	 * 设置：健康教育标题
	 */
    public String getJiankangjiaoyuName() {
        return jiankangjiaoyuName;
    }


    /**
	 * 获取：健康教育标题
	 */

    public void setJiankangjiaoyuName(String jiankangjiaoyuName) {
        this.jiankangjiaoyuName = jiankangjiaoyuName;
    }
    /**
	 * 设置：健康教育类型
	 */
    public Integer getJiankangjiaoyuTypes() {
        return jiankangjiaoyuTypes;
    }


    /**
	 * 获取：健康教育类型
	 */

    public void setJiankangjiaoyuTypes(Integer jiankangjiaoyuTypes) {
        this.jiankangjiaoyuTypes = jiankangjiaoyuTypes;
    }
    /**
	 * 设置：健康教育图片
	 */
    public String getJiankangjiaoyuPhoto() {
        return jiankangjiaoyuPhoto;
    }


    /**
	 * 获取：健康教育图片
	 */

    public void setJiankangjiaoyuPhoto(String jiankangjiaoyuPhoto) {
        this.jiankangjiaoyuPhoto = jiankangjiaoyuPhoto;
    }
    /**
	 * 设置：健康教育时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：健康教育时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：健康教育详情
	 */
    public String getJiankangjiaoyuContent() {
        return jiankangjiaoyuContent;
    }


    /**
	 * 获取：健康教育详情
	 */

    public void setJiankangjiaoyuContent(String jiankangjiaoyuContent) {
        this.jiankangjiaoyuContent = jiankangjiaoyuContent;
    }
    /**
	 * 设置：假删
	 */
    public Integer getJiankangjiaoyuDelete() {
        return jiankangjiaoyuDelete;
    }


    /**
	 * 获取：假删
	 */

    public void setJiankangjiaoyuDelete(Integer jiankangjiaoyuDelete) {
        this.jiankangjiaoyuDelete = jiankangjiaoyuDelete;
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
        return "Jiankangjiaoyu{" +
            "id=" + id +
            ", jiankangjiaoyuName=" + jiankangjiaoyuName +
            ", jiankangjiaoyuTypes=" + jiankangjiaoyuTypes +
            ", jiankangjiaoyuPhoto=" + jiankangjiaoyuPhoto +
            ", insertTime=" + insertTime +
            ", jiankangjiaoyuContent=" + jiankangjiaoyuContent +
            ", jiankangjiaoyuDelete=" + jiankangjiaoyuDelete +
            ", createTime=" + createTime +
        "}";
    }
}
