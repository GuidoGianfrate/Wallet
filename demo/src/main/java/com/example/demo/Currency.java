package com.example.demo;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Currency {

    @Id
    @Column(unique = true)
    private String name;



}
