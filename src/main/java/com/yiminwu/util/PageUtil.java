package com.yiminwu.util;

import javax.servlet.http.HttpServletRequest;

import com.github.pagehelper.PageHelper;
import com.yiminwu.common.SystemConfig;

public class PageUtil {
   
   public static void getPageInfo(HttpServletRequest request) {
      SystemConfig systemConfig = SpringUtil.getSystemConfig();
      int pageNo = StringUtil.toInt(request.getParameter("pageNum"), 0);
      int pageSize = StringUtil.toInt(request.getParameter("pageSize"), 
         StringUtil.toInt(systemConfig.getDefaultPageSize(), 10));
      PageHelper.startPage(pageNo, pageSize);
      String orderBy = request.getParameter("orderBy");
      if (!StringUtil.isEmpty(orderBy)) {
         PageHelper.orderBy(orderBy);
      }
      
   };
}
