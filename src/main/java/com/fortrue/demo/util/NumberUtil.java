package com.fortrue.demo.util;


import java.time.LocalDate;

public class NumberUtil {
    private NumberUtil(){}
    /**
     *
     * @param number
     * @return
     */
    public static final Long notLessThanZero(Long number, Long defaultValue){
        return (number == null || number.longValue() <= 0) ? defaultValue : number;
    }

    public static final boolean isPositive(Number num){
        return num != null && num.intValue() > 0;
    }

    public static final Integer genCreateTimeInt(){
        LocalDate date = LocalDate.now();
        return date.getYear() * 10000 + date.getMonthValue() * 100 + date.getDayOfMonth();
    }
}
