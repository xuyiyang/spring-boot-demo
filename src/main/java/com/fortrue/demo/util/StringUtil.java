package com.fortrue.demo.util;

import org.springframework.lang.Nullable;

public class StringUtil {
    public static final boolean isEmpty(@Nullable String s){
        return s == null || s.trim().length() == 0;
    }

    public static final String empty2Null(@Nullable String s){
       return s == null || s.trim().length() == 0 ? null : s;
    }
}
