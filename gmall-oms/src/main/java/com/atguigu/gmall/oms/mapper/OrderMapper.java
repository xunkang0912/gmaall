package com.atguigu.gmall.oms.mapper;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xunk
 * @email 2944842127@qq.com
 * @date 2020-10-30 15:17:42
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
	
}
