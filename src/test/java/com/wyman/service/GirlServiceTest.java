package com.wyman.service;

import com.wyman.reprository.GirlRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author : wyman
 * @Date : 2018/1/3 10:17
 * description：
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class GirlServiceTest {
    @Autowired
    private GirlService girlService;
    @Test
    public void girlTwo() {
        girlService.girlTwo();

    }
}