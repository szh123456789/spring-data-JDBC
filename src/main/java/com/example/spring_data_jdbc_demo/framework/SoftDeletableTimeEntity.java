package com.example.spring_data_jdbc_demo.framework;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class SoftDeletableTimeEntity extends IdTimeEntity{

    private Boolean deleted = Boolean.FALSE;
}
