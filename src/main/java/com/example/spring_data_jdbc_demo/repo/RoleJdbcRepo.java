package com.example.spring_data_jdbc_demo.repo;

import com.example.spring_data_jdbc_demo.domain.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoleJdbcRepo extends PagingAndSortingRepository<Role, Long> {
}
