package com.srinivart.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Customer {

    @Id
    @GeneratedValue
    private int id;
    private String name;


    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Item> items= new HashSet<>();


    public Customer(String name) {
        this.name = name;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
