package com.joshua.voice.bean;

import com.joshua.voice.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserInfoRepository extends CrudRepository<UserInfo,Long> {

    Optional<UserInfo> findByOpenId(String openId);
}
