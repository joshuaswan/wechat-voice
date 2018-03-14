package com.joshua.voice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class VoiceTheme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String createUser;

    private Date createTime;

    private String title;

    private String content;

    @JsonIgnore
    @ManyToOne
    private ThemeType themeType;

    @OneToMany(mappedBy = "id")
    private Set<Voice> voices = new HashSet<>();

    public VoiceTheme() {
    }

    public VoiceTheme(String createUser, Date createTime, String title, String content,
                      ThemeType themeType, Set<Voice> voices) {
        this.createUser = createUser;
        this.createTime = createTime;
        this.title = title;
        this.content = content;
        this.themeType = themeType;
        this.voices = voices;
    }
}
