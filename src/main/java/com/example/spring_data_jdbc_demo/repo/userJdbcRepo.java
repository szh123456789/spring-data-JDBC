package com.example.spring_data_jdbc_demo.repo;

import com.example.spring_data_jdbc_demo.domain.Role;
import com.example.spring_data_jdbc_demo.domain.Users;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface userJdbcRepo extends CrudRepository<Users, Long>{

    Users findByIdAndUsername(Long id, String username);

    List<Users> findByIdIn(List<Long> ids);


}
