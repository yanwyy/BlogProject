package com.example.controller;

import com.example.entity.SteamGame;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class TestController {
    @GetMapping("/say")
    public String TestGet(SteamGame e) {
        String str1 = "GameName = " + e.getGameName();
        String str2 = "Price = " + e.getPrice();
        String str3 = str1+"\n"+str2;
        System.out.println(str1+"\n"+str2);
        return str3;
    }
}
