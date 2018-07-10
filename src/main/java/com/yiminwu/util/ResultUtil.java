package com.yiminwu.util;

import com.yiminwu.common.Result;

public class ResultUtil {

   public static Result success(Object object) {
       Result result = new Result();
       result.setSuccess(true);
       result.setCode(0);
       result.setMsg("操作成功！");
       result.setData(object);
       return result;
   }

   public static Result success() {
       return success(null);
   }

   public static Result error(Integer code, String msg) {
       Result result = new Result();
       result.setSuccess(false);
       result.setCode(code);
       result.setMsg(msg);
       return result;
   }
}