package com.hjw.frame.common.typeConverter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**     
 * 版权所有：2018-joyware
 * 项目名称：ims_m     
 *  
 * 类描述：返回格式date转string  
 * 类名称：com.joyware.ims.util.typeConverter.CustomDateSerializer       
 * 创建人：JunWei.Hong 
 * 创建时间：2018-5-2 上午10:56:55     
 * 修改人：  
 * 修改时间：2018-5-2 上午10:56:55     
 * 修改备注：     
 * @version   V1.0      
 */  
  
public class CustomDateSerializer extends JsonSerializer<Date> {
	
	@Override  
    public void serialize(Date value, JsonGenerator jgen, SerializerProvider arg2)  
            throws IOException, JsonProcessingException {  
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        String formattedDate = formatter.format(value);  
        jgen.writeString(formattedDate);  
    }  

}
