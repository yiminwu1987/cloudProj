package com.yiminwu.service;

import com.yiminwu.common.PageInfo;
import com.yiminwu.model.LayoutGroup;
public interface LayoutGroupService extends BaseService<LayoutGroup, Integer> {

   public PageInfo getItemList(LayoutGroup group, String name);

   public void addItems(LayoutGroup group, Long[] itemIdArr);

   public void deleteItem(LayoutGroup group, Long itemId);

   public void deleteItems(LayoutGroup group, Long[] ids);
   
   public void deleteAllByGroupId(Integer groupId);
   
   public void deleteAllByGroupIdAndNoIncludeLinkType(Integer groupId, String linkType);
   
   public void deleteAllByGroupIds(Integer[] groupIds);

}
