package com.example.spring_data_jdbc_demo.convert;

import com.example.spring_data_jdbc_demo.domain.UserType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

@ReadingConverter
public class UserTypeReadConvert implements Converter<Integer, UserType> {

    @Override
    public UserType convert(Integer source) {
        return UserType.of(source);
    }
}
