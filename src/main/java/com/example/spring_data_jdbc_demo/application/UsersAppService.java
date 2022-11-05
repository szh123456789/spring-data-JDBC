package com.example.spring_data_jdbc_demo.application;

import com.example.spring_data_jdbc_demo.convert.UserConvert;
import com.example.spring_data_jdbc_demo.domain.UserType;
import com.example.spring_data_jdbc_demo.domain.Users;
import com.example.spring_data_jdbc_demo.repo.userJdbcRepo;
import com.example.spring_data_jdbc_demo.request.CreateUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersAppService {

    private final userJdbcRepo userJdbcRepo;

    public void addUser(CreateUserRequest createUserRequest){
        Users users = UserConvert.INSTANCE.request2Users(createUserRequest);
        users.setUserType(UserType.of(createUserRequest.getUserType()));
        userJdbcRepo.save(users);
    }
}
