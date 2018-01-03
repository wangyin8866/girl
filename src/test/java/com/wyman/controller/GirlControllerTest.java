package com.wyman.controller;

import com.wyman.domian.Girl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author : wyman
 * @Date : 2018/1/3 10:43
 * description：
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GirlControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void findById() {
        try {
            mockMvc.perform(MockMvcRequestBuilders.post("/girl/findById").param("id","1")).andExpect(MockMvcResultMatchers.status().isOk());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void getGirlList() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/girl/list")).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void selectGirlByAge() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/girl/selectByAge").param("age","18")).andExpect(MockMvcResultMatchers.status().isOk());
    }
}