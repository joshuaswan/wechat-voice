package com.joshua.voice.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;

import java.nio.file.Paths;

/**
 * Created by joshua on 2018/3/20.
 */
public class VoiceManager {
    private final ResourceLoader resourceLoader;


    @Autowired
    public VoiceManager(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public ResponseEntity<?> getImage(String path){
        try {
            return ResponseEntity.ok(resourceLoader.getResource("file:" + Paths.get(path).toString()));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

}
