package com.yangche.orderservice.model;

import lombok.Data;

@Data
public class User {

    private Long userId;

    private String userName;

    private String email;

    private String password;

    private String address;

    private String phone;

    private int type;
}
