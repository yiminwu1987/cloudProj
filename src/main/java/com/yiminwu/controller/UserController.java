package com.yiminwu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yiminwu.common.Result;
import com.yiminwu.model.BaseObject;
import com.yiminwu.model.User;
import com.yiminwu.model.UserProfile;
import com.yiminwu.service.BaseService;
import com.yiminwu.service.SessionService;
import com.yiminwu.service.UserService;
import com.yiminwu.util.CommonUtil;
import com.yiminwu.util.ResultUtil;
import com.yiminwu.util.StringUtil;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController<User, Integer>{
   
   @Autowired
   private UserService userService;
   
   @Autowired
   private SessionService sessionService;
   
   @Override
   protected BaseService getService() {
      return userService;
   }

   @Override
   protected Result checkOtherInfo(User user) {
      if (!User.TYPE_ADMIN.equalsIgnoreCase(user.getType()) && StringUtil.isEmpty(user.getPhone())) {
         return ResultUtil.error(-1, "手机号码不能为空！");
      }
      if (user.getDescription().length() > 100) {
         return ResultUtil.error(-1, "描述字段的长度不能超过100！");
      }
      if (userService.checkPhoneExists(user.getPhone(), user.getId())) {
         return ResultUtil.error(-1, "手机号码\"" + user.getPhone() + "\"已经存在，请重新输入名称！");
      }
      if ((StringUtil.isNullOrZero(user.getId()) || user.isUpdatePassward()) && !StringUtil.isEmpty(user.getPassward())) {
         user.setPassward(CommonUtil.encodePassword(user.getPassward()));
      }
      if (StringUtil.isNullOrZero(user.getId()) && StringUtil.isEmpty(user.getCode())) {
         String code = userService.getUserCode();
         user.setCode(code);
      }
      return null;
   }
   
   @Override
   protected Result getOtherInfo(HttpServletRequest request, BaseObject object) throws Exception {
      User user = (User)object;
      User curUser = sessionService.getSessionUser();
      if (User.TYPE_ADMIN.equalsIgnoreCase(curUser.getType()) || StringUtil.isEqualInteger(user.getId(),  curUser.getId())) {
         return ResultUtil.success(user); 
      }
      throw new Exception();
   }
   
   @Override
   protected Result returnOtherResult (HttpServletRequest request, User user) {
      return ResultUtil.success(user);
   }
   
   @Override
   protected boolean canSearchList(HttpServletRequest request) {
      User curUser = sessionService.getSessionUser();
      if (User.TYPE_ADMIN.equalsIgnoreCase(curUser.getType())) {
         return true;
      }
      return false;
   }
   
   @RequestMapping("/getProfile")
   public Result getProfile(HttpServletRequest request) {
      User user = sessionService.getSessionUser();
      if (user != null) {
         UserProfile profile = userService.getUserProfileByUserId(user.getId());
         return ResultUtil.success(profile);
      }
      return ResultUtil.error(-1, "系统繁忙，请重新登录系统！");
   }
   
   @RequestMapping("/saveProfile")
   public Result saveProfile(HttpServletRequest request, UserProfile profile) {
       User user = sessionService.getSessionUser();
       if (user == null) {
          return ResultUtil.error(-1, "系统繁忙，请重新登录系统！");
       }
       if (StringUtil.isEmpty(profile.getImgurl())) {
         return ResultUtil.error(-1, "个人头像不能为空！");
       }
       if (StringUtil.isEmpty(profile.getName())) {
          return ResultUtil.error(-1, "名称不能为空！");
       }
       if (profile.getName().length() > 15) {
          return ResultUtil.error(-1, "名称字段的长度不能超过15！");
       }
       if (StringUtil.isEmpty(profile.getDescription())) {
          return ResultUtil.error(-1, "简要介绍不能为空！");
       }
       if (profile.getDescription().length() > 25) {
          return ResultUtil.error(-1, "简要介绍字段的长度不能超过25！");
       }
       if (StringUtil.isEmpty(profile.getIntroduction())) {
          return ResultUtil.error(-1, "个人介绍不能为空！");
       }
       if (profile.getIntroduction().length() > 200) {
          return ResultUtil.error(-1, "个人介绍的长度不能超过200！");
       }
       userService.addOrUpdateProfile(user.getId(), profile);
       return ResultUtil.success();
   }
   
   
}
