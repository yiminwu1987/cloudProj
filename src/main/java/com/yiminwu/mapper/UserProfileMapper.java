package com.yiminwu.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.yiminwu.model.UserProfile;

@Mapper
public interface UserProfileMapper extends BaseMapper<UserProfile, Integer>{
   
}