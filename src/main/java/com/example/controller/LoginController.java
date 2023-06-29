package com.example.controller;
import com.example.entity.LoginResult;
import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class LoginController {
    @Autowired
    private JdbcTemplate jdbc;

    @PostMapping("/login")
    public LoginResult dologin(@RequestBody User user) {
        System.out.println(user.getName() + user.getPwd());
        LoginResult res = new LoginResult();//需要new对象
        try {
            User returnuser = jdbc.queryForObject("select * from User where name = ? and pwd = ?", new BeanPropertyRowMapper<>(User.class),
                    user.getName(), user.getPwd());
            res.setCode(200);
            res.setResult(returnuser);
            return res;
        } catch (DataAccessException e) {
            e.printStackTrace();
            res.setCode(400);
            res.setResult("出现异常: "+e.getMessage());
            return res;
        }
    }
}
