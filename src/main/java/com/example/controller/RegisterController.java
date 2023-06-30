package com.example.controller;

import com.example.entity.LoginResult;
import com.example.entity.RegisterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class RegisterController {
    @Autowired
    private JdbcTemplate jdbc;

    @PostMapping("/register")
    public LoginResult doRegister(@RequestBody RegisterUser reg) {
        LoginResult res = new LoginResult();//需要new对象
        if(!reg.getRpwd().equals(reg.getUser().getPwd())){

                res.setCode(201);
                return res;
        }
        try {
            System.out.println(reg.getUser().getName()+reg.getUser().getPwd());
            jdbc.update("INSERT INTO User (name,pwd) VALUES  (?,?) ",reg.getUser().getName(),reg.getUser().getPwd());
            res.setCode(200);
            res.setResult("ok");
            return res;
        } catch (DataAccessException e) {
            e.printStackTrace();
            res.setCode(201);
            res.setResult("出现异常: "+e.getMessage());
            return res;
        }
    }
}
