package com.example.spring_data_jdbc_demo.application;

import com.example.spring_data_jdbc_demo.convert.UserConvert;
import com.example.spring_data_jdbc_demo.domain.Role;
import com.example.spring_data_jdbc_demo.domain.UserType;
import com.example.spring_data_jdbc_demo.domain.Users;
import com.example.spring_data_jdbc_demo.repo.RoleJdbcRepo;
import com.example.spring_data_jdbc_demo.repo.userJdbcRepo;
import com.example.spring_data_jdbc_demo.request.CreateUserRequest;
import com.example.spring_data_jdbc_demo.response.UserDetailResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersAppService {

    private final userJdbcRepo userJdbcRepo;
    private final RoleJdbcRepo roleJdbcRepo;

    public void addUser(CreateUserRequest createUserRequest){
        Users users = UserConvert.INSTANCE.request2Users(createUserRequest);
        users.setUserType(UserType.of(createUserRequest.getUserType()));
        List<Role> roleList = (List<Role>) roleJdbcRepo.findAllById(createUserRequest.getRoleIds());
        users.addUserRoles(roleList);
        userJdbcRepo.save(users);
    }

    public void editUser(Long userId, CreateUserRequest createUserRequest){
        Users users = userJdbcRepo.findByIdAndUsername(userId, "宋志恒123");
        invoke(users, createUserRequest);

        List<Role> roleList = (List<Role>) roleJdbcRepo.findAllById(createUserRequest.getRoleIds());
        users.addUserRoles(roleList);
        userJdbcRepo.save(users);

    }

    public void deleteUser(Long userId) {
        userJdbcRepo.deleteById(userId);
    }

    public UserDetailResponse getUsersDetail(Long userId) {
        Users user = userJdbcRepo.findById(userId).get();
        return UserConvert.INSTANCE.users2Response(user);
    }

    public void invoke(Users users, CreateUserRequest createUserRequest){
        Users users1 = UserConvert.INSTANCE.request2Users(createUserRequest);
        users.setUserType(users1.getUserType());
        users.setUsername(users1.getUsername());
        users.setPassword(users1.getPassword());
    }

    public List<UserDetailResponse> getUsersList(List<Long> ids) {
        List<Users> users = userJdbcRepo.findByIdIn(ids);
        List<UserDetailResponse> userDetailResponses = new ArrayList<>();

        users.forEach(usr ->
            userDetailResponses.add(UserConvert.INSTANCE.users2Response(usr))
        );

        return userDetailResponses;
    }
}
