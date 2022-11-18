package com.example.spring_data_jdbc_demo.domain;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.example.spring_data_jdbc_demo.framework.IdEntity;
import com.example.spring_data_jdbc_demo.framework.IdTimeEntity;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("role")
public class Role {

    private Long id;

    private String name;
}
