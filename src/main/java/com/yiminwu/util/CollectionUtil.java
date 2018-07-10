package com.yiminwu.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import com.yiminwu.common.Constants;

public class CollectionUtil {
   public static final Collection EMPTY_COLLECTION = Collections.unmodifiableCollection(new ArrayList(0));

   public static final Map EMPTY_MAP = Collections.unmodifiableMap(new HashMap(0));

   public static final List EMPTY_LIST = Collections.unmodifiableList(new ArrayList(0));

   public static boolean isEmpty(Collection collection) {
      return collection == null || collection.isEmpty();
   }

   public static boolean isEmpty(Map map) {
      return map == null || map.isEmpty();
   }

   public static boolean isNotEmpty(Collection collection) {
      return !isEmpty(collection);
   }

   public static List toList(Object[] arr, Integer beginIndex) {
      List<Object> list = Arrays.asList(arr);
      if (beginIndex == null) {
         beginIndex = 0;
      }
      if (list != null && list.size() > beginIndex) {
         return list.subList(beginIndex, list.size());
      }
      return EMPTY_LIST;
   }
   
   public static String join(Collection list) {
	   return join(list, Constants.SPLITTER_COL);
   }

   public static String join(Collection list, String seperator) {
      if (list != null) {
         StringBuilder ret = new StringBuilder();
         for (Iterator it = list.iterator(); it.hasNext();) {
            if (ret.length() > 0) {
               ret.append(seperator);
            }

            ret.append(it.next());
         }
         return ret.toString();
      }
      return null;
   }
   
   public static String[] parseToArray(List rowList) {
      if (null == rowList) {
         return null;
      }

      int len = rowList.size();
      if (len == 0) {
         return null;
      }

      Object[] rowArr = rowList.toArray();
      String[] rowTxt = new String[len];
      int index = 0;
      for (Object obj : rowArr) {
         rowTxt[index++] = obj == null ? "" : obj + "";
      }

      return rowTxt;
   }
   
   public static String[] toStringArray(List<String> srcList) {
      if (CollectionUtil.isEmpty(srcList)) {
         return null;
      }
      String[] result = new String[srcList.size()];
      copyToArray(srcList, result, 0);
      return result;
   }
   
   public static void copyToArray(List<String> srcList, String[] destArray, int from) {
      if (destArray == null || CollectionUtil.isEmpty(srcList)) {
         return;
      }
      int length = srcList.size();
      int fromSrc = 0 + from;
      for (int i = 0; i < destArray.length; i++) {
         if (fromSrc < length) {
            destArray[i] = srcList.get(fromSrc++);
         } else {
            destArray[i] = "";
         }
      }
   }
}
