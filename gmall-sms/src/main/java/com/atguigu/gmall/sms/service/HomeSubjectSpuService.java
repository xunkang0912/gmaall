package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.sms.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author xunk
 * @email 2944842127@qq.com
 * @date 2020-10-30 14:47:06
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

