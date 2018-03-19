package com.joshua.voice.entity;

import org.hibernate.validator.constraints.UniqueElements;
import org.json.JSONException;
import org.json.JSONObject;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String openId;

    private String nickName;

    private Integer gender;

    private String language;

    private String city;

    private String province;

    private String country;

    private String avatarUrl;

    private Integer isSystem;

    private Date createTime;

    @OneToMany(mappedBy = "id")
    private Set<Voice> voices = new HashSet<>();

    static UserInfo BuildFromJson(JSONObject json) {
        if (json == null) return null;

        UserInfo userInfo = new UserInfo();
        try {
            if (json.has("openId")) userInfo.openId = json.getString("openId");
            if (json.has("nickName")) userInfo.nickName = json.getString("nickName");
            if (json.has("avatarUrl")) userInfo.avatarUrl = json.getString("avatarUrl");
            if (json.has("gender")) userInfo.gender = json.getInt("gender");
            if (json.has("language")) userInfo.language = json.getString("language");
            if (json.has("city")) userInfo.city = json.getString("city");
            if (json.has("province")) userInfo.province = json.getString("province");
            if (json.has("country")) userInfo.country = json.getString("country");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return userInfo;
    }
    public UserInfo() {
    }

    public UserInfo(String openId, String nickName, Integer gender, String language, String city, String province, String country, String avatarUrl, Integer isSystem, Date createTime) {
        this.openId = openId;
        this.nickName = nickName;
        this.gender = gender;
        this.language = language;
        this.city = city;
        this.province = province;
        this.country = country;
        this.avatarUrl = avatarUrl;
        this.isSystem = isSystem;
        this.createTime = createTime;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Integer isSystem) {
        this.isSystem = isSystem;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", openId='" + openId + '\'' +
                ", nickName='" + nickName + '\'' +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", isSystem=" + isSystem +
                ", voices=" + voices +
                '}';
    }
}
