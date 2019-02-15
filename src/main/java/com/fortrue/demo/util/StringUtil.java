package com.fortrue.demo.util;

public class StringUtil {
    private StringUtil(){}
    public static final boolean isEmpty(String s){
        return s == null || s.trim().length() == 0;
    }

    public static final String empty2Null(String s){
       return s == null || s.trim().length() == 0 ? null : s;
    }
}
