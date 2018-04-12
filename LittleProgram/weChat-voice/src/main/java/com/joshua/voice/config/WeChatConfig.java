package com.joshua.voice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by joshua on 2018/3/16.
 */

@Component
@ConfigurationProperties(prefix = "wechat")
public class WeChatConfig {

    private String appId;

    private String secret;

    private String imagePath;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "WeChatConfig{" +
                "appId='" + appId + '\'' +
                ", secret='" + secret + '\'' +
                ", imagePath='" + imagePath + '\'' +
                '}';
    }
}
