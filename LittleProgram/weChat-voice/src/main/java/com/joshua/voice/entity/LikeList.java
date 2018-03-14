package com.joshua.voice.entity;

import javax.persistence.*;

@Entity
public class LikeList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Voice voice;

    @ManyToOne
    private UserInfo user;

    public LikeList() {
    }

    public LikeList(Voice voice, UserInfo user) {
        this.voice = voice;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public Voice getVoice() {
        return voice;
    }

    public void setVoice(Voice voice) {
        this.voice = voice;
    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }
}
