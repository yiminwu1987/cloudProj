package com.yiminwu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yiminwu.common.Constants;
import com.yiminwu.common.PageInfo;
import com.yiminwu.common.Result;
import com.yiminwu.model.LayoutGroup;
import com.yiminwu.service.LayoutGroupService;
import com.yiminwu.util.PageUtil;
import com.yiminwu.util.ResultUtil;
import com.yiminwu.util.StringUtil;

@RestController
@RequestMapping("/layoutGroupItem")
public class LayoutGroupItemController {
   
   @Autowired
   private LayoutGroupService layoutGroupService;
   
   @RequestMapping("/list")
   public PageInfo list(HttpServletRequest request, Integer id, String name) {
      LayoutGroup group = layoutGroupService.getById(id);
      PageUtil.getPageInfo(request);
      return layoutGroupService.getItemList(group, name);
   }
   
   @RequestMapping("/save")
   public Result save(HttpServletRequest request, Integer id, String itemIds) {
       LayoutGroup group = layoutGroupService.getById(id);
       if (group == null) {
          return ResultUtil.error(-1, "找不到分组！");
       }
       if (StringUtil.isEmpty(itemIds)) {
          return ResultUtil.success();
       }
       Long[] itemIdArr = StringUtil.splitLong(itemIds, Constants.SPLITTER_COL);
       if (itemIdArr == null || itemIdArr.length == 0) {
          return ResultUtil.success();
       }
       layoutGroupService.addItems(group, itemIdArr);
       return ResultUtil.success();
   }
   
   @RequestMapping("/delete")
   public Result delete(Integer groupId, Long id) {
      LayoutGroup group = layoutGroupService.getById(groupId);
      if (group == null) {
         return ResultUtil.error(-1, "找不到分组！");
      }
      if (!StringUtil.isNullOrZero(id)) {
         layoutGroupService.deleteItem(group, id);
      }
      return ResultUtil.success();
   }
   
   @RequestMapping("/batchDelete")
   public Result batchDelete(Integer groupId, String ids) {
      LayoutGroup group = layoutGroupService.getById(groupId);
      if (group == null) {
         return ResultUtil.error(-1, "找不到分组！");
      }
      if (!StringUtil.isEmpty(ids)) {
         layoutGroupService.deleteItems(group, StringUtil.splitLong(ids, Constants.SPLITTER_COL));
      }
      return ResultUtil.success();
   }
}
