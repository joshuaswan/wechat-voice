package com.joshua.voice;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by joshua on 2018/4/9.
 */
public class EncryptPassword {


    @Test
    public void encryptPassword(){
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("joshua");
        String encrypted = encryptor.encrypt("password");
        System.out.println(encrypted);
    }
}
