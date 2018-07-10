package com.yiminwu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yiminwu.common.Result;
import com.yiminwu.model.Brand;
import com.yiminwu.service.BaseService;
import com.yiminwu.service.BrandService;
import com.yiminwu.util.ResultUtil;

@RestController
@RequestMapping("/brand")
public class BrandController extends BaseController<Brand, Integer>{
   
   @Autowired
   private BrandService brandService;
   
   @Override
   protected BaseService getService() {
      return brandService;
   }
   
   @Override
   protected Result checkOtherInfo(Brand brand) {
      if (brand.getDescription().length() > 100) {
         return ResultUtil.error(-1, "描述字段的长度不能超过100！");
      }
      return null;
   }

   
   

}
