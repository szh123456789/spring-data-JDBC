package com.example.spring_data_jdbc_demo.domain;

import com.example.spring_data_jdbc_demo.framework.IdTimeEntity;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("users")
public class Users extends IdTimeEntity {
    private Long id;
    private String username;
    private String password;
}
