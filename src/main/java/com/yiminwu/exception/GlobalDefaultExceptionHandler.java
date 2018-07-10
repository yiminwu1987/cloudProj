package com.yiminwu.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yiminwu.common.Result;
import com.yiminwu.util.ResultUtil;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
   
   @ExceptionHandler(Exception.class)
   @ResponseBody
   public Result defaultExceptionHandler(HttpServletRequest req, Exception e) {
      return ResultUtil.error(-1, "对不起，系统繁忙，请稍后再试！");
   }

}
