package com.example.spring_data_jdbc_demo.convert;

import com.example.spring_data_jdbc_demo.domain.UserType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;

@WritingConverter
public class UserTypeWriterConvert implements Converter<UserType, String> {

    @Override
    public String convert(UserType source) {
        return source.getCode().toString();
    }
}
