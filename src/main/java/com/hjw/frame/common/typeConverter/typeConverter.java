package com.hjw.frame.common.typeConverter;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  自定义转换date类型  
 */
public class typeConverter extends PropertyEditorSupport{
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            //防止空数据出错 
            if(StringUtils.isNotBlank(text)){
                date = format.parse(text);
            }
        } catch (ParseException e) {
            format = new SimpleDateFormat("yyyy-MM-dd");
            try {
                date = format.parse(text);
            } catch (ParseException e1) {
                format = new SimpleDateFormat("yyyy-MM");
                try{
                    date = format.parse(text);
                }catch (Exception e2) {
                   	logger.error("自动绑定日期数据出错");
                }
            }
        }
        setValue(date);
    }  

}
