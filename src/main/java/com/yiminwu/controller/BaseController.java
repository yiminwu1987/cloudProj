package com.yiminwu.controller;

import java.io.Serializable;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;

import com.yiminwu.common.Constants;
import com.yiminwu.common.PageInfo;
import com.yiminwu.common.Result;
import com.yiminwu.model.BaseObject;
import com.yiminwu.service.BaseService;
import com.yiminwu.util.PageUtil;
import com.yiminwu.util.ResultUtil;
import com.yiminwu.util.StringUtil;

public abstract class BaseController<T, PK extends Serializable> {
   
  protected abstract BaseService getService();
   
   protected int getNameLength() {
      return 5;
   }
   
   protected Result checkOtherInfo(T object) {
      return null;
   }
   
   protected void saveOtherInfo(HttpServletRequest request, T object) {
      
   }
   
   protected Result returnOtherResult (HttpServletRequest request, T object) {
      return null;
   }
   
   protected Result canDelete(PK id) {
      return null;
   }
   
   protected Result canBatchDelete(String ids) {
      return null;
   }
   
   protected void deleteOtherInfo(PK id) {
      
   }
   
   protected void batchDeleteOtherInfo(String ids) {
      
   }
   
   protected boolean canSearchList(HttpServletRequest request) {
      return true;
   }
   
   protected Result getOtherInfo(HttpServletRequest request, BaseObject object) throws Exception {
      return ResultUtil.success(object); 
   }
   
   @RequestMapping("/list")
   public PageInfo list(HttpServletRequest request, String name) {
      if(!canSearchList(request)) {
         return new PageInfo(new ArrayList());
      }
      PageUtil.getPageInfo(request);
      return getService().getList(name);
   }
   
   @RequestMapping("/delete")
   public Result delete(PK id) {
       Result result = canDelete(id);
       if (result != null) {
          return result;
       }
       getService().delete(id);
       deleteOtherInfo(id);
       return ResultUtil.success();
   }
   
   @RequestMapping("/batchDelete")
   public Result batchDelete(String ids) {
      Result result = canBatchDelete(ids);
      if (result != null) {
         return result;
      }
       getService().batchDelete(StringUtil.split(ids, Constants.SPLITTER_COL));
       batchDeleteOtherInfo(ids);
       return ResultUtil.success();
   }
   
   @RequestMapping("/save")
   public Result save(HttpServletRequest request, T t) {
       BaseObject object = (BaseObject)t;
       if (StringUtil.isEmpty(object.getName())) {
          return ResultUtil.error(-1, "名称不能为空！");
       }
       if (object.getName().length() > getNameLength()) {
          return ResultUtil.error(-1, "名称字段的长度不能超过" + getNameLength() +"！");
       }
       if (getService().checkNameExists(object.getName(), object.getPK())) {
          return ResultUtil.error(-1, "名称\"" + object.getName() + "\"已经存在，请重新输入名称！");
       }
       Result result = checkOtherInfo(t);
       if (result != null) {
          return result;
       }
       getService().addOrUpdate(object.getPK(), object);
       saveOtherInfo(request, t);
       Result rusult = returnOtherResult(request, t);
       if (rusult != null) {
          return rusult;
       }
       return ResultUtil.success(object.getPK());
   }
   
   @RequestMapping("/get")
   public Result get(HttpServletRequest request, PK id) throws Exception {
       if (id == null) {
          throw new Exception();
       }
       BaseObject obj = (BaseObject)getService().getById(id);
       if (obj  == null) {
          throw new Exception();
       }
       return getOtherInfo(request, obj);
   }
}
