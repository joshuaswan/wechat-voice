package com.joshua.voice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by joshua on 2018/3/16.
 * ����ཫ��д��΢��ͨ�ŵĸ��ֽӿڣ������½��ɨ���½��api
 */
@Controller
@RequestMapping(path = "wechat")
public class WeChatController {

    private static Logger logger = LoggerFactory.getLogger(WeChatController.class);

    @GetMapping(path = "test")
    public @ResponseBody String loginTest(@RequestParam String test){
        logger.info("the param of get request " + test);
        return test;
    }
}
