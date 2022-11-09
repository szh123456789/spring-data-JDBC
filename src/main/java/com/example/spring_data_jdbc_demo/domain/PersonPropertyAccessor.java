package com.example.spring_data_jdbc_demo.domain;

import com.example.spring_data_jdbc_demo.domain.Person;
import lombok.SneakyThrows;
import org.springframework.data.mapping.PersistentProperty;
import org.springframework.data.mapping.PersistentPropertyAccessor;

import java.lang.invoke.MethodHandle;

public class PersonPropertyAccessor  implements PersistentPropertyAccessor {

    private static final MethodHandle firstname = null;

    private Person person;

    @SneakyThrows
    @Override
    public void setProperty(PersistentProperty property, Object value) {
        String name = property.getName();

        if ("firstname".equals(name)) {
            firstname.invoke(person, (String) value);
        } else if ("id".equals(name)) {
            this.person = person.withId((Long) value);
        } else if ("lastname".equals(name)) {
            this.person.setLastname((String) value);
        }
    }

    @Override
    public Object getProperty(PersistentProperty property) {
        return null;
    }

    @Override
    public Object getBean() {
        return null;
    }
}
