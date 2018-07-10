package com.yiminwu.service.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yiminwu.mapper.BaseMapper;
import com.yiminwu.mapper.ClassificationAttributeMapper;
import com.yiminwu.mapper.ClassificationAttributeMapperCustom;
import com.yiminwu.mapper.ClassificationMapper;
import com.yiminwu.mapper.ClassificationMapperCustom;
import com.yiminwu.mapper.CustomMapper;
import com.yiminwu.model.Classification;
import com.yiminwu.model.ClassificationAttribute;
import com.yiminwu.service.ClassificationService;
import com.yiminwu.util.CollectionUtil;

@Service
public class ClassificationServiceImpl extends BaseServiceImpl<Classification, Integer> 
   implements ClassificationService {

   @Autowired
   private ClassificationMapper classificationMapper;
   
   @Autowired
   private ClassificationMapperCustom classificationMapperCustom;
   
   @Autowired
   private ClassificationAttributeMapper classificationAttributenMapper;
   
   @Autowired
   private ClassificationAttributeMapperCustom classificationAttributenMapperCustom;


   @Override
   protected BaseMapper<Classification, Integer> getMapper() {
      return classificationMapper;
   }

   @Override
   protected CustomMapper<Classification, Integer> getCustomMapper() {
      return classificationMapperCustom;
   }

   @Override
   public List<ClassificationAttribute> getAttributesByClassificationId(Integer id) {
      return classificationAttributenMapperCustom.getListByClassificationId(id);
   }
   
   @Override
   public void addOrUpdateAtrr(Integer id, ClassificationAttribute attribute) {
      if (id == null) {
         classificationAttributenMapper.insert(attribute);
      } else {
         classificationAttributenMapper.updateByPrimaryKey(attribute);
      }
   }
   
   @Override
   public boolean checkAttrNameExists(String name, Integer id, Integer classificationid) {
      List<ClassificationAttribute> list = classificationAttributenMapperCustom.selectByNameByClassificationId(name, classificationid);
      if (CollectionUtil.isNotEmpty(list)) {
         if (id == null) {
            return true;
         }
         for (Iterator<ClassificationAttribute> iter = list.iterator(); iter.hasNext();) {
            ClassificationAttribute obj = (ClassificationAttribute)iter.next();
            if (!id.equals(obj.getId())) {
               return true;
            } 
         }
         return false;
      }
      return false;
   }
   
   @Override
   public void deleteAtrr(Integer id) {
      classificationAttributenMapper.deleteByPrimaryKey(id);
   }
   
}
