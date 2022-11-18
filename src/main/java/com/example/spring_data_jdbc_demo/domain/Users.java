package com.example.spring_data_jdbc_demo.domain;

import com.example.spring_data_jdbc_demo.framework.IdTimeEntity;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("users")
public class Users extends IdTimeEntity {
    private String username;
    private String password;
    private UserType userType;

    @Embedded(prefix = "role_", onEmpty = Embedded.OnEmpty.USE_NULL)
    private Role role;
}
