package com.yiminwu.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;
import com.yiminwu.model.Brand;
import com.yiminwu.model.Classification;
import com.yiminwu.model.LayoutGroup;
import com.yiminwu.model.Product;

@Mapper
public interface LayoutGroupMapperCustom extends CustomMapper<LayoutGroup, Integer> {

   Page<Product> getProductItemList(@Param(value="id") Integer id, @Param(value="name") String name);

   Page<Classification> getClassificationItemList(@Param(value="id") Integer id, @Param(value="name") String name);

   Page<Brand> getBrandItemList(@Param(value="id") Integer id, @Param(value="name") String name);
    
}