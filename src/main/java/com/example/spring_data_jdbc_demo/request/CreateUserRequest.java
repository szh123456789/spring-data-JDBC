package com.example.spring_data_jdbc_demo.request;

import com.example.spring_data_jdbc_demo.domain.Role;
import lombok.Data;

@Data
public class CreateUserRequest {

    private String username;
    private String password;
    private Integer userType;
    private Long roleId;
    private String roleName;
}
