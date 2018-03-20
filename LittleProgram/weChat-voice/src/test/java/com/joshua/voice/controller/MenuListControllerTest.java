package com.joshua.voice.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2018/3/20.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MenuListControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void addNewMenu() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/menu/add")
                .param("name","voiceSquare").param("title","…˘“Ùπ„≥°")
                .param("pages","/pages/voiceSquare/voiceSquare").param("icon","http://localhost:8080/images/test.png"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void getAllMenu() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/menu/all"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void deleteMenu() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/menu/delete").param("id",""));
    }

}