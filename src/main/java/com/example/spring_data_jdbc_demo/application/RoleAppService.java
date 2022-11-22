package com.example.spring_data_jdbc_demo.application;

import com.example.spring_data_jdbc_demo.convert.RoleConvert;
import com.example.spring_data_jdbc_demo.domain.Role;
import com.example.spring_data_jdbc_demo.repo.RoleJdbcRepo;
import com.example.spring_data_jdbc_demo.request.UpdateRoleRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class RoleAppService {

    private final RoleJdbcRepo roleJdbcRepo;

    public void deleteById(Long roleId){
        roleJdbcRepo.deleteById(roleId);
    }

    public void editRole(Long roleId, UpdateRoleRequest updateRoleRequest) {
        Optional<Role> role = roleJdbcRepo.findById(roleId);

        if (role.isPresent()){
            Role role1 = role.get();
            convert(role1, updateRoleRequest);
            roleJdbcRepo.save(role1);
        }
    }

    public void convert(Role role, UpdateRoleRequest updateRoleRequest){
        Role updateRole = RoleConvert.INSTANCE.updateRequest2Role(updateRoleRequest);
        role.setName(updateRole.getName());
    }
}
