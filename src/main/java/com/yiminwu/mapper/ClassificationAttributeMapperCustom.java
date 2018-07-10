package com.yiminwu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.yiminwu.model.ClassificationAttribute;

@Mapper
public interface ClassificationAttributeMapperCustom {
    
   List<ClassificationAttribute> getListByClassificationId(Integer classificationId);

   List<ClassificationAttribute> selectByNameByClassificationId(@Param(value="name") String name, @Param(value="classificationId") Integer classificationId);

    
}