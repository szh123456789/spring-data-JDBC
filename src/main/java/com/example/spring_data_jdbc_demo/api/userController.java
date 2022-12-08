package com.example.spring_data_jdbc_demo.api;

import com.example.spring_data_jdbc_demo.application.UsersAppService;
import com.example.spring_data_jdbc_demo.domain.Users;
import com.example.spring_data_jdbc_demo.request.CreateUserRequest;
import com.example.spring_data_jdbc_demo.response.UserDetailResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class userController {

    private final UsersAppService usersAppService;

    @PostMapping("/add")
    public void addUser(@RequestBody CreateUserRequest createUserRequest){
        usersAppService.addUser(createUserRequest);
    }

    @PutMapping("/edit/{id}")
    public void editUser(@PathVariable("id") Long userId,@RequestBody CreateUserRequest createUserRequest){
        usersAppService.editUser(userId, createUserRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long userId){
        usersAppService.deleteUser(userId);
    }

    @GetMapping("{id}")
    public UserDetailResponse getUsersDetail(@PathVariable("id") Long userId){
        return usersAppService.getUsersDetail(userId);
    }

    @GetMapping
    public List<UserDetailResponse> getUsersList(@RequestParam(value = "ids", required = false) List<Long> ids){
        return usersAppService.getUsersList(ids);
    }

    @GetMapping("page")
    public Page<UserDetailResponse> getPageUsers(@RequestParam(value = "ids", required = false) List<Long> ids){
        return usersAppService.pageUsers(ids);
    }
}
