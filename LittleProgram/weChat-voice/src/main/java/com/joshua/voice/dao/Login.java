package com.joshua.voice.dao;

/**
 * Created by joshua on 2018/3/16.
 */
public class Login {

    private String sessionKey;
    private String openId;

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    @Override
    public String toString() {
        return "Login{" +
                "sessionKey='" + sessionKey + '\'' +
                ", openId='" + openId + '\'' +
                '}';
    }
}
