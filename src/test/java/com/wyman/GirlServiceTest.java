package com.wyman;

import com.wyman.domian.Girl;
import com.wyman.reprository.GirlRepository;
import com.wyman.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author : wyman
 * @Date : 2018/1/3 09:58
 * description：
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class GirlServiceTest {
    @Autowired
    private GirlService girlService;

    @Test
    public void findOneTest() {
        Girl girl = girlService.findOne(3);
        Assert.assertEquals(new Integer(40), girl.getAge());
    }
}
