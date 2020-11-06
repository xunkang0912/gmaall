package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.sms.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author xunk
 * @email 2944842127@qq.com
 * @date 2020-10-30 14:47:06
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

