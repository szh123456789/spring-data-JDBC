package com.example.spring_data_jdbc_demo.domain;

import com.example.spring_data_jdbc_demo.framework.IdTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.AccessType;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Users extends IdTimeEntity {
    private @AccessType(AccessType.Type.PROPERTY) Long id;
    private String username;
    private String password;
}
