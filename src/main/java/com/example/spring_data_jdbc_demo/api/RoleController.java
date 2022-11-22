package com.example.spring_data_jdbc_demo.api;

import com.example.spring_data_jdbc_demo.application.RoleAppService;
import com.example.spring_data_jdbc_demo.request.UpdateRoleRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("role")
@RequiredArgsConstructor
public class RoleController {

    private final RoleAppService roleAppService;

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") Long roleId){
        roleAppService.deleteById(roleId);
    }

    @PutMapping("{id}")
    public void editRole(@PathVariable("id") Long roleId,
                         @RequestBody UpdateRoleRequest updateRoleRequest){
        roleAppService.editRole(roleId, updateRoleRequest);
    }
}
