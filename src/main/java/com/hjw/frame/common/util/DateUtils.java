package com.hjw.frame.common.util;

import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {


    //格式: 年-月-日 小时(24):分:秒
    public static final String NORMOR_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static final String SIMPLE_FORMAT = "yyyy-MM-dd";


    /**
     * 获得时间的yyyy-MM-dd的字符串
     * @param date
     * @return
     */
    public static String dateToSimpleString(Date date){
        return dateToString(date, SIMPLE_FORMAT);
    }
    public static String dateToString(Date date){
    	return dateToString(date, NORMOR_FORMAT);
    }

    /**
     * 时间->字符串
     * @param date 时间
     * @param format 格式
     * @return 字符串
     */
    public static String dateToString(Date date, String format){
        String result = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            result = dateFormat.format(date);
        }catch (Exception e){
            return null;
        }
        dateFormat = null;
        return result;
    }

    public static Date stringToDate(String dateStr){
        return stringToDate(dateStr, NORMOR_FORMAT);
    }

    /**
     * 字符串->时间
     * @param dateStr 字符串
     * @param format 格式
     * @return
     */
    public static Date stringToDate(String dateStr, String format){
        if (StringUtils.isBlank(dateStr)){
            return null;
        }
        Date date = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);

        try {
            dateFormat.setLenient(false);
            date = dateFormat.parse(dateStr);
        } catch (ParseException e) {
            date = null;
        }
        dateFormat = null;
        return date;
    }

    /**
     * 得到当前时间的yyyy-MM-dd的格式的字符串
     * @return
     */
    public static String getSimpleDateStr(){
        DateFormat dateFormat = new SimpleDateFormat(SIMPLE_FORMAT);
        return dateFormat.format(new Date());
    }

    // currentTime要转换的long类型的时间
    // formatType要转换的时间格式yyyy-MM-dd HH:mm:ss//yyyy年MM月dd日 HH时mm分ss秒
    public static Date longToDate(long currentTime, String formatType) {
        Date dateOld = new Date(currentTime); // 根据long类型的毫秒数生命一个date类型的时间
        String sDateTime = dateToString(dateOld, formatType); // 把date类型的时间转换为string
        Date date = stringToDate(sDateTime, formatType); // 把String类型转换为Date类型
        return date;
    }

    /**
     * 获得2个时间相差的天数 如果date2 > date1 返回正数 否则返回负数
     * @param date1 date1
     * @param date2 date2
     * @return 相差的天数
     */
    public static long dayDiff(Date date1, Date date2){
        return (date2.getTime() - date1.getTime()) / 86400000;
    }


    /**
     * 获得给定时间的前一天
     * @param date 给定时间
     * @return 前一天的时间
     */
    public static Date getYesterday(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, -1);
        return calendar.getTime();
    }
    
    public static Date getNewday(Date date,int num){
    	Calendar calendar = Calendar.getInstance();
    	calendar.setTime(date);
    	calendar.add(Calendar.DAY_OF_YEAR, num);
    	return calendar.getTime();
    }
    
    /**  
     * @Title: getYesterday  
     * @Description: 获取date后+num天 
     * @param date
     * @param num
     * @return   
     */ 
    public static String getAppointedDay(Date date,int num){
    	Calendar calendar = Calendar.getInstance();
    	calendar.setTime(date);
    	calendar.add(Calendar.DAY_OF_YEAR, num);
    	return dateToString(calendar.getTime(), SIMPLE_FORMAT);
    }


    /**
     * 获得给定时间的00：00：00
     * @param date 给定时间
     * @return 给定时间当天的00：00：00
     */
    public static Date getNowDateBeginning(Date date){
        if (date == null){
            date = new Date();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }
    
    /**  
     * @Title: getAppointedday  
     * @Description: 给定时间+ second秒
     * @param date
     * @param second
     * @return   
     */ 
    public static Date getAppointedday(Date date,int second) {
		date.setTime(date.getTime() + second*1000);
		return date;
	}
    
    /**  
     * @Title: timestampString  
     * @Description: 生成时间排序格式后加6位随机数字 
     * @param date
     * @return   
     */ 
    public static String getTimestampString(Date date) {
    	String time =dateToString(new Date());
    	time=time.replace("-", "").replace(":", "").replace(" ", "");
    	time=time+(int)((Math.random()*9+1)*100000);
    	return time;
	}
    
    public static void main(String[] args) {
		String timeString =dateToSimpleString(new Date());
		System.out.println(timeString);
		String time =dateToString(new Date());
		System.err.println(time);
		System.out.println(getTimestampString(new Date()));
		System.out.println((int)((Math.random()*9+1)*100000)); 
	}

}
