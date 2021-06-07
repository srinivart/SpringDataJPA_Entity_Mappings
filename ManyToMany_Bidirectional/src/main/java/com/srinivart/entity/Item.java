package com.srinivart.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Item {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    //private Set<Item> items= new HashSet<>();  --> we defined this at customer side as "items"
    // so here this side use as , mappedBy = "items"

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "items")
    private Set<Customer> customters = new HashSet<>();






    public Set<Customer> getCustomters() {
        return customters;
    }

    public void setCustomters(Set<Customer> customters) {
        this.customters = customters;
    }

    public Item(String name) {
        this.name = name;
    }


}
