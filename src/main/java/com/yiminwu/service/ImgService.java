package com.yiminwu.service;

import org.springframework.web.multipart.MultipartFile;

import com.yiminwu.model.Img;

public interface ImgService {
   public Img upload(MultipartFile file);

   public void deleteByPath(String path);
}
