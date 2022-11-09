package com.example.spring_data_jdbc_demo.application;

import com.example.spring_data_jdbc_demo.convert.UserConvert;
import com.example.spring_data_jdbc_demo.domain.UserType;
import com.example.spring_data_jdbc_demo.domain.Users;
import com.example.spring_data_jdbc_demo.repo.userJdbcRepo;
import com.example.spring_data_jdbc_demo.request.CreateUserRequest;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersAppService {

    private final userJdbcRepo userJdbcRepo;

    public void addUser(CreateUserRequest createUserRequest){
        Users users = UserConvert.INSTANCE.request2Users(createUserRequest);
        users.setUserType(UserType.of(createUserRequest.getUserType()));
        userJdbcRepo.save(users);
    }

    public void editUser(){
        Optional<Users> optional = userJdbcRepo.findById(3L);

        if (optional.isPresent()){
            Users users = optional.get();
            users.setUsername("dywgdyu");
            users.setPassword("4654");
            userJdbcRepo.save(users);
        }
    }
}
