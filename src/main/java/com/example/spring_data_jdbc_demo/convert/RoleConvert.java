package com.example.spring_data_jdbc_demo.convert;

import com.example.spring_data_jdbc_demo.domain.Role;
import com.example.spring_data_jdbc_demo.request.UpdateRoleRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoleConvert {

    RoleConvert INSTANCE = Mappers.getMapper(RoleConvert.class);

    Role updateRequest2Role(UpdateRoleRequest updateRoleRequest);
}
