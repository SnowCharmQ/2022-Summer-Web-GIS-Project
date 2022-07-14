package com.njnu.picshare.util;

/**
 * 用于地理信息转换的工具类
 */
public class GeoProcessUtil {
    /**
     * 将图片中以度分秒形式表达的经纬度转换为十进制经纬度
     * @param DMS：即Degree, Minute, Second
     */
    public static Double tranformDMSToDegree(String DMS){
        try {
            String[] lntArr = DMS.trim()
                    .replace("°", ";")
                    .replace("′", ";")
                    .replace("'", ";")
                    .replace("\"", "")
                    .split(";");
            double result = 0D;
            for (int i = lntArr.length; i >0 ; i--) {
                double v = Double.parseDouble(lntArr[i-1]);
                if(i==1){
                    result=v+result;
                }else{
                    result=(result+v)/60;
                }
            }
            return NumberUtil.setNumberScale(result, 6);
        }catch (NullPointerException e){
            return null;
        }
    }

    public static String GeometryToString(double longitude, double latitude){
        return "POINT" + "(" + longitude + " " + latitude + ")";
    }
}
