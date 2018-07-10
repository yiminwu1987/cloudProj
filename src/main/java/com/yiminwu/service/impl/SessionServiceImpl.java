package com.yiminwu.service.impl;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
import com.yiminwu.common.StatelessSessionInfo;
import com.yiminwu.model.User;
import com.yiminwu.service.SessionService;

@Service
public class SessionServiceImpl implements SessionService {
   
   private static ThreadLocal SESSIONS = new ThreadLocal() {
      protected Object initialValue() {
         return new HashMap();
      }
   };

   @Override
   public boolean login(HttpSession session, User user) {
      if (user != null) {
         session.setAttribute(SessionService.SESSION_USER, user);
         StatelessSessionInfo ssi = getStatelessSessionInfo();
         ssi.setUser(user);
         return true;
      }
      return false;
   }

   @Override
   public boolean logout(HttpSession session) {
      session.removeAttribute(SessionService.SESSION_USER);
      StatelessSessionInfo ssi = getStatelessSessionInfo();
      ssi.setUser(null);
      return true;
   }

   @Override
   public User getSessionUser() {
      StatelessSessionInfo ssi = getStatelessSessionInfo();
      if (ssi != null) {
         return ssi.getUser();
      }
      return null;
   }
   
   @Override
   public boolean setSessionUser(User user) {
      if (user != null) {
         StatelessSessionInfo ssi = getStatelessSessionInfo();
         if (ssi != null) {
            ssi.setUser(user);
            return true;
         }
      }
      
      return false;
   }
   
   public StatelessSessionInfo getStatelessSessionInfo() {
      Map map = (Map) SESSIONS.get();
      if (map != null) {
         StatelessSessionInfo ssi = (StatelessSessionInfo) map.get(SessionService.SESSION_STATELESS_SESSION_INFO);
         if (ssi == null) {
            ssi = new StatelessSessionInfo();
            map.put(SessionService.SESSION_STATELESS_SESSION_INFO, ssi);
         }
         return ssi;
      }
      return null;
   }
   
   @Override
   public void clearThreadLocal() {
      Map map = (Map) SESSIONS.get();
      if (map != null) {
         map.clear();
      }
   }

}
