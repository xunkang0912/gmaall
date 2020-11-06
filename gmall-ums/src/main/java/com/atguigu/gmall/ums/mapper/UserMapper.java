package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author xunk
 * @email 2944842127@qq.com
 * @date 2020-10-30 15:34:14
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
