package com.joshua.voice.controller;

import com.joshua.voice.bean.UserInfoRepository;
import com.joshua.voice.entity.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@Controller
@RequestMapping(path = "/userinfo")
public class UserInfoController {

    private static Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    private UserInfoRepository userInfoRepository;

    @GetMapping(path = "getuserinfo")
    public @ResponseBody
    Optional<UserInfo> getUserInfo(@RequestParam Long openid) {
        return userInfoRepository.findById(openid);
    }

    @GetMapping(path = "all")
    public @ResponseBody
    Iterable<UserInfo> getAllUserInfo() {
        return userInfoRepository.findAll();
    }

    @GetMapping(path = "test")
    public @ResponseBody
    String userTest() {
        return userInfoRepository.toString();
    }

    @PostMapping(path = "create")
    public @ResponseBody
    String createUser(@RequestParam String nickName, @RequestParam Integer gender, @RequestParam String country,
                      @RequestParam String language, @RequestParam String city, @RequestParam String province,
                      @RequestParam String avatarUrl, @RequestParam String openid) {
        if (userInfoRepository.findByOpenId(openid).isPresent()) {
            return "user is exist";
        } else {
            Date createTime = new Date();
            UserInfo userInfo = new UserInfo(openid, nickName, gender, language, city, province, country, avatarUrl, 0, createTime);
            userInfoRepository.save(userInfo);
            return "success";
        }
    }

}
