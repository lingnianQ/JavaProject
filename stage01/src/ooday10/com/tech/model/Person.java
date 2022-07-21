package ooday10.com.tech.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ooday10.com.tech.service.Role;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor

public abstract class Person implements Role {
    private String name;
    private int age;


}
