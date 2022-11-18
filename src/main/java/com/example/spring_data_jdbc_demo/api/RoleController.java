package com.example.spring_data_jdbc_demo.api;

import com.example.spring_data_jdbc_demo.application.RoleAppService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("role")
@RequiredArgsConstructor
public class RoleController {

    private final RoleAppService roleAppService;

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") Long roleId){
        roleAppService.deleteById(roleId);
    }
}
