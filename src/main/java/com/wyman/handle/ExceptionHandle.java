package com.wyman.handle;

import com.wyman.domian.Result;
import com.wyman.enums.ResultEnum;
import com.wyman.exception.GirlException;
import com.wyman.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : wyman
 * @Date : 2018/1/2 15:38
 * 捕获异常
 */
@ControllerAdvice
public class ExceptionHandle {
    private final static Logger LOGGER = LoggerFactory.getLogger(ExceptionHandle.class);
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof GirlException) {
            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(), girlException.getMessage());
        } else {
            LOGGER.error("系统异常{}" ,e);
            return ResultUtil.error(ResultEnum.UNKONW_ERROR.getCode(),ResultEnum.UNKONW_ERROR.getMsg());
        }

    }
}
