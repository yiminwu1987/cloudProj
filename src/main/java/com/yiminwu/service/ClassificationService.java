package com.yiminwu.service;

import java.util.List;

import com.yiminwu.model.Classification;
import com.yiminwu.model.ClassificationAttribute;

public interface ClassificationService extends BaseService<Classification, Integer> {

   public List<ClassificationAttribute> getAttributesByClassificationId(Integer id);
   
   public void addOrUpdateAtrr(Integer id, ClassificationAttribute attribute);

   public boolean checkAttrNameExists(String name, Integer id, Integer classificationid);

   public void deleteAtrr(Integer id);

}
