package com.example.spring_data_jdbc_demo.domain;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("users")
public class Users {
    private Long id;
    private String username;
    private String password;
}
