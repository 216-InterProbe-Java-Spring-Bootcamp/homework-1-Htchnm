package com.hatice.mimoza.entity;
import javax.persistence.*;

@Entity
public class Product {
    private long Id;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private String name;
    private int price;
    @Column(nullable=true)
    private String expiredate;
}
