package com.yiminwu.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.yiminwu.model.Classification;

@Mapper
public interface ClassificationMapperCustom extends CustomMapper<Classification, Integer> {
    
}