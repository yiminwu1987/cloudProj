package com.yiminwu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yiminwu.common.PageInfo;
import com.yiminwu.mapper.BaseMapper;
import com.yiminwu.mapper.CustomMapper;
import com.yiminwu.mapper.LayoutGroupItemMapper;
import com.yiminwu.mapper.LayoutGroupItemMapperCustom;
import com.yiminwu.mapper.LayoutGroupMapper;
import com.yiminwu.mapper.LayoutGroupMapperCustom;
import com.yiminwu.model.LayoutGroup;
import com.yiminwu.model.LayoutGroupItem;
import com.yiminwu.service.LayoutGroupService;
import com.yiminwu.util.CollectionUtil;
import com.yiminwu.util.StringUtil;

@Service
public class LayoutGroupServiceImpl extends BaseServiceImpl<LayoutGroup, Integer> 
   implements LayoutGroupService {

   @Autowired
   private LayoutGroupMapper layoutGroupdMapper;

   @Autowired
   private LayoutGroupMapperCustom layoutGroupdMapperCustom;
   
   @Autowired
   private LayoutGroupItemMapper layoutGroupdItemMapper;
   
   @Autowired
   private LayoutGroupItemMapperCustom layoutGroupdItemMapperCustom;

   @Override
   protected BaseMapper<LayoutGroup, Integer> getMapper() {
      return layoutGroupdMapper;
   }


   @Override
   protected CustomMapper<LayoutGroup, Integer> getCustomMapper() {
      return layoutGroupdMapperCustom;
   }

   @Override
   public PageInfo getItemList(LayoutGroup group, String name) {
      if (group != null) {
         if (LayoutGroup.LINK_TYPE_PRODUCT.equalsIgnoreCase(group.getLinktype())) {
            return new PageInfo(layoutGroupdMapperCustom.getProductItemList(group.getId(), name));
         } else if (LayoutGroup.LINK_TYPE_CLASSIFICATION.equalsIgnoreCase(group.getLinktype())) {
            return new PageInfo(layoutGroupdMapperCustom.getClassificationItemList(group.getId(), name));
         } else if (LayoutGroup.LINK_TYPE_BRAND.equalsIgnoreCase(group.getLinktype())) {
            return new PageInfo(layoutGroupdMapperCustom.getBrandItemList(group.getId(), name));
         }
      }
      return new PageInfo(CollectionUtil.EMPTY_LIST);
   }


   @Override
   public void addItems(LayoutGroup group, Long[] itemIdArr) {
      if (itemIdArr == null || itemIdArr.length == 0) {
         return;
      }
      for (int i = 0; i < itemIdArr.length; i++) {
         LayoutGroupItem item = new LayoutGroupItem(group.getId(), itemIdArr[i], group.getLinktype());
         layoutGroupdItemMapper.deleteByPrimaryKey(item);
         layoutGroupdItemMapper.insert(item);
      }
      
   }
   
   @Override
   public void deleteItem(LayoutGroup group, Long itemId) {
      if (StringUtil.isNullOrZero(itemId)) {
         return;
      }
      LayoutGroupItem item = new LayoutGroupItem(group.getId(), itemId, group.getLinktype());
      layoutGroupdItemMapper.deleteByPrimaryKey(item);
   }


   @Override
   public void deleteItems(LayoutGroup group, Long[] ids) {
      layoutGroupdItemMapperCustom.batchDelete(group.getId(), group.getLinktype(), ids);
      
   }


   @Override
   public void deleteAllByGroupId(Integer groupId) {
      layoutGroupdItemMapperCustom.deleteAllByGroupId(groupId);
   }


   @Override
   public void deleteAllByGroupIdAndNoIncludeLinkType(Integer groupId, String linkType) {
      layoutGroupdItemMapperCustom.deleteAllByGroupIdAndNoIncludeLinkType(groupId, linkType);
   }
   
   @Override
   public void deleteAllByGroupIds(Integer[] groupIds) {
      layoutGroupdItemMapperCustom.deleteAllByGroupIds(groupIds);
   }

}
