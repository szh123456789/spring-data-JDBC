package com.example.spring_data_jdbc_demo.domain;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum UserType {

    ROOT(1,"超级管理员"),
    ACCOUNT(2, "普通用户");

    @EnumValue
    private final Integer code;

    private final String message;

    public static UserType of(Integer code){
        return Arrays.stream(values())
                .filter(use -> use.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }
}
