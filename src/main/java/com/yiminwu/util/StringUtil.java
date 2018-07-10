package com.yiminwu.util;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.ObjectMapper;

public class StringUtil {
   
   public static String toString(Object obj, String defaultStr) {
      if (null == obj) {
         return defaultStr;
      } else {
         return obj.toString();
      }
   }

   public static String formatNumber(boolean useGroup, Double num, int minDigits, int maxDigits) {
      if (null == num) {
         return "";
      }

      java.text.NumberFormat nf = java.text.NumberFormat.getNumberInstance();
      nf.setGroupingUsed(useGroup);
      nf.setMaximumFractionDigits(maxDigits);
      nf.setMinimumFractionDigits(minDigits);

      return nf.format(roundTo(num, maxDigits));
   }
   
   public static String removeTrTdTag(String errorMsg) {
      if (errorMsg == null) {
         return "";
      }
      errorMsg = errorMsg.replaceAll("<tr>", "").replaceAll("<td>", "").replaceAll("</td>", "").replaceAll("</tr>", "");
      return errorMsg;
   }
   
   public static Collection removeErrorsTrTdTag(Collection errorMsgCol) {
      if (CollectionUtil.isEmpty(errorMsgCol)) {
         return errorMsgCol;
      }
      List errorList2 = new ArrayList();
      if (CollectionUtil.isNotEmpty(errorMsgCol)) {
         for (Iterator<String> iter = errorMsgCol.iterator(); iter.hasNext();) {
            String error = iter.next();
            if (StringUtil.isEmpty(error)) {
               continue;
            }
            error = removeTrTdTag(error);
            errorList2.add(error);
         }
      }
      return errorList2;
   }

   public static double roundTo(double number, int scale) {
      try {
         BigDecimal bigDecimal = BigDecimal.valueOf(number);
         return bigDecimal.setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
      } catch (NumberFormatException ne) {
         return 0.0;
      }
   }

   public static boolean isEmpty(String value) {
      return value == null || value.trim().equals("");
   }

   public static boolean isNullOrZero(Long id) {
      return id == null || id.equals(0L);
   }

   public static boolean isNullOrZero(Integer id) {
      return id == null || id.equals(0);
   }

   public static double toDouble(Object srcStr, double defaultValue) {
      try {
         if (srcStr != null) {
            return Double.valueOf(srcStr.toString().replaceAll(",", ""));
         }
      } catch (Exception e) {
         ;
      }
      return defaultValue;
   }

   public static Double toDouble(Object srcStr, Double defaultValue) {
      try {
         if (srcStr != null) {
            return Double.valueOf(srcStr.toString().replaceAll(",", ""));
         }
      } catch (Exception e) {
         ;
      }
      return defaultValue;
   }

   public static int toInt(Object srcStr, int defaultValue) {
      try {
         if (srcStr != null && StringUtil.isInt(srcStr)) {
            String s = srcStr.toString().replaceAll("(\\s)", "");
            return s.length() > 0 ? Integer.parseInt(s) : defaultValue;
         }
      } catch (Exception e) {
         ;
      }
      return defaultValue;
   }

   public static Integer toInteger(Object srcStr, Integer defaultValue) {
      try {
         if (srcStr != null && StringUtil.isInt(srcStr)) {
            String s = srcStr.toString().replaceAll("(\\s)", "");
            return s.length() > 0 ? Integer.parseInt(s) : defaultValue;
         }
      } catch (Exception e) {
         ;
      }
      return defaultValue;
   }

   public static Long toLong(Object srcStr, Long defaultValue) {
      try {
         if (srcStr != null && StringUtil.isInt(srcStr)) {
            String s = srcStr.toString().replaceAll("(\\s)", "");
            return s.length() > 0 ? Long.parseLong(s) : defaultValue;
         }
      } catch (Exception e) {
         ;
      }
      return defaultValue;
   }
   
   public static Integer toInteger(Object obj){
      if(obj != null){
         if( obj instanceof Number){
            return ((Number)obj).intValue();
         }else{
            return toInteger(obj,null);
         }
      }
      return null;
   }
   
   public static Long toLong(Object obj){
      if(obj != null){
         if( obj instanceof Number){
            return ((Number)obj).longValue();
         }else {
            return toLong(obj,null);
         }
      }
      return null;
   }

   public static boolean isInt(Object srcStr) {
      if (srcStr == null) {
         return false;
      }
      String s = srcStr.toString().replaceAll("(\\s)", "");
      Pattern p = Pattern.compile("([-]?[\\d]+)");
      Matcher m = p.matcher(s);
      return m.matches();
   }

   public static String toJacksonString(Object obj) {
      if (obj == null) {
         return "null";
      }
      String jacksonStr = "";
      try {
         ObjectMapper mapper = new ObjectMapper();
         jacksonStr = mapper.writeValueAsString(obj);
      } catch (Exception e) {
         e.printStackTrace();
         ;
      }
      return jacksonStr;
   }

   public static boolean toBoolean(Object srcStr, boolean defaultValue) {
      try {
         if (srcStr != null) {
            return Boolean.parseBoolean(trim(srcStr.toString()));
         }
      } catch (Exception e) {
         ;
      }
      return defaultValue;
   }

   public static boolean toBooleanFlag(Object srcStr, boolean defaultValue) {
      try {
         if (srcStr != null) {
            return trim(srcStr.toString()).equalsIgnoreCase("true") || trim(srcStr.toString()).equalsIgnoreCase("1") ||
               trim(srcStr.toString()).equalsIgnoreCase("on");
         }
      } catch (Exception e) {
         ;
      }
      return defaultValue;
   }

   public static String trim(Object srcStr) {
      if (srcStr != null) {
         return srcStr.toString().trim();
      }

      return null;
   }

   public static Long[] toLongArray(String[] valuesStr) {
      if (valuesStr != null && valuesStr.length > 0) {
         Long[] values = new Long[valuesStr.length];
         for (int i = 0; i < valuesStr.length; i++) {
            values[i] = toLong(valuesStr[i], 0L);
         }
         return values;
      }
      return null;
   }

   public static String nvl(String srcStr, String objStr) {
      if (srcStr == null || 0 == srcStr.trim().length() || "null".equalsIgnoreCase(srcStr.trim())) {
         return objStr;
      } else {
         return srcStr;
      }
   }

   public static Integer[] split(String srcStr, String format) {
      if (nvl(srcStr, "").length() == 0) {
         return null;
      } else {
         String[] strList = srcStr.split(format);

         Integer[] intList = new Integer[strList.length];

         String tmp = null;

         for (int i = 0; i < strList.length; i++) {
            tmp = strList[i].trim();
            if (!isEmpty(tmp)) {
               intList[i] = new Integer(tmp);
            }
         }

         return intList;
      }
   }
   
   public static Long[] splitLong(String srcStr, String format) {
      if (nvl(srcStr, "").length() == 0) {
         return null;
      } else {
         String[] strList = srcStr.split(format);

         Long[] intList = new Long[strList.length];

         String tmp = null;

         for (int i = 0; i < strList.length; i++) {
            tmp = strList[i].trim();
            if (!isEmpty(tmp)) {
               intList[i] = new Long(tmp);
            }
         }

         return intList;
      }
   }

   public static boolean isEqualInteger(Integer oldValue, Integer newValue) {
      if ((null == oldValue) && (null == newValue)) {
         return true;
      }

      if ((null == oldValue) || (null == newValue)) {
         return false;
      }

      boolean flag = false;

      if (oldValue.intValue() == newValue.intValue()) {
         flag = true;
      }

      return flag;
   }

   public static boolean isEqualLong(Long oldValue, Long newValue) {
      if ((null == oldValue) && (null == newValue)) {
         return true;
      }

      if ((null == oldValue) || (null == newValue)) {
         return false;
      }

      boolean flag = false;

      if (oldValue.longValue() == newValue.longValue()) {
         flag = true;
      }

      return flag;
   }

   public static String encodeUrl(String url) {
      try {
         return URLEncoder.encode(url, "UTF-8");
      } catch (UnsupportedEncodingException e) {
         return null;
      }
   }

   public static boolean safeEquals(Object left, Object right) {
      if (left == null && right == null) {
         return true;
      }
      if (left == null || right == null) {
         return false;
      }
      return left.equals(right);
   }
   
   public static String formatNumber(double num, int minDigits, int maxDigits) {
      return formatNumber(num, minDigits, maxDigits, true);
   }
   
   public static String formatNumber(double num, int minDigits, int maxDigits, boolean groupingUsed) {
      java.text.NumberFormat nf = java.text.NumberFormat.getNumberInstance();
      nf.setMaximumFractionDigits(maxDigits);
      nf.setMinimumFractionDigits(minDigits);
      nf.setGroupingUsed(groupingUsed);

      if (Double.isNaN(num)) {
         return "N/A";
      }
      return nf.format(roundTo(num, maxDigits));

   }
   
   public static boolean isStrInArray(String[] arrays, String str) {
      if (arrays == null) {
         return false;
      }
      int count = 0;
      for (int i = 0; i < arrays.length; i++) {
         if (arrays[i] == null && str == null) {
            count++;
         } else if (arrays[i] != null && arrays[i].equals(str)) {
            count++;
         } else if (str.equals(arrays[i])) {
            count++;
         }
      }
      return count > 0;
   }
   
   public static String genUUID() {
      return UUID.randomUUID().toString();
   }
   
 //生成随机数字和字母,
   public static String getRandomString(int length) {
       
       String val = "";
       Random random = new Random();
       
       //参数length，表示生成几位随机数
       for(int i = 0; i < length; i++) {
           
           String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
           //输出字母还是数字
           if( "char".equalsIgnoreCase(charOrNum) ) {
               //输出是大写字母还是小写字母
               int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
               val += (char)(random.nextInt(26) + temp);
           } else if( "num".equalsIgnoreCase(charOrNum) ) {
               val += String.valueOf(random.nextInt(10));
           }
       }
       return val;
   }
   
 //生成随机数字和字母,
   public static String getUserCode() {
       return getRandomString(8);
   }

}
