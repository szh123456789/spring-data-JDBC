package com.example.spring_data_jdbc_demo.application;

import com.example.spring_data_jdbc_demo.repo.RoleJdbcRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RoleAppService {

    private final RoleJdbcRepo roleJdbcRepo;

    public void deleteById(Long roleId){
        roleJdbcRepo.deleteById(roleId);
    }
}
