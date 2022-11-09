package com.example.spring_data_jdbc_demo.convert;

import com.example.spring_data_jdbc_demo.domain.Users;
import com.example.spring_data_jdbc_demo.domain.UserType;
import com.example.spring_data_jdbc_demo.request.CreateUserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserConvert {

    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    Users request2Users(CreateUserRequest createUserRequest);

    default UserType userTypeConvert(Integer code){
        return UserType.of(code);
//        for(UserType userType:UserType.values()){
//            if (userType.getCode().equals(code)){
//                return userType;
//            }
//        }
//        return null;
    }
}
