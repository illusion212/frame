package com.hjw.frame.common.exception;

import com.hjw.frame.common.consts.Consts;
import com.hjw.frame.common.result.BaseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.net.www.http.HttpClient;

import javax.servlet.http.HttpServletRequest;

/**
 * controller 统一异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    
    Logger logger= LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(value = BaseException.class)
    @ResponseBody
    public BaseResult<String> sessionNotFoundExceptionHandler(HttpServletRequest request, BaseException exception){
        //自定义异常捕捉处理
        return handleErrorInfo(request,Consts.EXCEPTION_CUSTOM, exception.getMessage(), exception);
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public BaseResult<String> defaultErrorHandler(HttpServletRequest request, Exception exception){
        //系统异常捕捉处理
        return handleErrorInfo(request, Consts.EXCEPTION_SYSTEM, "系统异常,请联系管理员", exception);
    }

    /**
     * @param request
     * @param message
     * @param exception
     * @return
     */
    private BaseResult<String> handleErrorInfo(HttpServletRequest request,int code, String message, Exception exception) {
        BaseResult<String> errorMessage = new BaseResult<>();
        errorMessage.setMsg(message);
        errorMessage.setCode(code);
        errorMessage.setData(exception.getMessage());
        errorMessage.setUrl(request.getRequestURL().toString());
        logger.error(errorMessage.toString());
        return errorMessage;
    }

}
