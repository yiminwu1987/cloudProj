package com.yiminwu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yiminwu.common.Constants;
import com.yiminwu.common.Result;
import com.yiminwu.model.LayoutGroup;
import com.yiminwu.service.BaseService;
import com.yiminwu.service.LayoutGroupService;
import com.yiminwu.util.ResultUtil;
import com.yiminwu.util.StringUtil;

@RestController
@RequestMapping("/layoutGroup")
public class LayoutGroupController extends BaseController<LayoutGroup, Integer>{
   
   @Autowired
   private LayoutGroupService layoutGroupService;
   
   @Override
   protected BaseService getService() {
      return layoutGroupService;
   }
   
   @Override
   protected Result checkOtherInfo(LayoutGroup layoutGroup) {
      if (layoutGroup.getDescription().length() > 100) {
         return ResultUtil.error(-1, "描述字段的长度不能超过100！");
      }
      return null;
   }
   
   @Override
   protected void saveOtherInfo(HttpServletRequest request, LayoutGroup layoutGroup) {
      layoutGroupService.deleteAllByGroupIdAndNoIncludeLinkType(layoutGroup.getId(), layoutGroup.getLinktype());
   }
   
   @Override
   protected void deleteOtherInfo(Integer id) {
      layoutGroupService.deleteAllByGroupId(id);
   }
   
   protected void batchDeleteOtherInfo(String ids) {
      layoutGroupService.deleteAllByGroupIds(StringUtil.split(ids, Constants.SPLITTER_COL));
      
   }

   
   

}
