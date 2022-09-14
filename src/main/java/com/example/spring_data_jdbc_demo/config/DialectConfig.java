package com.example.spring_data_jdbc_demo.config;

import org.springframework.data.jdbc.repository.config.DialectResolver;
import org.springframework.data.relational.core.dialect.Dialect;
import org.springframework.jdbc.core.JdbcOperations;

import java.util.Optional;

//public class DialectConfig implements DialectResolver.JdbcDialectProvider {
//
//    @Override
//    public Optional<Dialect> getDialect(JdbcOperations operations) {
//        return Optional.empty();
//    }
//}
