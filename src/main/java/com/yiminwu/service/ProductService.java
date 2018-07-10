package com.yiminwu.service;

import java.util.List;

import com.yiminwu.model.Product;
import com.yiminwu.model.ProductAttributeValue;
import com.yiminwu.model.ProductOtherAttribute;

public interface ProductService extends BaseService<Product, Long> {

   boolean checkCodeNoExists(String codeno, Long id);
   
   public void batchSetOnsale(Long[] ids, boolean isOnsale);
   
   public List<ProductAttributeValue> getAttrValueListByProductId(Long productId);
   
   public void deleteAttrValuesByProductId(Long productId);
   
   public void saveProductAttributeValue(ProductAttributeValue attributeValue);
   
   public List<ProductOtherAttribute> getOtherAttributesByProductId(Long productId);
   
   public void addOrUpdateOtherAtrr(Integer id, ProductOtherAttribute attribute);

   public boolean checkOtherAttrNameExists(String name, Integer id, Long productId);

   public void deleteOtherAtrr(Integer id);

}
