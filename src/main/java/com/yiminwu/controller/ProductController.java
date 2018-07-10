package com.yiminwu.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yiminwu.common.Constants;
import com.yiminwu.common.Result;
import com.yiminwu.model.BaseObject;
import com.yiminwu.model.Brand;
import com.yiminwu.model.Classification;
import com.yiminwu.model.ClassificationAttribute;
import com.yiminwu.model.Product;
import com.yiminwu.model.ProductAttributeValue;
import com.yiminwu.model.ProductDetail;
import com.yiminwu.model.ProductOtherAttribute;
import com.yiminwu.service.BaseService;
import com.yiminwu.service.BrandService;
import com.yiminwu.service.ClassificationService;
import com.yiminwu.service.ProductDetailService;
import com.yiminwu.service.ProductService;
import com.yiminwu.util.CollectionUtil;
import com.yiminwu.util.ResultUtil;
import com.yiminwu.util.StringUtil;

@RestController
@RequestMapping("/product")
public class ProductController extends BaseController<Product, Long>{
   
   @Autowired
   private ProductService productService;
   
   @Autowired
   private BrandService brandService;
   
   @Autowired
   private ClassificationService classificationService;
   
   @Autowired
   private ProductDetailService productDeatailService;
   
   @Override
   protected BaseService getService() {
      return productService;
   }

   @Override
   protected int getNameLength() {
      return 64;
   }
   
   @Override
   protected void saveOtherInfo(HttpServletRequest request, Product product) {
      String attrIdListStr = request.getParameter("attrIdListStr");
      String attrValueListStr = request.getParameter("attrValueListStr");
      productService.deleteAttrValuesByProductId(product.getId());
      if (!StringUtil.isEmpty(attrIdListStr)) {
         Integer[] attrIds = StringUtil.split(attrIdListStr, Constants.SPLITTER_COL);
         String[] attrValues = attrValueListStr.split(Constants.SPLITTER_COL);
         for (int i = 0; i < attrIds.length; i++) {
            Integer attrId = attrIds[i];
            String attrValue = i >= attrValues.length ? "" : attrValues[i];
            ProductAttributeValue attrValueObj = new ProductAttributeValue(product.getId(), attrId, attrValue);
            productService.saveProductAttributeValue(attrValueObj);
         }
         
      } 
      String productDetailStr = request.getParameter("productDetail");
      productDeatailService.delete(product.getId());
      if (!StringUtil.isEmpty(productDetailStr)) {
         ProductDetail productDeatail = new ProductDetail();
         productDeatail.setId(product.getId());
         productDeatail.setDetail(productDetailStr);
         productDeatailService.addOrUpdate(null, productDeatail);
      }
   }
   
   @Override
   protected Result getOtherInfo(HttpServletRequest request, BaseObject object) {
      Product product = (Product)object;
      Classification classification = null;
      if (!StringUtil.isNullOrZero(product.getClassificationid())) {
         classification = classificationService.getById(product.getClassificationid());
     }
      Brand brand = null;
      if (!StringUtil.isNullOrZero(product.getBrandid())) {
          brand = brandService.getById(product.getBrandid());
      }
      ProductDetail productDetail = productDeatailService.getById(product.getId());
      List<ProductOtherAttribute> otherAttributeList = productService.getOtherAttributesByProductId(product.getId());
      return ResultUtil.success(new Object[]{product, classification, brand, productDetail == null ? "" : productDetail.getDetail(), otherAttributeList});
   }

   @Override
   protected Result checkOtherInfo(Product product) {
      if (StringUtil.isEmpty(product.getCodeno())) {
         return ResultUtil.error(-1, "编号不能为空！");
      }
      if (product.getCodeno().length() > 64) {
         return ResultUtil.error(-1, "编号字段的长度不能超过64！");
      }
      if (product.getDescription().length() > 100) {
         return ResultUtil.error(-1, "描述字段的长度不能超过100！");
      }
      if (productService.checkCodeNoExists(product.getCodeno(), product.getId())) {
         return ResultUtil.error(-1, "编号\"" + product.getCodeno() + "\"已经存在，请重新输入编号！");
      }
      return null;
   }  
   
   @RequestMapping("/setOnsale")
   public Result setOnsale(String ids, boolean isOnsale) {
       if (StringUtil.isEmpty(ids)) {
          return ResultUtil.error(-1, "请选择要操作的记录！");
       }
       productService.batchSetOnsale(StringUtil.splitLong(ids, Constants.SPLITTER_COL), isOnsale);
       return ResultUtil.success();
   }
   
   @RequestMapping("/getProductAttrValue")
   public Result getProductAttrValue(Long productId, Integer classificationId) {
       if (StringUtil.isNullOrZero(classificationId) ) {
          return ResultUtil.success(new Object[]{CollectionUtil.EMPTY_LIST, CollectionUtil.EMPTY_MAP});
       }
       List<ClassificationAttribute> attrList = classificationService.getAttributesByClassificationId(classificationId);
       Map<Integer, String> attrValueMap = new HashMap<Integer, String>();
       if(StringUtil.isNullOrZero(productId)) {
          return ResultUtil.success(new Object[]{attrList, attrValueMap});
       }
       List<ProductAttributeValue> attrValueList = productService.getAttrValueListByProductId(productId);
       if (CollectionUtil.isNotEmpty(attrValueList)) {
          for(Iterator<ProductAttributeValue> iter = attrValueList.iterator(); iter.hasNext();) {
             ProductAttributeValue attrValue = iter.next();
             attrValueMap.put(attrValue.getAttrid(), attrValue.getValue());
          }
       }
       return ResultUtil.success(new Object[]{attrList, attrValueMap});
   }
   
   @RequestMapping("/saveOtherAttribute")
   public Result saveOtherAttribute(HttpServletRequest request, ProductOtherAttribute attribute) {
       if (StringUtil.isEmpty(attribute.getName())) {
          return ResultUtil.error(-1, "名称不能为空！");
       }
       if (attribute.getName().length() > getNameLength()) {
          return ResultUtil.error(-1, "名称字段的长度不能超过" + getNameLength() +"！");
       }
       if (productService.checkOtherAttrNameExists(attribute.getName(), attribute.getId(), attribute.getProductid())) {
          return ResultUtil.error(-1, "名称\"" + attribute.getName() + "\"已经存在，请重新输入名称！");
       }
       productService.addOrUpdateOtherAtrr(attribute.getId(), attribute);
       List<ProductOtherAttribute> otherAttributeList =
          productService.getOtherAttributesByProductId(attribute.getProductid());
       return ResultUtil.success(otherAttributeList);
   }
   
   @RequestMapping("/deleteOtherAttribute")
   public Result deleteOtherAttribute(HttpServletRequest request, ProductOtherAttribute attribute) {
      productService.deleteOtherAtrr(attribute.getId());
      List<ProductOtherAttribute> otherAttributeList =
         productService.getOtherAttributesByProductId(attribute.getProductid());
      return ResultUtil.success(otherAttributeList);
   } 

}
