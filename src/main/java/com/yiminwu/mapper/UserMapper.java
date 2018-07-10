package com.yiminwu.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.yiminwu.model.User;


@Mapper
public interface UserMapper extends BaseMapper<User, Integer>{
   
}