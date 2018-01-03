package com.wyman.exception;

import com.wyman.enums.ResultEnum;

/**
 * @Author : wyman
 * @Date : 2018/1/2 16:00
 */
public class GirlException extends RuntimeException {
    private Integer code;


    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
