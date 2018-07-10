package com.yiminwu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.yiminwu.model.Product;

@Mapper
public interface ProductMapperCustom extends CustomMapper<Product, Long> {
   
   List<Product> selectByCodeNo(@Param(value="codeNo") String codeNo);

   int batchSetOnsale(@Param("ids") Long[] ids, @Param("isOnsale") boolean isOnsale);
}