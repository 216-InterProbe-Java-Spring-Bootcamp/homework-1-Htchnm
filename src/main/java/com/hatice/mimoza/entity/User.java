package com.hatice.mimoza.entity;

import javax.persistence.*;

@Entity
public class User {
    private long Id;
   @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(length=50, nullable=false, unique=false)
    private String name;
    @Column(length=50, nullable=false, unique=false)
    private String surname;
    @Column(length=50, nullable=false, unique=false)
    private String email;
    @Column(length=15, nullable=false, unique=false)
    private String phonenumber;
}
