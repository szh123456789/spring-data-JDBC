package com.example.spring_data_jdbc_demo.domain;

import com.example.spring_data_jdbc_demo.framework.IdTimeEntity;
import com.example.spring_data_jdbc_demo.framework.SoftDeletableTimeEntity;
import com.google.common.collect.Sets;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@Table("users")
@AllArgsConstructor
@NoArgsConstructor
public class Users extends SoftDeletableTimeEntity {

    private String username;
    private String password;
    private UserType userType;
    private Set<UserRole> userRoles = Sets.newHashSet();

    public void addUserRoles(List<Role> roles) {
        this.userRoles.clear();
        Set<UserRole> userRoles = roles.stream().
                map(role -> new UserRole(role.getId(), role.getName()))
                .collect(Collectors.toSet());
        this.userRoles.addAll(userRoles);
    }
}
