package com.example.spring_data_jdbc_demo.config;

import com.example.spring_data_jdbc_demo.convert.UserTypeReadConvert;
import com.example.spring_data_jdbc_demo.convert.UserTypeWriterConvert;
import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.jdbc.core.convert.JdbcCustomConversions;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;

import javax.sql.DataSource;
import java.util.List;

@Configuration
@EnableJdbcRepositories(basePackages = "com.example.spring_data_jdbc_demo.**.repo")
@EnableJdbcAuditing
public class JDBCConfig extends AbstractJdbcConfiguration {

    @Bean
    NamedParameterJdbcOperations namedParameterJdbcOperations(DataSource dataSource) {
        return new NamedParameterJdbcTemplate(dataSource);
    }

    @Bean
    TransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Override
    public JdbcCustomConversions jdbcCustomConversions() {

        List<Converter> convert = Lists.newArrayList(
                new UserTypeReadConvert(),
                new UserTypeWriterConvert()
        );

        return new JdbcCustomConversions(convert);
    }
}
