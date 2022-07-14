package com.njnu.picshare.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class JsonResult implements Serializable {
    private static final long serialVersionUID = -6559362101721248596L;
    private Object data;
    private String msg;
    private String url;
}
