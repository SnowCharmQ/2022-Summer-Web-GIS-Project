package com.njnu.picshare.util;

import java.math.BigDecimal;

/**
 * 用于数字精度处理的工具类
 */
public class NumberUtil {

    public static Double setNumberScale(Double number, int scale){
        BigDecimal bg = new BigDecimal(number);
        double f1 = bg.setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
        return f1;
    }
}
