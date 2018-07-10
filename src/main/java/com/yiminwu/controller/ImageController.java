package com.yiminwu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.yiminwu.common.Result;
import com.yiminwu.model.Img;
import com.yiminwu.service.ImgService;
import com.yiminwu.util.ResultUtil;

@RestController
@RequestMapping("/image")
public class ImageController {
   
   @Autowired
   private ImgService imgService;
   
   @RequestMapping("/upload")
   public Result upload(MultipartFile file) {
      Img img = imgService.upload(file);
      return ResultUtil.success(img.getPath());
   }
   
   @RequestMapping("/delete")
   public Result delete(String path) {
      imgService.deleteByPath(path);
      return ResultUtil.success();
   }

}
