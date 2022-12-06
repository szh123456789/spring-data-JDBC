package com.example.spring_data_jdbc_demo.response;

import com.example.spring_data_jdbc_demo.domain.UserRole;
import com.google.common.collect.Sets;
import lombok.Data;

import java.util.Set;

@Data
public class UserDetailResponse {

    private Long id;
    private String username;
    private String password;
    private Integer userType;
    private Set<UserRole> userRoles = Sets.newHashSet();
}
