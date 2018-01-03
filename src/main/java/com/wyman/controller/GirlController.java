package com.wyman.controller;

import com.wyman.domian.Girl;
import com.wyman.domian.Result;
import com.wyman.reprository.GirlRepository;
import com.wyman.service.GirlService;
import com.wyman.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Author : wyman
 * @Date : 2017/12/29 17:50
 */
@RestController
@RequestMapping("/girl")
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;

    /**
     * 查询女生列表
     */
    @PostMapping(value = "/list")
    public List<Girl> getGirlList() {
        return girlRepository.findAll();
    }

    /**
     * 增加女生
     */
    @PostMapping("/add")
    public Result addGirl(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return null;
//            return ResultUtil.error(0, bindingResult.getFieldError().getDefaultMessage());
        }
        girlRepository.save(girl);

        return ResultUtil.success(girl);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public List<Girl> deleteGirl(@RequestParam("id") Integer id) {
        girlRepository.delete(id);

        return getGirlList();
    }

    /**
     * 修改
     */
    @PostMapping("/modification")
    public Girl modificationGirl(@RequestParam("id") Integer id,
                                 @RequestParam("cupSize") String cupSize,
                                 @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);

    }

    /**
     * 查询单个女生
     */
    @PostMapping("/selectById")
    public Girl selectGirlById(@RequestParam("id") Integer id) {
        return girlRepository.findOne(id);
    }

    /**
     * 根据年龄查询
     */
    @PostMapping("/selectByAge")
    public List<Girl> selectGirlByAge(@RequestParam("age") Integer age) {
        return girlRepository.findByAge(age);
    }

    /**
     * 添加，测试失误
     */
    @PostMapping("/addTwo")
    public List<Girl> addTwo() {
        girlService.girlTwo();
        return girlRepository.findAll();
    }

    @PostMapping("/findById")
    public void findById(@RequestParam("id") Integer id) throws Exception{

        girlService.findById(id);
    }
}
