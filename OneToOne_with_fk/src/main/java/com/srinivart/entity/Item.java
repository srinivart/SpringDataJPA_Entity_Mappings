package com.srinivart.entity;

import javax.persistence.*;

@Entity
@Table
public class Item {
    @Id
    @GeneratedValue
    private int id;
    private String name;


    @OneToOne(cascade = CascadeType.ALL, mappedBy = "item")
    private Customer customer;



    public Item(String name) {
        this.name = name;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
