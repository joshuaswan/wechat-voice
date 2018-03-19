package com.joshua.voice.controller;

import com.joshua.voice.bean.VoiceImageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by joshua on 2018/3/19.
 */
@Controller
@RequestMapping(path = "image")
public class ImageController {

    private static final Logger logger = LoggerFactory.getLogger(ImageController.class);

    @Autowired
    private VoiceImageRepository voiceImageRepository;

    @RequestMapping(path = "upload")
    public @ResponseBody String uploadImage(){
        return "success";
    }


}
