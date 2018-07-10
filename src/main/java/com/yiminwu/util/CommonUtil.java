package com.yiminwu.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yiminwu.util.base64.Base64;

public class CommonUtil {

   public static final String FORMATE_1 = "yyyy-MM-dd HH:mm:ss";

   public static final String FORMATE_2 = "yyyy/MM/dd HH:mm:ss";

   public static final String FORMATE_3 = "yyyy-MM-dd";

   public static final String FORMATE_4 = "yyyyMMddHHmmss";
   
   public static final String FORMATE_5 = "yyyyMMdd";

   public static final String ADDR_COOKIE_KEY = "globleAddressInfo";
   
   public static final String COOKIE_LANGUAGE_KEY = "USER_LANGUAGE";
   
   public static final String CURRENT_COOKIE_KEY = "org.springframework.web.servlet.i18n.CookieLocaleResolver.LOCALE";
   
   public static final String COOKIE_SEARCH_KEYWORD_KEY = "USER_SEARCH_KEYWORD";
   
   private static final Logger logger = LoggerFactory.getLogger(CommonUtil.class);

   public static Date getDate(int year, int month, int date) {
      Calendar cal = Calendar.getInstance();
      cal.set(year, month - 1, date, 0, 0, 0);
      cal.set(Calendar.MILLISECOND, 0);
      return cal.getTime();
   }

   public static Timestamp getCurrentTimestamp() {
      return new Timestamp(new java.util.Date().getTime());
   }

   public static Date getCurrentDate() {
      Calendar cal = Calendar.getInstance();
      cal.set(Calendar.HOUR, 0);
      cal.set(Calendar.MINUTE, 0);
      cal.set(Calendar.SECOND, 0);
      cal.set(Calendar.MILLISECOND, 0);
      return cal.getTime();
   }

   public static String dateToStr(Date date, String formatStr) {
      if (date == null) {
         return null;
      }
      if (StringUtil.isEmpty(formatStr)) {
         return new SimpleDateFormat(FORMATE_1).format(date);
      }
      return new SimpleDateFormat(formatStr).format(date);
   }

   public static Date strToDate(String dateStr, String formatStr) {
      Date date = null;
      if (StringUtil.isEmpty(dateStr)) {
         return date;
      }
      try {
         if (StringUtil.isEmpty(formatStr)) {
            date = new SimpleDateFormat(FORMATE_1).parse(dateStr);
         } else {
            date = new SimpleDateFormat(formatStr).parse(dateStr);
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
      return date;
   }

   /**
    * 获取访问者IP 在一般情况下使用Request.getRemoteAddr()即可，但是经过nginx等反向代理软件后，这个方法会失效。
    * 本方法先从Header中获取X-Real-IP，如果不存在再从X-Forwarded-For获得第一个IP(用,分割)，
    * 如果还不存在则调用Request .getRemoteAddr()。
    * 
    * @param request
    * @return
    */
   // 获取客户端ip
   public static String getIpAddr(HttpServletRequest request) {
      String ip = request.getHeader("x-forwarded-for");
      if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
         ip = request.getHeader("Proxy-Client-IP");
      }
      if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
         ip = request.getHeader("WL-Proxy-Client-IP");
      }
      if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
         ip = request.getRemoteAddr();
      }
      return ip;
   }

   /**
    * 获取cookie
    * 
    * @param request
    * @param Key
    * @return
    */
   public static String getCookie(HttpServletRequest request, String Key) {
      Cookie[] cookie = request.getCookies();
      String val = null;
      if (cookie != null) {
         for (int i = 0; i < cookie.length; i++) {
            Cookie cook = cookie[i];
            if (cook.getName().equals(Key)) {
               val = cook.getValue().toString();
            }
         }
      }
      return val == "" ? null : val;
   }

   /**
    * 获取cookie中的地址，没有赋予默认地址
    * 
    * @param request
    * @return
    */
   public static String getAddrByCookie(HttpServletRequest request) {
      String addr = getCookie(request, ADDR_COOKIE_KEY);
      if (addr != null) {
         try {
            addr = URLDecoder.decode(addr, "utf-8");
         } catch (Exception e) {
            addr = null;
            e.printStackTrace();
         }
      }
      return addr;
   }

   /**
    * 设置地址到cookie
    * 
    * @param request
    * @param response
    * @param addressInfo
    */
   public static boolean setAddrToCookie(HttpServletRequest request, HttpServletResponse response, String addressInfo) {
      try {
         addressInfo = URLEncoder.encode(addressInfo, "utf-8");
      } catch (UnsupportedEncodingException e) {
         logger.error(e.getMessage());
         return false;
      }
      addCookie(response, ADDR_COOKIE_KEY, addressInfo,30, null);
      return true;
   }
   
   public static void clearSearchKeywordFromCookie(HttpServletRequest request, HttpServletResponse response) {
      addCookie(response, COOKIE_SEARCH_KEYWORD_KEY, "", 30, null);
   }

   /**
    * 添加cookie
    * 
    * @param response
    * @param name
    * @param value
    */
   public static void addCookie(HttpServletResponse response, String name, String value ,int datas,String path) {
      Cookie cookie = new Cookie(name.trim(), value.trim());
      cookie.setMaxAge(datas * 24 * 60 * 60);
      if(StringUtil.isEmpty(path)){
         path = "/";
      }
      cookie.setPath(path);
      response.addCookie(cookie);
   }
   
   public static void addCookie(HttpServletResponse response, String name, String value) {
      CommonUtil.addCookie(response, name, value, 7, null);
   }
   
   /**
    * 获取cookie中的系统语言，没有赋予默认语言
    * 
    * @param request
    * @return
    */
   public static String getLanguageByCookie(HttpServletRequest request) {
      String languageTem = "cn";
      String language = getCookie(request, COOKIE_LANGUAGE_KEY);
      if (language != null) {
         try {
            language = URLDecoder.decode(language, "utf-8");
         } catch (Exception e) {
            language = null;
            e.printStackTrace();
         }
      }
      return language == null ? languageTem : language;
   }
   
   public static boolean setLanguageToCookie(HttpServletRequest request, HttpServletResponse response, String language) {
      if (StringUtil.isEmpty(language)) {
         language = "en";
      }
      addCookie(response, COOKIE_LANGUAGE_KEY, language, 30,null);
      return true;
   }
   
   /**
    * 根据cookie获取用户的language来设置lacale
    * @param request
    * @return
    */
   public static Locale getLocaleByCookieLanguage(HttpServletRequest request) {
      String lang = getLanguageByCookie(request);
      Locale locale = new Locale("zh", "CN");
      if ("cn".equalsIgnoreCase(lang)) {
         locale = new Locale("zh", "CN");
      } else if ("en".equalsIgnoreCase(lang)) {
         locale = new Locale("en", "US");
      } else if ("tw".equalsIgnoreCase(lang)) {
         locale = new Locale("zh", "TW");
      } else {
         locale = new Locale("zh", "CN");
      }
      return locale;
   }
   
   /**
    * spring本地化的locale
    * @param request
    * @return
    */
   public static Locale getCurrentLocale(HttpServletRequest request) {
      String language = getCookie(request, CURRENT_COOKIE_KEY);
      Locale locale = new Locale("zh", "CN");
      if(!StringUtil.isEmpty(language)){
         if(language.toLowerCase().contains("tw")){
            locale = new Locale("zh", "TW");
         }else if(language.toLowerCase().contains("en")){
            locale = new Locale("en", "US");
         }
      }
      return locale;
   }
   
   public static List<List> getSubLists(List list) {
      /*if (SystemConfig.isInOracleMode()) {
         return getSubLists(list, Constants.SQL_INSTATEMENT_MAXROWCOUNT);
      }*/
      return getSubLists(list, 999);
   }
   
   public static List<List> getSubLists(List list, int maxLength) {
      return getSubLists(list, maxLength, true);
   }

   public static List<List> getSubLists(List list, int maxLength, boolean useSet) {
      if (CollectionUtil.isEmpty(list)) {
         return new ArrayList();
      }

      List result = new ArrayList();

      if (useSet) {
         HashSet tmpSet = new HashSet(list);
         list = new ArrayList(tmpSet);
      }

      int length;
      int index = 0;
      int toIndex = 0;
      int rest;
      List subList;

      while (index < list.size()) {
         rest = list.size() - index;
         length = maxLength > rest ? rest : maxLength;

         toIndex = index + length;
         subList = list.subList(index, toIndex);

         result.add(subList);

         index = toIndex;
      }

      return result;

   }
   
   public static void writeFile(File file, byte[] data) {
      FileOutputStream out = null;
      try {
         if (!file.exists()) {
            file.createNewFile();
         }
         out = new FileOutputStream(file);
         out.write(data);

      } catch (MalformedURLException e) {
         logger.error(e.toString());
      } catch (UnknownHostException e) {
         logger.error(e.toString());
      } catch (IOException e) {
         logger.error(e.toString());
      } finally {
         if (out != null) {
            try {
               out.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
         }
      }

   }
   
   public static String encodePassword(String password) {
      MessageDigest md = null;
      try {
         md = MessageDigest.getInstance("MD5");
         byte[] passwordDigest = md.digest(password.getBytes());
         return new String(Base64.encode(passwordDigest));
      } catch (NoSuchAlgorithmException e) {
         logger.error(e.getMessage(), e);
      }
      return null;
   }
}
