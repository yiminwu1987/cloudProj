package com.yiminwu.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.yiminwu.model.User;

@Mapper
public interface UserMapperCustom extends CustomMapper<User, Integer> {
   
}