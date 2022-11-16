package com.example.spring_data_jdbc_demo.api;

import com.example.spring_data_jdbc_demo.application.UsersAppService;
import com.example.spring_data_jdbc_demo.request.CreateUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class userController {

    private final UsersAppService usersAppService;

    @PostMapping("/add")
    public void addUser(@RequestBody CreateUserRequest createUserRequest){
        usersAppService.addUser(createUserRequest);
    }

    @PutMapping("/edit")
    public void editUser(){
        usersAppService.editUser();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long userId){
        usersAppService.deleteUser(userId);
    }
}
