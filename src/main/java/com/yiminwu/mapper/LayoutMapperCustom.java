package com.yiminwu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yiminwu.model.Layout;
import com.yiminwu.model.LayoutGroup;

@Mapper
public interface LayoutMapperCustom extends CustomMapper<Layout, Integer> {
   
   List<LayoutGroup> getLayoutGroupByLayoutId(Integer layoutId);

   int deleteLayoutItemsByLayoutId(Integer layoutId);
    
}