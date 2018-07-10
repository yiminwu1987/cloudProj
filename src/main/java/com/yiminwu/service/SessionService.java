package com.yiminwu.service;

import javax.servlet.http.HttpSession;

import com.yiminwu.model.User;

public interface SessionService {
   
   public static final String SESSION_STATELESS_SESSION_INFO = "SESSION_STATELESS_SESSION_INFO";
   
   public static final String SESSION_USER = "SESSION_USER";
   
   public boolean login(HttpSession session, User user);
   
   public boolean logout(HttpSession session);
   
   public User getSessionUser();
   
   public boolean setSessionUser(User user);
   
   public void clearThreadLocal();

}
