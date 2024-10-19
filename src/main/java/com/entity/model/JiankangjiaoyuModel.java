package com.entity.model;

import com.entity.JiankangjiaoyuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 健康教育
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiankangjiaoyuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 健康教育标题
     */
    private String jiankangjiaoyuName;


    /**
     * 健康教育类型
     */
    private Integer jiankangjiaoyuTypes;


    /**
     * 健康教育图片
     */
    private String jiankangjiaoyuPhoto;


    /**
     * 健康教育时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 健康教育详情
     */
    private String jiankangjiaoyuContent;


    /**
     * 假删
     */
    private Integer jiankangjiaoyuDelete;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：健康教育标题
	 */
    public String getJiankangjiaoyuName() {
        return jiankangjiaoyuName;
    }


    /**
	 * 设置：健康教育标题
	 */
    public void setJiankangjiaoyuName(String jiankangjiaoyuName) {
        this.jiankangjiaoyuName = jiankangjiaoyuName;
    }
    /**
	 * 获取：健康教育类型
	 */
    public Integer getJiankangjiaoyuTypes() {
        return jiankangjiaoyuTypes;
    }


    /**
	 * 设置：健康教育类型
	 */
    public void setJiankangjiaoyuTypes(Integer jiankangjiaoyuTypes) {
        this.jiankangjiaoyuTypes = jiankangjiaoyuTypes;
    }
    /**
	 * 获取：健康教育图片
	 */
    public String getJiankangjiaoyuPhoto() {
        return jiankangjiaoyuPhoto;
    }


    /**
	 * 设置：健康教育图片
	 */
    public void setJiankangjiaoyuPhoto(String jiankangjiaoyuPhoto) {
        this.jiankangjiaoyuPhoto = jiankangjiaoyuPhoto;
    }
    /**
	 * 获取：健康教育时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：健康教育时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：健康教育详情
	 */
    public String getJiankangjiaoyuContent() {
        return jiankangjiaoyuContent;
    }


    /**
	 * 设置：健康教育详情
	 */
    public void setJiankangjiaoyuContent(String jiankangjiaoyuContent) {
        this.jiankangjiaoyuContent = jiankangjiaoyuContent;
    }
    /**
	 * 获取：假删
	 */
    public Integer getJiankangjiaoyuDelete() {
        return jiankangjiaoyuDelete;
    }


    /**
	 * 设置：假删
	 */
    public void setJiankangjiaoyuDelete(Integer jiankangjiaoyuDelete) {
        this.jiankangjiaoyuDelete = jiankangjiaoyuDelete;
    }
    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
