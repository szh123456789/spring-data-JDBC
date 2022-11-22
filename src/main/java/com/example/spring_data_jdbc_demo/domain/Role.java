package com.example.spring_data_jdbc_demo.domain;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.example.spring_data_jdbc_demo.framework.IdEntity;
import com.example.spring_data_jdbc_demo.framework.IdTimeEntity;
import com.example.spring_data_jdbc_demo.framework.SoftDeletableTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("role")
@AllArgsConstructor
@NoArgsConstructor
public class Role extends IdTimeEntity{

    private String name;


}
