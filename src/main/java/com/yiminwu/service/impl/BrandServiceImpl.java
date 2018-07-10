package com.yiminwu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yiminwu.mapper.BaseMapper;
import com.yiminwu.mapper.BrandMapper;
import com.yiminwu.mapper.BrandMapperCustom;
import com.yiminwu.mapper.CustomMapper;
import com.yiminwu.model.Brand;
import com.yiminwu.service.BrandService;;

@Service
public class BrandServiceImpl extends BaseServiceImpl<Brand, Integer> 
   implements BrandService {

   @Autowired
   private BrandMapper brandMapper;
   
   @Autowired
   private BrandMapperCustom brandMapperCustom;


   @Override
   protected BaseMapper<Brand, Integer> getMapper() {
      return brandMapper;
   }

   @Override
   protected CustomMapper<Brand, Integer> getCustomMapper() {
      return brandMapperCustom;
   }
   
}
