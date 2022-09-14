package com.example.spring_data_jdbc_demo.api;

import com.example.spring_data_jdbc_demo.application.UsersAppService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class userController {

    private final UsersAppService usersAppService;

    @PostMapping("/add")
    public void addUser(){
        usersAppService.addUser();
    }
}
