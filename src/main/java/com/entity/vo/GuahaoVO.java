package com.entity.vo;

import com.entity.GuahaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 挂号
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("guahao")
public class GuahaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 医生
     */

    @TableField(value = "yisheng_id")
    private Integer yishengId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 就诊识别码
     */

    @TableField(value = "guahao_uuin_number")
    private String guahaoUuinNumber;


    /**
     * 挂号时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "guahao_time")
    private Date guahaoTime;


    /**
     * 时间类型
     */

    @TableField(value = "guahao_types")
    private Integer guahaoTypes;


    /**
     * 挂号状态
     */

    @TableField(value = "guahao_status_types")
    private Integer guahaoStatusTypes;


    /**
     * 挂号审核
     */

    @TableField(value = "guahao_yesno_types")
    private Integer guahaoYesnoTypes;


    /**
     * 审核结果
     */

    @TableField(value = "guahao_yesno_text")
    private String guahaoYesnoText;


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
	 * 设置：医生
	 */
    public Integer getYishengId() {
        return yishengId;
    }


    /**
	 * 获取：医生
	 */

    public void setYishengId(Integer yishengId) {
        this.yishengId = yishengId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：就诊识别码
	 */
    public String getGuahaoUuinNumber() {
        return guahaoUuinNumber;
    }


    /**
	 * 获取：就诊识别码
	 */

    public void setGuahaoUuinNumber(String guahaoUuinNumber) {
        this.guahaoUuinNumber = guahaoUuinNumber;
    }
    /**
	 * 设置：挂号时间
	 */
    public Date getGuahaoTime() {
        return guahaoTime;
    }


    /**
	 * 获取：挂号时间
	 */

    public void setGuahaoTime(Date guahaoTime) {
        this.guahaoTime = guahaoTime;
    }
    /**
	 * 设置：时间类型
	 */
    public Integer getGuahaoTypes() {
        return guahaoTypes;
    }


    /**
	 * 获取：时间类型
	 */

    public void setGuahaoTypes(Integer guahaoTypes) {
        this.guahaoTypes = guahaoTypes;
    }
    /**
	 * 设置：挂号状态
	 */
    public Integer getGuahaoStatusTypes() {
        return guahaoStatusTypes;
    }


    /**
	 * 获取：挂号状态
	 */

    public void setGuahaoStatusTypes(Integer guahaoStatusTypes) {
        this.guahaoStatusTypes = guahaoStatusTypes;
    }
    /**
	 * 设置：挂号审核
	 */
    public Integer getGuahaoYesnoTypes() {
        return guahaoYesnoTypes;
    }


    /**
	 * 获取：挂号审核
	 */

    public void setGuahaoYesnoTypes(Integer guahaoYesnoTypes) {
        this.guahaoYesnoTypes = guahaoYesnoTypes;
    }
    /**
	 * 设置：审核结果
	 */
    public String getGuahaoYesnoText() {
        return guahaoYesnoText;
    }


    /**
	 * 获取：审核结果
	 */

    public void setGuahaoYesnoText(String guahaoYesnoText) {
        this.guahaoYesnoText = guahaoYesnoText;
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
