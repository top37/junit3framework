package com.study.utils;

public class CommonUtils {
    /**
     * alt shift M
     * @param object 通常传this，为了获取上传对象的
     * @param Str 一个校验的Str
     */
    public static void syso(Object object,String Str) {
        System.out.println(Integer.toHexString(object.hashCode())+"->"+Str);
    }
}
