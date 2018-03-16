package com.joshua.voice.controller;

import com.joshua.voice.bean.VoiceRepository;
import com.joshua.voice.entity.Voice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/voice")
public class VoiceController {

    @Autowired
    private VoiceRepository voiceRepository;

    @GetMapping(path = "test")
    public @ResponseBody String getVoicePath(){
        return "the path of voice";
    }

}
