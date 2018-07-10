package com.yiminwu.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.yiminwu.model.Brand;

@Mapper
public interface BrandMapperCustom extends CustomMapper<Brand, Integer> {
    
}