package com.wyman.controller;

import com.wyman.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : wyman
 * @Date : 2017/12/28 16:44
 */
@RestController
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;

    @GetMapping(value = "/hello")
    public String say(@RequestParam(value = "id" ,defaultValue = "22") String myId) {

        if (myId == null) {
            return "id 不能为空";
        } else {
            return "id : " + myId;
        }

    }
}
