package com.fortrue.demo.util;


import java.time.LocalDate;
import java.util.Optional;

public class NumberUtil {

    private NumberUtil(){}
    /**
     *
     * @param number
     * @return
     */
    public static Long notLessThanZero(Long number, Long defaultValue){
        return Optional.ofNullable(number).filter(t -> t >= 0).orElse(defaultValue);
    }

    public static boolean isPositive(Number num){
        return num != null && num.intValue() > 0;
    }

    public static Integer genCreateTimeInt(){
        LocalDate date = LocalDate.now();
        return date.getYear() * 10000 + date.getMonthValue() * 100 + date.getDayOfMonth();
    }
}
