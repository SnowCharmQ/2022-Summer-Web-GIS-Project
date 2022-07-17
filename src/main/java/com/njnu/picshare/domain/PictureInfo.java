package com.njnu.picshare.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Authod oruizn
 * @date 2021年11月2021/11/29 0029日下午 22:33
 */
@Data
public class PictureInfo  implements Serializable {
    private Integer id;
    private String picName;//图片名称
    private Double longitude;//图片经度
    private Double latitude;//图片纬度
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date uploadTime;//图片上传时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date shootTime;//图片拍摄时间
    private String picAttachment;//图片附言
    private String picLocation;//图片位置
}
