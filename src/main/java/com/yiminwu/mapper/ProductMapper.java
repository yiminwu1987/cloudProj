package com.yiminwu.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.yiminwu.model.Product;

@Mapper
public interface ProductMapper extends BaseMapper<Product, Long>{
    
}