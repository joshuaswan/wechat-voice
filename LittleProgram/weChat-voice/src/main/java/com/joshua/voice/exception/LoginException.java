package com.joshua.voice.exception;

/**
 * Created by joshua on 2018/3/16.
 */
public class LoginException extends Exception {
    public LoginException(String content) {
        this.content = content;
    }

    public LoginException(String message, String content) {
        super(message);
        this.content = content;
    }

    public LoginException(String message, Throwable cause, String content) {
        super(message, cause);
        this.content = content;
    }

    public LoginException(Throwable cause, String content) {
        super(cause);
        this.content = content;
    }

    public LoginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String content) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.content = content;
    }

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
