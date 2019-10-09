package com.hjw.frame.common.typeConverter;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**     
 * 版权所有：2018-joyware
 * 项目名称：ims_m     
 *  
 * 类描述：自定义转换date类型  
 * 类名称：com.joyware.ims.util.Converter.typeConverter       
 * 创建人：JunWei.Hong 
 * 创建时间：2018-4-19 上午9:34:58     
 * 修改人：  
 * 修改时间：2018-4-19 上午9:34:58     
 * 修改备注：     
 * @version   V1.0      
 */  
  
public class typeConverter extends PropertyEditorSupport{
    
    Logger logger = LoggerFactory.getLogger(this.getClass());
	
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
