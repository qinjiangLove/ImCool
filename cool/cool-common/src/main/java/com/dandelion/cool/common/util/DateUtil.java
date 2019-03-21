package com.dandelion.cool.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Mr.QinJiang
 * @create: 2019-03-11 14:13
 * @description: 时间处理工具类
 **/
public final class DateUtil {

    private DateUtil(){

    }

    final static String HHMMSS = "HHmmss";
    final static String HH_MM_SS = "HH:mm:ss";
    final static String YYYYMMDD = "yyyyMMdd";
    final static String YYYY_MM_DD = "yyyy-MM-dd";
    final static String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    final static String YYYYMMDDHHMMSSSSS = "yyyyMMddHHmmssSSS";
    final static String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    /**
     *
     * @param date     时间格式对象
     * @param pattern  日期格式
     * @return java.lang.String
     * @author Mr.QinJiang
     * @date 2019/3/11 14:24
     */
    public static final String format(Object date,String pattern){
        if(date==null){
            return null;
        }
        if(pattern==null){
            return format(date);
        }
        return new SimpleDateFormat(pattern).format(date);
    }

    /**
     * 默认时间格式
     * @param date  时间格式对象
     * @return java.lang.String
     * @author Mr.QinJiang
     * @date 2019/3/11 14:23
     */
    public static final String format(Object date){
        return format(date,YYYY_MM_DD_HH_MM_SS);
    }

    /**
     * 获取当前日期时间字符串
     * @param pattern  时间格式
     * @return java.lang.String
     * @author Mr.QinJiang
     * @date 2019/3/11 14:25
     */
    public static final String getStringDate(String pattern){
        return format(new Date(),pattern);
    }



}
