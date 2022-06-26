package com.hatice.mimoza.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class ProductComment {
    @Id
    //@Query(value = "SELECT comment FROM ProductComment Where comment.productId=deger")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long Id;
    @Column(length=500)
    private String comment;

    private String datecomment;
    private long productId;
    private long userId;
    private String getproductcomment(long deger){

       // Collection<User> findAllActiveUsers();
        return null;
    }
}
