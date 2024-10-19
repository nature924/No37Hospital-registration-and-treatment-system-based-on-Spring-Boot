package com.entity.vo;

import com.entity.JiankangjiaoyuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 健康教育
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiankangjiaoyu")
public class JiankangjiaoyuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
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
     * 创建时间 show1 show2 nameShow
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
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
