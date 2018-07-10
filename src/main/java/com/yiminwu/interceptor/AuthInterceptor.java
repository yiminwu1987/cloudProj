package com.yiminwu.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.yiminwu.model.User;
import com.yiminwu.service.SessionService;
import com.yiminwu.util.SpringUtil;

public class AuthInterceptor implements HandlerInterceptor {
   
   @Autowired
   private SessionService sessionService;

   @Override
   public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
      throws Exception {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView model)
      throws Exception {
      User user = (User)request.getSession().getAttribute(SessionService.SESSION_USER);
      if (user != null) {
         SpringUtil.getSessionService().clearThreadLocal();
      }
      
   }

   @Override
   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
      User user = (User)request.getSession().getAttribute(SessionService.SESSION_USER);
      if (user == null) {
         response.sendRedirect(request.getContextPath() + "/center/login");
         return false;
        
      }
      SpringUtil.getSessionService().setSessionUser(user);
      return true;
   }   


}
