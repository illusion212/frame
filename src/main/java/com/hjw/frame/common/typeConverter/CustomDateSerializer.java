package com.hjw.frame.common.typeConverter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 返回格式date转string
 */
public class CustomDateSerializer extends JsonSerializer<Date> {
	
	@Override  
    public void serialize(Date value, JsonGenerator jgen, SerializerProvider arg2)  
            throws IOException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        String formattedDate = formatter.format(value);  
        jgen.writeString(formattedDate);  
    }  

}
