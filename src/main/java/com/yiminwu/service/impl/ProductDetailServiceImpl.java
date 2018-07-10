package com.yiminwu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yiminwu.mapper.BaseMapper;
import com.yiminwu.mapper.CustomMapper;
import com.yiminwu.mapper.ProductDetailMapper;
import com.yiminwu.model.ProductDetail;
import com.yiminwu.service.ProductDetailService;

@Service
public class ProductDetailServiceImpl extends BaseServiceImpl<ProductDetail, Long> 
   implements ProductDetailService {

   @Autowired
   private ProductDetailMapper productDetailMapper;

   @Override
   protected BaseMapper<ProductDetail, Long> getMapper() {
      return productDetailMapper;
   }

   @Override
   protected CustomMapper<ProductDetail, Long> getCustomMapper() {
      // TODO Auto-generated method stub
      return null;
   }

   
}
