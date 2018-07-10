package com.yiminwu.service.impl;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import javax.imageio.ImageIO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;
import com.yiminwu.mapper.ImgMapper;
import com.yiminwu.mapper.ImgMapperCustom;
import com.yiminwu.model.Img;
import com.yiminwu.service.ImgService;
import com.yiminwu.util.CommonUtil;
import com.yiminwu.util.base64.Base64;

@Service
public class ImgServiceImpl implements ImgService{
   
   private static Log log = LogFactory.getLog(ImgServiceImpl.class);
   
   @Autowired
   private ImgMapper imgMapper;
   
   @Autowired
   private ImgMapperCustom imgMapperCustom;
   
   @Override
   public Img upload(MultipartFile file) {
      InputStream is = null;
      Img img = new Img();
      try {
         String imgId = UUID.randomUUID().toString();
         StringBuilder path = new StringBuilder();
         String ext = "";
         
         Date now = new Date();
         Calendar cal = Calendar.getInstance();
         cal.setTime(now);
         String year = new String(Base64.encode(String.valueOf(cal.get(Calendar.YEAR)).getBytes("UTF-8")), "UTF-8");
         String month = new String(Base64.encode(String.valueOf(cal.get(Calendar.MONTH)).getBytes("UTF-8")), "UTF-8");
         String day = new String(Base64.encode(String.valueOf(cal.get(Calendar.DATE)).getBytes("UTF-8")), "UTF-8");

         path.append(year).append("/").append(month).append("/").append(day).append("/");
         path.append(imgId);
         
         if (file.getOriginalFilename().lastIndexOf('.') >= 0) {
            path.append(file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf('.')));
            ext = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf('.') +1 );
         }
         img.setFilename(file.getOriginalFilename());
         img.setTs(now);
         img.setPath(path.toString());
         img.setExt(ext);
         img.setImgsize(file.getSize());
      
         String dir = ResourceUtils.getURL("classpath:").getPath() + "/static/upload";      
         File targetFile = new File(dir + "/" + path.toString());
         File parent = targetFile.getParentFile();
         if (!parent.exists()) {
            parent.mkdirs();
         }
         // CommonUtil.writeSmbFile(smbFile, data);
         // is = smbFile.getInputStream();
         CommonUtil.writeFile(targetFile, file.getBytes());
         is = new FileInputStream(targetFile);

         BufferedImage bufferedImage = ImageIO.read(is);
         int width = 1;
         int height = 1;
         if (bufferedImage != null) {
            width = bufferedImage.getWidth();
            height = bufferedImage.getHeight();
         }
         img.setWidth(width);
         img.setHeight(height);
         imgMapper.insert(img);
      } catch (IOException e) {
         log.error(e.getMessage(), e);
         throw new RuntimeException(e);
      } finally {
         if (is != null) {
            try {
               is.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
         }
      }

      return img;
   }

   @Override
   public void deleteByPath(String path) {
      imgMapperCustom.deleteByPath(path);
   }
}
