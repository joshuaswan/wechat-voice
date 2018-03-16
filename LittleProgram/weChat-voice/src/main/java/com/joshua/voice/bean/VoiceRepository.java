package com.joshua.voice.bean;

import com.joshua.voice.entity.Voice;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by joshua on 2018/3/16.
 */
public interface VoiceRepository extends CrudRepository<Voice,Long> {
}
