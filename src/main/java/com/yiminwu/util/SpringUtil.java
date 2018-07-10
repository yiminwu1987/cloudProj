package com.yiminwu.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.yiminwu.common.SystemConfig;
import com.yiminwu.service.SessionService;

/**
 * DOCUMENT ME!
 *
 * @author robertliu
 * @version WMall1.0
 */
@Component  
public class SpringUtil implements ApplicationContextAware {
   private static ApplicationContext _context;

   public void setApplicationContext(ApplicationContext context) throws BeansException {
      _context = context;
   }
   
   public static ApplicationContext getApplicationContext() {
      return _context;
   }

   public static Object getBean(String beanId) {
      return SpringUtil.getBean(beanId, true);
   }

   public static Object getBean(String beanId, boolean throwException) {
      if (throwException) {
         Object service = _context.getBean(beanId);
         return service;
      } else {
         try {
            Object service = _context.getBean(beanId);
            return service;
         } catch (Exception e) {

         }
         return null;
      }

   }

   public static SystemConfig getSystemConfig() {
      return _context.getBean(SystemConfig.class);
   }
   
   public static SessionService getSessionService() {
      return _context.getBean(SessionService.class);
   }

  
}
