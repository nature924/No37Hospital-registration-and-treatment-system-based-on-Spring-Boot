package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangjiaoyuEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 健康教育 服务类
 */
public interface JiankangjiaoyuService extends IService<JiankangjiaoyuEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}