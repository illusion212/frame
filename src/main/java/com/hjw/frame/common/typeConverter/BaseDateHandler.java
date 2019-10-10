package com.hjw.frame.common.typeConverter;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.Date;

@ControllerAdvice
public class BaseDateHandler {
    /**
     * *这里是把前端传入的时间类型的字符串转成日期类型
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new typeConverter());
    }
}
