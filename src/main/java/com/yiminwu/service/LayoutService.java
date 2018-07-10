package com.yiminwu.service;

import java.util.List;

import com.yiminwu.model.Layout;
import com.yiminwu.model.LayoutGroup;

public interface LayoutService extends BaseService<Layout, Integer> {
   
   public List<LayoutGroup> getLayoutGroupByLayoutId(Integer layoutId);
   
   public void batchSaveLayoutItems(Integer layoutId, Integer[] groupIds);
   
   public void deleteLayoutItemsByLayoutId(Integer layoutId);

}
