package com.joshua.voice.bean;

import org.springframework.data.repository.CrudRepository;
import com.joshua.voice.entity.MenuList;

public interface MenuListRepository extends  CrudRepository<MenuList,Long> {
}
