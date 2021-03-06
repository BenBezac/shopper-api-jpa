package com.benbezac.shopperapijpa.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Getter // Lombok: adds getters
@Setter // Lombok: adds  setters
public class ShopperElement {
    public ShopperElement() {
    }

    public ShopperElement(String name, boolean checked) {
        this.name = name;
        this.checked = checked;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    private boolean checked;

    @ManyToOne
    @JoinColumn
    @JsonBackReference
    private ShopperList shopperList;

//    @ManyToOne
//    @JoinColumn
//    private ShopperElementCategory shopperElementCategory;
}
