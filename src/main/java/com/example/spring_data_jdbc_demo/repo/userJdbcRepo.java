package com.example.spring_data_jdbc_demo.repo;

import com.example.spring_data_jdbc_demo.domain.Role;
import com.example.spring_data_jdbc_demo.domain.Users;
import org.springframework.data.repository.CrudRepository;

public interface userJdbcRepo extends CrudRepository<Users, Long>{

    Users findByIdAndUsername(Long id, String username);
}
