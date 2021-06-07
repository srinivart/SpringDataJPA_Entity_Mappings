package com.srinivart.entity;

import javax.persistence.*;

@Entity
@Table
public class Item {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
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
