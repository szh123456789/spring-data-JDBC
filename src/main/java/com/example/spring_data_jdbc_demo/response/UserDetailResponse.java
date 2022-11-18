package com.example.spring_data_jdbc_demo.response;

import lombok.Data;

@Data
public class UserDetailResponse {

    private Long id;
    private String username;
    private String password;
    private Integer userType;
}
