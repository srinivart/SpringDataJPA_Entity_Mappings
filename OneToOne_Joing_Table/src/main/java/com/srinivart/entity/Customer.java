package com.srinivart.entity;

import javax.persistence.*;

@Entity
@Table
public class Customer {

    @Id
    @GeneratedValue
    private int id;
    private String name;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name="customer_item",
    joinColumns = { @JoinColumn(name = "customer_id") },
    inverseJoinColumns = { @JoinColumn(name = "item_id")})
    private Item item;



    public Customer(String name) {
        this.name = name;
    }


    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
