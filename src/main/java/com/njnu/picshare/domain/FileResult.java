package com.njnu.picshare.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class FileResult implements Serializable {
    //判断结果
    private boolean success;
    //返回信息
    private String message;
    //存储的ID
    private String picName;

    public FileResult(boolean success, String message, String name) {
        this.success = success;
        this.message = message;
        this.picName = name;
    }

    public FileResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }
}
