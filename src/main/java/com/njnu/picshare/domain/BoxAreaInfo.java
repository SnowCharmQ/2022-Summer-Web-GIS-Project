package com.njnu.picshare.domain;

import lombok.Data;

@Data
public class BoxAreaInfo {
    private Double longitude;//中心经度
    private Double latitude;//中心纬度
    private Integer pictureCount;//该区域的照片数量
    private String firstPictureName;//该区域第一张照片的名字
    private String boxExtent;//区域范围t
}
