package com.example.spring_data_jdbc_demo.convert;

import com.example.spring_data_jdbc_demo.domain.Users;
import com.example.spring_data_jdbc_demo.domain.UserType;
import com.example.spring_data_jdbc_demo.request.CreateUserRequest;
import com.example.spring_data_jdbc_demo.response.UserDetailResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserConvert {

    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

//    @Mappings({
//            @Mapping(source = "roleId", target = "role.id"),
//            @Mapping(source = "roleName", target = "role.name")
//    })
    Users request2Users(CreateUserRequest createUserRequest);

    default UserType userTypeConvert(Integer code){
        return UserType.of(code);
    }

    UserDetailResponse users2Response(Users users);

    default Integer map(UserType userType){
        return userType.getCode();
    }
}
