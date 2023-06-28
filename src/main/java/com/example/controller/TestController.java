package com.example.controller;

import com.example.entity.SteamGame;
import com.example.entity.User;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;

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
    @GetMapping("/say2/{gender}/{name}")
    public String TestGet2(@PathVariable String name, @PathVariable String gender){
        String str=name+gender;

        return str;
    }


//    @PostMapping("/login")
//        public String postData(@RequestBody User user){
//
//            System.out.println(user.getName());
//            System.out.println(user.getPwd());
//
//            if(user.getName().equals("admin") && user.getPwd().equals("admin")){
//                System.out.println("Login Success!");
//                return "success";
//            }
//            else{
//                System.out.println("login failed");
//                return "fail";
//            }

//    }
}
