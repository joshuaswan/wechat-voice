package com.joshua.voice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/voice")
public class VoiceController {

    @GetMapping(path = "test")
    public String getVoicePath(){
        return "the path of voice";
    }

}
