package com.yiminwu.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.yiminwu.common.Result;
import com.yiminwu.model.User;
import com.yiminwu.service.SessionService;
import com.yiminwu.service.UserService;
import com.yiminwu.util.ResultUtil;

@Controller
@RequestMapping("/center")
public class CenterController {
   
   @Autowired
   private UserService userService;
   
   @Autowired
   private SessionService sessionService;

   @RequestMapping("")
   public String showCenterPage(HttpServletRequest request, HttpServletResponse response) {
      User user = sessionService.getSessionUser();
      request.setAttribute("isAdminLogin", User.TYPE_ADMIN.equalsIgnoreCase(user.getType()));
      return "center/index";
   }
   
   @RequestMapping("login")
   public String login() {
      return "center/login";
   }
   
   @RequestMapping("doLogin")
   @ResponseBody
   public Result doLogin(HttpServletRequest request, HttpServletResponse response, 
      @RequestParam(required=true) String nameOrPhone, @RequestParam(required=true) String passward) throws IOException {
      User user = userService.matchUser(nameOrPhone, passward);
      if (user != null) {
         sessionService.login(request.getSession(), user);
         String menu = "";
         if (User.TYPE_ADMIN.equalsIgnoreCase(user.getType())) {
            menu = "userList";
         } else if (User.TYPE_PROFILE.equalsIgnoreCase(user.getType())) {
            menu = "profileInfo";
         }
         return ResultUtil.success(menu);
      }
      return ResultUtil.error(-1, "账号和密码不匹配！");
   }
   
   @RequestMapping("getLoginInfo")
   @ResponseBody
   public Result getLoginInfo(HttpServletRequest request, HttpServletResponse response) throws IOException {
      User user = sessionService.getSessionUser();
      return ResultUtil.success(user);
   }
   
   @RequestMapping("doLogout")
   public void doLogout(HttpServletRequest request, HttpServletResponse response) throws IOException {
      sessionService.logout(request.getSession());
      response.sendRedirect(request.getContextPath() + "/center/login");
   }
   
   @RequestMapping("/getCenterMenus")
   @ResponseBody
   public List getCenterMenus() {
      List<Map> menuList = new ArrayList<Map>();
      User user = sessionService.getSessionUser();
      if (user == null) {
         return menuList;
      }
      if (User.TYPE_ADMIN.equalsIgnoreCase(user.getType())) {
         Map<String, Object> userMenu = new HashMap<String, Object>();
         userMenu.put("id", "menu-User");
         userMenu.put("name", "用户管理");
         userMenu.put("iconClass", "Hui-iconfont-user");
         
         List<Map> subMenuList = new ArrayList<Map>();
         Map<String, Object> userListMenu = new HashMap<String, Object>(); 
         userListMenu.put("id", "userList");
         userListMenu.put("name", "用户管理");
         userListMenu.put("link", "userList");
         userListMenu.put("moduleName", "user");
         subMenuList.add(userListMenu);
         userMenu.put("subMenuList", subMenuList);
         
         menuList.add(userMenu);
      } else if (User.TYPE_PROFILE.equalsIgnoreCase(user.getType())) {
         Map<String, Object> contentMenu = new HashMap<String, Object>();
         contentMenu.put("id", "menu-content");
         contentMenu.put("name", "内容管理");
         contentMenu.put("iconClass", "Hui-iconfont-edit2");
         
         List<Map> subMenuList = new ArrayList<Map>();
         Map<String, Object> profileMenu = new HashMap<String, Object>(); 
         profileMenu.put("id", "profileInfo");
         profileMenu.put("name", "基本信息");
         profileMenu.put("link", "profileInfo");
         profileMenu.put("moduleName", "profile");
         subMenuList.add(profileMenu);
         
         Map<String, Object> replyMenu = new HashMap<String, Object>(); 
         replyMenu.put("id", "replyList");
         replyMenu.put("name", "评论管理");
         replyMenu.put("link", "replyList");
         replyMenu.put("moduleName", "reply");
         subMenuList.add(replyMenu);
         contentMenu.put("subMenuList", subMenuList);
         
         menuList.add(contentMenu);
         
         
         Map<String, Object> settingMenu = new HashMap<String, Object>();
         settingMenu.put("id", "menu-setting");
         settingMenu.put("name", "外观设置");
         settingMenu.put("iconClass", "Hui-iconfont-system");
         
         subMenuList = new ArrayList<Map>();
         Map<String, Object> settingInfoMenu = new HashMap<String, Object>(); 
         settingInfoMenu.put("id", "settingInfo");
         settingInfoMenu.put("name", "外观设置");
         settingInfoMenu.put("link", "settingInfo");
         settingInfoMenu.put("moduleName", "setting");
         subMenuList.add(settingInfoMenu);
         
         settingMenu.put("subMenuList", subMenuList);
         
         menuList.add(settingMenu);
         
      }
     /* Map<String, Object> orderMenu = new HashMap<String, Object>();
      orderMenu.put("id", "menu-Order");
      orderMenu.put("name", "订单管理");
      orderMenu.put("iconClass", "Hui-iconfont-order");
       
      List<Map> subMenuList = new ArrayList<Map>();
      Map<String, Object> orderListMenu = new HashMap<String, Object>(); 
      orderListMenu.put("id", "orderList");
      orderListMenu.put("name", "订单管理");
      orderListMenu.put("link", "orderList");
      orderListMenu.put("moduleName", "order");
      subMenuList.add(orderListMenu);
      orderMenu.put("subMenuList", subMenuList);
      
      menuList.add(orderMenu);
      
      Map<String, Object> productMenu = new HashMap<String, Object>();
      productMenu.put("id", "menu-product");
      productMenu.put("name", "产品管理");
      productMenu.put("iconClass", "Hui-iconfont-goods");
       
      subMenuList = new ArrayList<Map>();
      
      Map<String, Object> brandMenu = new HashMap<String, Object>(); 
      brandMenu.put("id", "brandList");
      brandMenu.put("name", "品牌管理");
      brandMenu.put("link", "brandList");
      brandMenu.put("moduleName", "brand");
      subMenuList.add(brandMenu);
      
      Map<String, Object> classificationMenu = new HashMap<String, Object>(); 
      classificationMenu.put("id", "classificationList");
      classificationMenu.put("name", "分类管理");
      classificationMenu.put("link", "classificationList");
      classificationMenu.put("moduleName", "classification");
      subMenuList.add(classificationMenu);
      
      Map<String, Object> productListMenu = new HashMap<String, Object>(); 
      productListMenu.put("id", "productList");
      productListMenu.put("name", "产品管理");
      productListMenu.put("link", "productList");
      productListMenu.put("moduleName", "product");
      subMenuList.add(productListMenu);
      
      productMenu.put("subMenuList", subMenuList);

      menuList.add(productMenu);
      
      
      Map<String, Object> layoutMenu = new HashMap<String, Object>();
      layoutMenu.put("id", "menu-homeLayout");
      layoutMenu.put("name", "首页布局");
      layoutMenu.put("iconClass", "Hui-iconfont-home");
       
      subMenuList = new ArrayList<Map>();
      
      Map<String, Object> layoutGroupMenu = new HashMap<String, Object>(); 
      layoutGroupMenu.put("id", "layoutGroupList");
      layoutGroupMenu.put("name", "分组管理");
      layoutGroupMenu.put("link", "layoutGroupList");
      layoutGroupMenu.put("moduleName", "layoutGroup");
      subMenuList.add(layoutGroupMenu);
      
      Map<String, Object> layoutListMenu = new HashMap<String, Object>(); 
      layoutListMenu.put("id", "layoutList");
      layoutListMenu.put("name", "布局管理");
      layoutListMenu.put("link", "layoutList");
      layoutListMenu.put("moduleName", "layout");
      subMenuList.add(layoutListMenu);

      layoutMenu.put("subMenuList", subMenuList);

      menuList.add(layoutMenu);*/
      return menuList;
   }
}
