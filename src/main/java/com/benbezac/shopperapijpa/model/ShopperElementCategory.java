package com.benbezac.shopperapijpa.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
@Getter // Lombok: adds getters
@Setter // Lombok: adds  setters
public class ShopperElementCategory {
    public ShopperElementCategory() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String description;

//    @OneToMany(mappedBy = "shopperElementCategory", cascade = CascadeType.ALL)
//    private Set<ShopperElement> shopperElements;
//
//    public ShopperElementCategory(String name, String description, ShopperElement... shopperElements) {
//        this.name = name;
//        this.description = description;
//        this.shopperElements = Stream.of(shopperElements).collect(Collectors.toSet());
//
//    }
}
