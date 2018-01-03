package com.wyman.service;

import com.wyman.domian.Girl;
import com.wyman.enums.ResultEnum;
import com.wyman.exception.GirlException;
import com.wyman.reprository.GirlRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @Author : wyman
 * @Date : 2018/1/2 10:12
 */
@Service
public class GirlService {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(GirlService.class);

    @Autowired
    GirlRepository girlRepository;

    @Transactional
    public void girlTwo() {

        Girl girl1 = new Girl();
        girl1.setCupSize("F");
        girl1.setAge(18);
        girl1.setMoney(2.3);
        girlRepository.save(girl1);

        Girl girl2 = new Girl();
        girl2.setCupSize("B");
        girl2.setAge(18);
        girl2.setMoney(2.4);
        girlRepository.save(girl2);

    }

    public void findById(Integer id) throws Exception{
        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();
        if (age < 10) {
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        } else if (age > 10 && age < 16) {
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }

    public Girl findOne(Integer id) {
        return girlRepository.findOne(id);

    }
}
