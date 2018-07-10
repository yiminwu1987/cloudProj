package com.yiminwu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yiminwu.common.Result;
import com.yiminwu.model.BaseObject;
import com.yiminwu.model.Classification;
import com.yiminwu.model.ClassificationAttribute;
import com.yiminwu.service.BaseService;
import com.yiminwu.service.ClassificationService;
import com.yiminwu.util.ResultUtil;
import com.yiminwu.util.StringUtil;

@RestController
@RequestMapping("/classification")
public class ClassificationController extends BaseController<Classification, Integer>{
   
   @Autowired
   private ClassificationService classificationService;
   
   @Override
   protected BaseService getService() {
      return classificationService;
   }

   @Override
   protected Result checkOtherInfo(Classification classification) {
      if (classification.getDescription().length() > 100) {
         return ResultUtil.error(-1, "描述字段的长度不能超过100！");
      }
      return null;
   }
   
   
   @Override
   protected Result getOtherInfo(HttpServletRequest request, BaseObject object) {
      Classification classification = (Classification)object;
      List<ClassificationAttribute> attributeList = classificationService.getAttributesByClassificationId(classification.getId());
      return ResultUtil.success(new Object[]{classification, attributeList});
   }
   
   @RequestMapping("/saveAttribute")
   public Result saveAttribute(HttpServletRequest request, ClassificationAttribute attribute) {
       if (StringUtil.isEmpty(attribute.getName())) {
          return ResultUtil.error(-1, "名称不能为空！");
       }
       if (attribute.getName().length() > getNameLength()) {
          return ResultUtil.error(-1, "名称字段的长度不能超过" + getNameLength() +"！");
       }
       if (classificationService.checkAttrNameExists(attribute.getName(), attribute.getId(), attribute.getClassificationid())) {
          return ResultUtil.error(-1, "名称\"" + attribute.getName() + "\"已经存在，请重新输入名称！");
       }
       classificationService.addOrUpdateAtrr(attribute.getId(), attribute);
       List<ClassificationAttribute> attributeList =
          classificationService.getAttributesByClassificationId(attribute.getClassificationid());
       return ResultUtil.success(attributeList);
   }
   
   @RequestMapping("/deleteAttribute")
   public Result deleteAttribute(HttpServletRequest request, ClassificationAttribute attribute) {
      classificationService.deleteAtrr(attribute.getId());
      List<ClassificationAttribute> attributeList =
         classificationService.getAttributesByClassificationId(attribute.getClassificationid());
      return ResultUtil.success(attributeList);
   } 

}
