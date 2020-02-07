package com.benbezac.shopperapijpa.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity // This tells Hibernate to make a table out of this class
@Getter // Lombok: adds getters
@Setter // Lombok: adds  setters
public class ShopperList {
    public ShopperList() {
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String name;
    private String description;

    @JsonManagedReference
    @OneToMany(mappedBy = "shopperList", cascade = CascadeType.ALL)
    private Set<ShopperElement> shopperElements;

    public ShopperList(String name, String description, ShopperElement... shopperElements) {
        this.name = name;
        this.description = description;
        this.shopperElements = Stream.of(shopperElements).collect(Collectors.toSet());
        this.shopperElements.forEach(x -> x.setShopperList(this));
    }

    @Override
    public String toString() {
        return "ShopperList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
            '}';
    }
}
