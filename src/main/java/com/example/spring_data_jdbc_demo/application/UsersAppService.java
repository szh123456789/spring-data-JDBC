package com.example.spring_data_jdbc_demo.application;

import com.example.spring_data_jdbc_demo.repo.userJdbcRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersAppService {

    private final userJdbcRepo userJdbcRepo;

    public void addUser(){

    }
}
