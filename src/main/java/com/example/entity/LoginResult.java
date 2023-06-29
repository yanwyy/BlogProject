package com.example.entity;

import lombok.Data;

@Data
public class LoginResult {
    private Integer code;//返回相应的状态
    private Object result;//用于存真正返回的数据
}
