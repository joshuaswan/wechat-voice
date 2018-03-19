package com.joshua.voice.controller;

import com.joshua.voice.bean.VoiceThemeRepository;
import com.joshua.voice.entity.VoiceTheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by joshua on 2018/3/19.
 */
@Controller
@RequestMapping(path = "theme")
public class ThemeController {

    @Autowired
    private VoiceThemeRepository voiceThemeRepository;

    @GetMapping(path = "all")
    public @ResponseBody Iterable<VoiceTheme> getAll(){
        return voiceThemeRepository.findAll();
    }

    @RequestMapping(path = "create")
    public @ResponseBody String createTheme(){
        return "success";
    }
}
