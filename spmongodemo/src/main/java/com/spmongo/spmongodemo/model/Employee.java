package com.spmongo.spmongodemo.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.tomcat.jni.Address;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
public class Employee {

    @Id
    private Integer id;
    private String name;
    private String city;
    private List<String> emails;

    private List<Address> addressList;
}
