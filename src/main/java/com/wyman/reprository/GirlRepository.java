package com.wyman.reprository;

import com.wyman.domian.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author : wyman
 * @Date : 2017/12/29 17:49
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
    List<Girl>findByAge(Integer age);
}
