package com.yiminwu.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yiminwu.mapper.BaseMapper;
import com.yiminwu.mapper.CustomMapper;
import com.yiminwu.mapper.LayoutItemMapper;
import com.yiminwu.mapper.LayoutMapper;
import com.yiminwu.mapper.LayoutMapperCustom;
import com.yiminwu.model.Layout;
import com.yiminwu.model.LayoutGroup;
import com.yiminwu.model.LayoutItem;
import com.yiminwu.service.LayoutService;

@Service
public class LayoutServiceImpl extends BaseServiceImpl<Layout, Integer> 
   implements LayoutService {

   @Autowired
   private LayoutMapper layoutMapper;
   
   @Autowired
   private LayoutMapperCustom layoutMapperCustom;

   @Autowired
   private LayoutItemMapper layoutItemMapper;

   @Override
   protected BaseMapper<Layout, Integer> getMapper() {
      return layoutMapper;
   }

   @Override
   protected CustomMapper<Layout, Integer> getCustomMapper() {
      return layoutMapperCustom;
   }
   
   public List<LayoutGroup> getLayoutGroupByLayoutId(Integer layoutId) {
      return layoutMapperCustom.getLayoutGroupByLayoutId(layoutId);
   }
   
   public void batchSaveLayoutItems(Integer layoutId, Integer[] groupIds) {
      deleteLayoutItemsByLayoutId(layoutId);
      if (groupIds != null && groupIds.length > 0) {
         for (int i = 0; i < groupIds.length; i++) {
            LayoutItem li = new LayoutItem(layoutId, groupIds[i]);
            layoutItemMapper.insert(li);
         }
      }
   }
   
   public void deleteLayoutItemsByLayoutId(Integer layoutId) {
      layoutMapperCustom.deleteLayoutItemsByLayoutId(layoutId);
      
   }
}