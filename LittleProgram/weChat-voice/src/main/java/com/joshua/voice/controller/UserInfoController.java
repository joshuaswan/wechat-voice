package com.joshua.voice.controller;

import com.joshua.voice.bean.UserInfoRepository;
import com.joshua.voice.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequestMapping(path = "/userinfo")
public class UserInfoController {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @GetMapping(path = "getuserinfo")
    public @ResponseBody
    Optional<UserInfo> getUserInfo(@RequestParam Long openid){
        return userInfoRepository.findById(openid);
    }

    @GetMapping(path = "all")
    public @ResponseBody Iterable<UserInfo> getAllUserInfo(){
        return userInfoRepository.findAll();
    }

    @GetMapping(path = "test")
    public String userTest(){
        return userInfoRepository.toString();
    }

}
