package com.example.spring_data_jdbc_demo.repo;

import com.example.spring_data_jdbc_demo.domain.Users;
import com.example.spring_data_jdbc_demo.response.UserDetailResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface userJdbcRepo extends PagingAndSortingRepository<Users, Long> {

    Users findByIdAndUsername(Long id, String username);

    List<Users> findByIdIn(List<Long> ids);

    Page<UserDetailResponse> findByIdIn(List<Long> ids, Pageable pageable);

    @Query("select * from users u where u.username = :name")
    Users findByName(@Param("name") String name);
}
