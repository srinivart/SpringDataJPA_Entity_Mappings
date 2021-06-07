package com.srinivart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Item {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    public Item(String name) {
        this.name = name;
    }



}
