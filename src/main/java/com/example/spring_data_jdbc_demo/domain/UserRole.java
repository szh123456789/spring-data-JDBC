package com.example.spring_data_jdbc_demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = "roleId")
@NoArgsConstructor
@AllArgsConstructor
public class UserRole {

    private Long roleId;
    private String roleName;
}
