package com.joshua.voice.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ThemeType {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String type;

    @OneToMany(mappedBy = "id")
    private Set<VoiceTheme> voiceThemes = new HashSet<>();

    public ThemeType() {
    }

    public ThemeType(String type, Set<VoiceTheme> voiceThemes) {
        this.type = type;
        this.voiceThemes = voiceThemes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
