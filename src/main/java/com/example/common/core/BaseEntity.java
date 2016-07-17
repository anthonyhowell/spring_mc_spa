package com.example.common.core;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue
    private Long id;


    public Long getId() {
        return id;
    }

}
