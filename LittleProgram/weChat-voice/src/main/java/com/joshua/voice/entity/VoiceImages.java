package com.joshua.voice.entity;

import javax.persistence.*;

@Entity
public class VoiceImages {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private VoiceTheme voiceTheme;

    @ManyToOne
    private Voice voice;

    private String imagePath;

    private Integer imageOrder;

    private Integer playTime;

    public VoiceImages() {
    }

    public VoiceImages(VoiceTheme voiceTheme, Voice voice, String imagePath, Integer imageOrder, Integer playTime) {
        this.voiceTheme = voiceTheme;
        this.voice = voice;
        this.imagePath = imagePath;
        this.imageOrder = imageOrder;
        this.playTime = playTime;
    }
}
