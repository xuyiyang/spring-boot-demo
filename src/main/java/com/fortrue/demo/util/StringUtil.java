package com.fortrue.demo.util;

public class StringUtil {
    private StringUtil(){}
    public static boolean isEmpty(String s){
        return s == null || s.trim().length() == 0;
    }

    public static String empty2Null(String s){
       return s == null || s.trim().length() == 0 ? null : s;
    }
}
