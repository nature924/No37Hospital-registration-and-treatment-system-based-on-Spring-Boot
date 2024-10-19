package com.entity.model;

import com.entity.GuahaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 挂号
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GuahaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 医生
     */
    private Integer yishengId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 就诊识别码
     */
    private Integer guahaoUuinNumber;


    /**
     * 挂号时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date guahaoTime;


    /**
     * 时间类型
     */
    private Integer guahaoTypes;


    /**
     * 挂号状态
     */
    private Integer guahaoStatusTypes;


    /**
     * 挂号审核
     */
    private Integer guahaoYesnoTypes;


    /**
     * 审核结果
     */
    private String guahaoYesnoText;


    /**
     * 创建时间
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
	 * 获取：医生
	 */
    public Integer getYishengId() {
        return yishengId;
    }


    /**
	 * 设置：医生
	 */
    public void setYishengId(Integer yishengId) {
        this.yishengId = yishengId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：就诊识别码
	 */
    public Integer getGuahaoUuinNumber() {
        return guahaoUuinNumber;
    }


    /**
	 * 设置：就诊识别码
	 */
    public void setGuahaoUuinNumber(Integer guahaoUuinNumber) {
        this.guahaoUuinNumber = guahaoUuinNumber;
    }
    /**
	 * 获取：挂号时间
	 */
    public Date getGuahaoTime() {
        return guahaoTime;
    }


    /**
	 * 设置：挂号时间
	 */
    public void setGuahaoTime(Date guahaoTime) {
        this.guahaoTime = guahaoTime;
    }
    /**
	 * 获取：时间类型
	 */
    public Integer getGuahaoTypes() {
        return guahaoTypes;
    }


    /**
	 * 设置：时间类型
	 */
    public void setGuahaoTypes(Integer guahaoTypes) {
        this.guahaoTypes = guahaoTypes;
    }
    /**
	 * 获取：挂号状态
	 */
    public Integer getGuahaoStatusTypes() {
        return guahaoStatusTypes;
    }


    /**
	 * 设置：挂号状态
	 */
    public void setGuahaoStatusTypes(Integer guahaoStatusTypes) {
        this.guahaoStatusTypes = guahaoStatusTypes;
    }
    /**
	 * 获取：挂号审核
	 */
    public Integer getGuahaoYesnoTypes() {
        return guahaoYesnoTypes;
    }


    /**
	 * 设置：挂号审核
	 */
    public void setGuahaoYesnoTypes(Integer guahaoYesnoTypes) {
        this.guahaoYesnoTypes = guahaoYesnoTypes;
    }
    /**
	 * 获取：审核结果
	 */
    public String getGuahaoYesnoText() {
        return guahaoYesnoText;
    }


    /**
	 * 设置：审核结果
	 */
    public void setGuahaoYesnoText(String guahaoYesnoText) {
        this.guahaoYesnoText = guahaoYesnoText;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
