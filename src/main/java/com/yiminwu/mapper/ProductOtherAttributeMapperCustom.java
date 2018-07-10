package com.yiminwu.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.yiminwu.model.ProductOtherAttribute;

@Mapper
public interface ProductOtherAttributeMapperCustom {
    
   List<ProductOtherAttribute> getListByProductId(Long productId);

   List<ProductOtherAttribute> selectByNameByProductId(@Param(value="name") String name, 
      @Param(value="productId") Long productId);

    
}