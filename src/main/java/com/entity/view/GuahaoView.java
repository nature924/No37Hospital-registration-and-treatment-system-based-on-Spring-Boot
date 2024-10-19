package com.entity.view;

import com.entity.GuahaoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 挂号
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("guahao")
public class GuahaoView extends GuahaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 时间类型的值
		*/
		private String guahaoValue;
		/**
		* 挂号状态的值
		*/
		private String guahaoStatusValue;
		/**
		* 挂号审核的值
		*/
		private String guahaoYesnoValue;



		//级联表 yisheng
			/**
			* 医生工号
			*/
			private String yishengUuidNumber;
			/**
			* 医生名称
			*/
			private String yishengName;
			/**
			* 科室
			*/
			private Integer yishengTypes;
				/**
				* 科室的值
				*/
				private String yishengValue;
			/**
			* 职位
			*/
			private Integer zhiweiTypes;
				/**
				* 职位的值
				*/
				private String zhiweiValue;
			/**
			* 职称
			*/
			private String yishengZhichneg;
			/**
			* 医生头像
			*/
			private String yishengPhoto;
			/**
			* 联系方式
			*/
			private String yishengPhone;
			/**
			* 挂号须知
			*/
			private String yishengGuahao;
			/**
			* 邮箱
			*/
			private String yishengEmail;
			/**
			* 挂号价格
			*/
			private Double yishengNewMoney;
			/**
			* 履历介绍
			*/
			private String yishengContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public GuahaoView() {

	}

	public GuahaoView(GuahaoEntity guahaoEntity) {
		try {
			BeanUtils.copyProperties(this, guahaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 时间类型的值
			*/
			public String getGuahaoValue() {
				return guahaoValue;
			}
			/**
			* 设置： 时间类型的值
			*/
			public void setGuahaoValue(String guahaoValue) {
				this.guahaoValue = guahaoValue;
			}
			/**
			* 获取： 挂号状态的值
			*/
			public String getGuahaoStatusValue() {
				return guahaoStatusValue;
			}
			/**
			* 设置： 挂号状态的值
			*/
			public void setGuahaoStatusValue(String guahaoStatusValue) {
				this.guahaoStatusValue = guahaoStatusValue;
			}
			/**
			* 获取： 挂号审核的值
			*/
			public String getGuahaoYesnoValue() {
				return guahaoYesnoValue;
			}
			/**
			* 设置： 挂号审核的值
			*/
			public void setGuahaoYesnoValue(String guahaoYesnoValue) {
				this.guahaoYesnoValue = guahaoYesnoValue;
			}



















				//级联表的get和set yisheng
					/**
					* 获取： 医生工号
					*/
					public String getYishengUuidNumber() {
						return yishengUuidNumber;
					}
					/**
					* 设置： 医生工号
					*/
					public void setYishengUuidNumber(String yishengUuidNumber) {
						this.yishengUuidNumber = yishengUuidNumber;
					}
					/**
					* 获取： 医生名称
					*/
					public String getYishengName() {
						return yishengName;
					}
					/**
					* 设置： 医生名称
					*/
					public void setYishengName(String yishengName) {
						this.yishengName = yishengName;
					}
					/**
					* 获取： 科室
					*/
					public Integer getYishengTypes() {
						return yishengTypes;
					}
					/**
					* 设置： 科室
					*/
					public void setYishengTypes(Integer yishengTypes) {
						this.yishengTypes = yishengTypes;
					}


						/**
						* 获取： 科室的值
						*/
						public String getYishengValue() {
							return yishengValue;
						}
						/**
						* 设置： 科室的值
						*/
						public void setYishengValue(String yishengValue) {
							this.yishengValue = yishengValue;
						}
					/**
					* 获取： 职位
					*/
					public Integer getZhiweiTypes() {
						return zhiweiTypes;
					}
					/**
					* 设置： 职位
					*/
					public void setZhiweiTypes(Integer zhiweiTypes) {
						this.zhiweiTypes = zhiweiTypes;
					}


						/**
						* 获取： 职位的值
						*/
						public String getZhiweiValue() {
							return zhiweiValue;
						}
						/**
						* 设置： 职位的值
						*/
						public void setZhiweiValue(String zhiweiValue) {
							this.zhiweiValue = zhiweiValue;
						}
					/**
					* 获取： 职称
					*/
					public String getYishengZhichneg() {
						return yishengZhichneg;
					}
					/**
					* 设置： 职称
					*/
					public void setYishengZhichneg(String yishengZhichneg) {
						this.yishengZhichneg = yishengZhichneg;
					}
					/**
					* 获取： 医生头像
					*/
					public String getYishengPhoto() {
						return yishengPhoto;
					}
					/**
					* 设置： 医生头像
					*/
					public void setYishengPhoto(String yishengPhoto) {
						this.yishengPhoto = yishengPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getYishengPhone() {
						return yishengPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYishengPhone(String yishengPhone) {
						this.yishengPhone = yishengPhone;
					}
					/**
					* 获取： 挂号须知
					*/
					public String getYishengGuahao() {
						return yishengGuahao;
					}
					/**
					* 设置： 挂号须知
					*/
					public void setYishengGuahao(String yishengGuahao) {
						this.yishengGuahao = yishengGuahao;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYishengEmail() {
						return yishengEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYishengEmail(String yishengEmail) {
						this.yishengEmail = yishengEmail;
					}
					/**
					* 获取： 挂号价格
					*/
					public Double getYishengNewMoney() {
						return yishengNewMoney;
					}
					/**
					* 设置： 挂号价格
					*/
					public void setYishengNewMoney(Double yishengNewMoney) {
						this.yishengNewMoney = yishengNewMoney;
					}
					/**
					* 获取： 履历介绍
					*/
					public String getYishengContent() {
						return yishengContent;
					}
					/**
					* 设置： 履历介绍
					*/
					public void setYishengContent(String yishengContent) {
						this.yishengContent = yishengContent;
					}




				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
