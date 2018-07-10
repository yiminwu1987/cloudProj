package com.yiminwu.common;

import java.io.Serializable;

public class Result<T> implements Serializable{

   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   
   /** 是否成功 */
   private boolean success;

   /** 错误码. */
   private Integer code;

   /** 提示信息. */
   private String msg;

   /** 具体的内容. */
   private T data;

   public boolean isSuccess() {
      return success;
   }

   public void setSuccess(boolean success) {
      this.success = success;
   }

   public Integer getCode() {
       return code;
   }

   public void setCode(Integer code) {
       this.code = code;
   }

   public String getMsg() {
       return msg;
   }

   public void setMsg(String msg) {
       this.msg = msg;
   }

   public T getData() {
       return data;
   }

   public void setData(T data) {
       this.data = data;
   }
}