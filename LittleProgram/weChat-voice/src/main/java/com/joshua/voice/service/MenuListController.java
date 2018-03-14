package com.joshua.voice.service;

import com.joshua.voice.bean.MenuListRepository;
import com.joshua.voice.entity.MenuList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/menu")
public class MenuListController {
    @Autowired
    private MenuListRepository menuListRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewMenu(@RequestParam String name,@RequestParam String title,
                        @RequestParam String pages, @RequestParam String image){
        MenuList menu = new MenuList();
        menu.setTitle(title);
        menu.setImage(image);
        menu.setPages(pages);
        menu.setName(name);
        menuListRepository.save(menu);
        return "add menu success";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<MenuList> getAllMenu(){
        return menuListRepository.findAll();
    }
}