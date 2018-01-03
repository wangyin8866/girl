package com.wyman.utils;

import com.wyman.domian.Result;

/**
 * @Author : wyman
 * @Date : 2018/1/2 14:44
 */
public class ResultUtil {
    public static Result success(Object o) {
        Result<Object> result = new Result<>();
        result.setCode(1);
        result.setMsg("成功！");
        result.setData(o);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
