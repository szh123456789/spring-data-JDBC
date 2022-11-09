package com.example.spring_data_jdbc_demo.domain;

import org.springframework.data.annotation.AccessType;

public class Person {
    private final Long id;
    private String firstname;
    private @AccessType(AccessType.Type.PROPERTY) String lastname;

    Person() {
        this.id = null;
    }

    Person(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    Person withId(Long id) {
        return new Person(id, this.firstname, this.lastname);
    }

    void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
