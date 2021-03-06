package com.stone.jobhunter.exception;

import com.stone.jobhunter.basic.ResponseCode;
import com.stone.jobhunter.basic.ReturnMessage;
import org.springframework.beans.TypeMismatchException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用于接收异常信息的切面，如需返回给前台异常信息，只需throw一个ApiException对象
 * fan
 */
@ControllerAdvice
public class ExceptionAdvice {

    /**
     * 自定义的异常类处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler(ApiException.class)
    @ResponseBody
    public ReturnMessage processApiException(ApiException e) {
        return new ReturnMessage(e.getCode(), e.getMessage()); //返回给前台异常信息
    }

    //参数类型不匹配
//getPropertyName()获取数据类型不匹配参数名称
//getRequiredType()实际要求客户端传递的数据类型
    @ExceptionHandler({TypeMismatchException.class})
    @ResponseBody
    public ReturnMessage requestTypeMismatch(TypeMismatchException ex) {
        return new ReturnMessage(ResponseCode.PARAM_NOT_COMPAT, "参数类型不匹配,参数" + ex.getPropertyName() + "类型应该为" + ex.getRequiredType());
    }

    //缺少参数异常
//getParameterName() 缺少的参数名称
    @ExceptionHandler({MissingServletRequestParameterException.class})
    @ResponseBody
    public ReturnMessage requestMissingServletRequest(MissingServletRequestParameterException ex) {
        String message = "缺少必要参数,参数名称为" + ex.getParameterName();
        return new ReturnMessage(ResponseCode.PARAM_EROOR, message);
    }
}
