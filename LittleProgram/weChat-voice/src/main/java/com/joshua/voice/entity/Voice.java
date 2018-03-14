package com.joshua.voice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Voice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String filePath;

    private Date createTime;

    @JsonIgnore
    @ManyToOne
    private VoiceTheme themeId;

    @JsonIgnore
    @ManyToOne
    private UserInfo createUser;

    private Integer likeNum;

    private Integer downNum;

    private Integer collection;

    @OneToMany(mappedBy = "id")
    private Set<LikeList> likes = new HashSet<>();

    @OneToMany(mappedBy = "id")
    private Set<DownList> downs = new HashSet<>();

    public Voice(String filePath, Date createTime, VoiceTheme themeId, UserInfo createUser,
                 Integer likeNum, Integer downNum, Integer collection, Set<LikeList> likes, Set<DownList> downs) {
        this.filePath = filePath;
        this.createTime = createTime;
        this.themeId = themeId;
        this.createUser = createUser;
        this.likeNum = likeNum;
        this.downNum = downNum;
        this.collection = collection;
        this.likes = likes;
        this.downs = downs;
    }

    public Voice() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public VoiceTheme getThemeId() {
        return themeId;
    }

    public void setThemeId(VoiceTheme themeId) {
        this.themeId = themeId;
    }

    public UserInfo getCreateUser() {
        return createUser;
    }

    public void setCreateUser(UserInfo createUser) {
        this.createUser = createUser;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public Integer getDownNum() {
        return downNum;
    }

    public void setDownNum(Integer downNum) {
        this.downNum = downNum;
    }

    public Integer getCollection() {
        return collection;
    }

    public void setCollection(Integer collection) {
        this.collection = collection;
    }

    public Set<LikeList> getLikes() {
        return likes;
    }

    public void setLikes(Set<LikeList> likes) {
        this.likes = likes;
    }

    public Set<DownList> getDowns() {
        return downs;
    }

    public void setDowns(Set<DownList> downs) {
        this.downs = downs;
    }
}
