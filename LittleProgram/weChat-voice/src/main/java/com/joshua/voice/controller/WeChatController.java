package com.joshua.voice.controller;

import com.alibaba.fastjson.JSON;
import com.joshua.voice.bean.UserInfoRepository;
import com.joshua.voice.dao.Login;
import com.joshua.voice.entity.UserInfo;
import com.joshua.voice.entity.WeChatConfig;
import com.joshua.voice.exception.LoginException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;


/**
 * Created by joshua on 2018/3/16.
 * 这个类将编写与微信通信的各种接口，例如登陆、扫码登陆等api
 */
@Controller
@RequestMapping(path = "wechat")
public class WeChatController {
    public static String API_URL_PRE = "https://api.weixin.qq.com/sns/jscode2session?";

    private static Logger logger = LoggerFactory.getLogger(WeChatController.class);

    @Autowired
    public WeChatConfig weChatConfig;

    @Autowired
    public UserInfoRepository userInfoRepository;

    @GetMapping(path = "login")
    public @ResponseBody
    Login login(@RequestParam String code) throws LoginException {
        if (code == null || code.isEmpty()) {
            throw new LoginException("对应code信息为空");
        } else {
            StringBuilder apiUrl = new StringBuilder();
            apiUrl.append(API_URL_PRE).append("appid=").append(weChatConfig.getAppId()).
                    append("&secret=").append(weChatConfig.getSecret()).append("&js_code=").append(code);
            RestTemplate restTemplate = new RestTemplate();
            String result = restTemplate.getForObject(apiUrl.toString(), String.class);
            Login login = JSON.parseObject(result, Login.class);
            logger.info(login.toString());
            return login;
        }
    }
}
