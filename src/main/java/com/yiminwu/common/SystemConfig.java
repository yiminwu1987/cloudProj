package com.yiminwu.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SystemConfig {
   
   @Value("${custom.table.pageSize.default}")  
   private String defaultPageSize;

   public String getDefaultPageSize() {
      return defaultPageSize;
   }

   public void setDefaultPageSize(String defaultPageSize) {
      this.defaultPageSize = defaultPageSize;
   }    

}
