package com.yiminwu.service.impl;

import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yiminwu.mapper.BaseMapper;
import com.yiminwu.mapper.CustomMapper;
import com.yiminwu.mapper.ProductAttributeValueMapper;
import com.yiminwu.mapper.ProductAttributeValueMapperCustom;
import com.yiminwu.mapper.ProductMapper;
import com.yiminwu.mapper.ProductMapperCustom;
import com.yiminwu.mapper.ProductOtherAttributeMapper;
import com.yiminwu.mapper.ProductOtherAttributeMapperCustom;
import com.yiminwu.model.Product;
import com.yiminwu.model.ProductAttributeValue;
import com.yiminwu.model.ProductOtherAttribute;
import com.yiminwu.service.ProductService;
import com.yiminwu.util.CollectionUtil;

@Service
public class ProductServiceImpl extends BaseServiceImpl<Product, Long> 
   implements ProductService {

   @Autowired
   private ProductMapper productMapper;
   
   @Autowired
   private ProductMapperCustom productMapperCustom;
   
   @Autowired
   private ProductAttributeValueMapper productAttributeValueMapper;
   
   @Autowired
   private ProductAttributeValueMapperCustom productAttributeValueMapperCustom;
   
   @Autowired
   private ProductOtherAttributeMapper productOtherAttributeMapper;
   
   @Autowired
   private ProductOtherAttributeMapperCustom productOtherAttributeMapperCustom;


   @Override
   protected BaseMapper<Product, Long> getMapper() {
      return productMapper;
   }

   @Override
   protected CustomMapper<Product, Long> getCustomMapper() {
      return productMapperCustom;
   }

   @Override
   public boolean checkCodeNoExists(String codeno, Long id) {
      List<Product> list = productMapperCustom.selectByCodeNo(codeno);
      if (CollectionUtil.isNotEmpty(list)) {
         if (id == null) {
            return true;
         }
         for (Iterator<Product> iter = list.iterator(); iter.hasNext();) {
            Product obj = (Product)iter.next();
            if (!id.equals(obj.getId())) {
               return true;
            } 
         }
         return false;
      }
      return false;
   }
   
   @Override
   public void batchSetOnsale(Long[] ids, boolean isOnsale) {
      productMapperCustom.batchSetOnsale(ids, isOnsale);
   }
   
   @Override
   public List<ProductAttributeValue> getAttrValueListByProductId(Long productId) {
      return productAttributeValueMapperCustom.getListByProductId(productId);
   }
   
   @Override
   public void deleteAttrValuesByProductId(Long productId) {
      productAttributeValueMapperCustom.deleteByProductId(productId);
   }
   
   @Override
   public void saveProductAttributeValue(ProductAttributeValue attributeValue) {
      productAttributeValueMapper.insert(attributeValue);
   }
   
   @Override
   public List<ProductOtherAttribute> getOtherAttributesByProductId(Long productId) {
      return productOtherAttributeMapperCustom.getListByProductId(productId);
   }
   
   @Override
   public void addOrUpdateOtherAtrr(Integer id, ProductOtherAttribute attribute) {
      if (id == null) {
         productOtherAttributeMapper.insert(attribute);
      } else {
         productOtherAttributeMapper.updateByPrimaryKey(attribute);
      }
   }

   @Override
   public boolean checkOtherAttrNameExists(String name, Integer id, Long productId) {
      List<ProductOtherAttribute> list = productOtherAttributeMapperCustom.selectByNameByProductId(name, productId);
      if (CollectionUtil.isNotEmpty(list)) {
         if (id == null) {
            return true;
         }
         for (Iterator<ProductOtherAttribute> iter = list.iterator(); iter.hasNext();) {
            ProductOtherAttribute obj = (ProductOtherAttribute)iter.next();
            if (!id.equals(obj.getId())) {
               return true;
            } 
         }
         return false;
      }
      return false;
   }

   @Override
   public void deleteOtherAtrr(Integer id) {
      productOtherAttributeMapper.deleteByPrimaryKey(id);
   }
   
}
