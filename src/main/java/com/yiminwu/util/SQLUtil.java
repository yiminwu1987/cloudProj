/*******************************************************************************
 * PROPRIETARY/CONFIDENTIAL
 * Copyright (c) 2004-2009 WisageTech 
 *
 * All rights reserved. This medium contains confidential and proprietary
 * source code and other information which is the exclusive property of
 * WisageTech.  None of these materials may be used,
 * disclosed, transcribed, stored in a retrieval system, translated into
 * any other language or other computer language, or transmitted in any form
 * or by any means (electronic, mechanical, photocopied, recorded or
 * otherwise) without the prior written permission of WisageTech.
 *******************************************************************************
 *
 * $Header: /iManage/Betty/o2oPortlet/src/main/java/com/wisagetech/util/SQLUtil.java,v 1.1.2.3 2018/02/22 06:23:25 amywu Exp $
 * $Id: SQLUtil.java,v 1.1.2.3 2018/02/22 06:23:25 amywu Exp $
 * $Author: amywu $
 * $Date: 2018/02/22 06:23:25 $
 * $Revision: 1.1.2.3 $
 *
 *******************************************************************************
 */
package com.yiminwu.util;

import java.util.Iterator;
import java.util.List;

import com.yiminwu.common.Constants;

/**
 * @author hillshen TODO To
 */
public class SQLUtil {
   
   public static String buildRightLikeString(String str) {
      if (StringUtil.isEmpty(str)) {
         return "";
      }
      return str + "%";
      
   }

   public static String constructSQLString(Object obj) {
      if (obj == null) {
         return "null";
      } else {
         return new StringBuilder("'").append(obj.toString().replaceAll("'", "''")).append("'").toString();
      }
   }
   
   public static String buildWildCardSubList(String dbField, List objectList) {
      return buildWildCardSubList(dbField, objectList, true);
   }
   
   /**
    * 
    * @param dbField 
    * @param objectList 
    * @param isNum 是否数字类型，反之字符串
    * @param params 参数集合
    * @return
    * @throws GTSystemException
    */
   public static String buildWildCardSubList(String dbField, List objectList, boolean isNum) {
      StringBuilder result = new StringBuilder();
      if (!CollectionUtil.isEmpty(objectList)) {
         try {
        	 result.append(" (");
               List<List> subLists = CommonUtil.getSubLists(objectList);
               int index = 0;
               for (List subList : subLists) {
                  if (CollectionUtil.isEmpty(subList)) {
                     continue;
                  }
                  if (index > 0) {
                     result.append(" OR");
                  }
                  result.append(" (").append(dbField).append(" in (");
                  if (isNum) {
                     result.append(CollectionUtil.join(subList));
                  } else {
                     for (Iterator it = subList.iterator(); it.hasNext();) {
                        Object obj = it.next();
                        String value = null;
                        
                        value = String.valueOf(obj);
                        
                        result.append(SQLUtil.constructSQLString(value));
                        if (it.hasNext()) {
                           result.append(Constants.SPLITTER_COL);
                        }
                     }
                  }
                  result.append("))");
                  index++;
               }
               result.append(")");   
         } catch (Exception e) {
            ;
         }
      }
      return result.toString();
   }
   
}
