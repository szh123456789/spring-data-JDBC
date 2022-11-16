//package com.example.spring_data_jdbc_demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
//import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
//import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
//import org.springframework.transaction.TransactionManager;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableJdbcRepositories(basePackages = "com.example.spring_data_jdbc_demo.**.repo")
//public class ApplicationConfig extends AbstractJdbcConfiguration {
//
//    //数据源连接
////    @Bean
////    DataSource dataSource(){
////        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
////        return builder.setType(EmbeddedDatabaseType.HSQL).build();
////    }
//
//    //创建JDBC访问数据库的NamedParameterJdbcOperations
//    @Bean
//    NamedParameterJdbcOperations namedParameterJdbcOperations(DataSource dataSource){
//        return new NamedParameterJdbcTemplate(dataSource);
//    }
//
//    //JDBC事务管理
//    @Bean
//    TransactionManager transactionManager(DataSource dataSource){
//        return new DataSourceTransactionManager(dataSource);
//    }
//}
