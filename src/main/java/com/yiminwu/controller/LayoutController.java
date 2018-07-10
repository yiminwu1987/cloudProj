package com.yiminwu.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yiminwu.common.Constants;
import com.yiminwu.common.Result;
import com.yiminwu.model.BaseObject;
import com.yiminwu.model.Layout;
import com.yiminwu.model.LayoutGroup;
import com.yiminwu.service.BaseService;
import com.yiminwu.service.LayoutService;
import com.yiminwu.util.ResultUtil;
import com.yiminwu.util.StringUtil;

@RestController
@RequestMapping("/layout")
public class LayoutController extends BaseController<Layout, Integer>{
   
   @Autowired
   private LayoutService layoutService;
   
   @Override
   protected BaseService getService() {
      return layoutService;
   }
   
   @Override
   protected Result checkOtherInfo(Layout layout) {
      if (layout.getDescription().length() > 100) {
         return ResultUtil.error(-1, "描述字段的长度不能超过100！");
      }
      return null;
   }
   
   @Override
   protected void saveOtherInfo(HttpServletRequest request, Layout layout) {
      String groupIds = request.getParameter("groupIds");
      layoutService.batchSaveLayoutItems(layout.getId(), StringUtil.split(groupIds, Constants.SPLITTER_COL)); 
   }
   
   @Override
   protected Result getOtherInfo(HttpServletRequest request, BaseObject object) {
      Layout layout = (Layout)object;
      List<LayoutGroup> layoutGroupList = layoutService.getLayoutGroupByLayoutId(layout.getId());
      return ResultUtil.success(new Object[]{layout, layoutGroupList});
   }

   
   

}
