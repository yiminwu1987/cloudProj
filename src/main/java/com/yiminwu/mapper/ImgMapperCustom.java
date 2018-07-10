package com.yiminwu.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ImgMapperCustom {
   
   int deleteByPath(String path);
    
}