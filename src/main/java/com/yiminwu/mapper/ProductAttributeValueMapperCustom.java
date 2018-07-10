package com.yiminwu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yiminwu.model.ProductAttributeValue;

@Mapper
public interface ProductAttributeValueMapperCustom {
    
   List<ProductAttributeValue> getListByProductId(Long productId);

   int deleteByProductId(Long productId);
}