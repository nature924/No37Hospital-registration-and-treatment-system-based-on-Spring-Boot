package com.entity.view;

import com.entity.JiankangjiaoyuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 健康教育
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiankangjiaoyu")
public class JiankangjiaoyuView extends JiankangjiaoyuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 健康教育类型的值
		*/
		private String jiankangjiaoyuValue;



	public JiankangjiaoyuView() {

	}

	public JiankangjiaoyuView(JiankangjiaoyuEntity jiankangjiaoyuEntity) {
		try {
			BeanUtils.copyProperties(this, jiankangjiaoyuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 健康教育类型的值
			*/
			public String getJiankangjiaoyuValue() {
				return jiankangjiaoyuValue;
			}
			/**
			* 设置： 健康教育类型的值
			*/
			public void setJiankangjiaoyuValue(String jiankangjiaoyuValue) {
				this.jiankangjiaoyuValue = jiankangjiaoyuValue;
			}










}
