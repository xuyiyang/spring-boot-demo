package com.fortrue.demo.util;

import org.springframework.lang.Nullable;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class NumberUtil {
//    public static final Number notLessThanZero(@Nullable Number number){
//        if(number == null || number.longValue() <= 0){
//            return 0;
//        }
//        return number;
//    }

    /**
     *
     * @param number
     * @return
     */
    public static final Long notLessThanZero(@Nullable Long number, Long defaultValue){
        if(number == null || number.longValue() <= 0){
            return defaultValue;
        }
        return number;
    }

    public static final boolean isPositive(Number num){
        return num != null && num.intValue() > 0;
    }

    public static final Integer genCreateTimeInt(){
        LocalDate date = LocalDate.now();
        return date.getYear() * 10000 + date.getMonthValue() * 100 + date.getDayOfMonth();
    }
}
