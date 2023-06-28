package com.example.controller;
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
    public String dologin(@RequestBody User user) {
        System.out.println(user.getName() + user.getPwd());
        try {

            User returnuser = jdbc.queryForObject("select * from User where name = ? and pwd = ?", new BeanPropertyRowMapper<>(User.class),
                    user.getName(), user.getPwd());
            return "success";
        } catch (DataAccessException e) {
            e.printStackTrace();
            return "fail";
        }
    }
}
