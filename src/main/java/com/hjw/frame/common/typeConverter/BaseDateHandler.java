package com.hjw.frame.common.typeConverter;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.Date;


/**
 * 版权所有：2017-joyware
 * 项目名称：pvs
 * 类描述：BaseDateHandler
 * 类名称：com.joyware.ims.util.BaseDateHandler
 * 创建人：zhe.Lin
 * 创建时间：2017-12-14 14:57
 * 修改人：
 * 修改时间：2017-12-14 14:57
 * 修改备注：
 *
 * @version V1.0
 */
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
