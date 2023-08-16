package com.jpa.trainings.oneToManyBiModel;

import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cart")
@NoArgsConstructor
@ToString
public class Cart {

    @Id
    @GeneratedValue
    private Long id;

    private String cartName;

    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Item> items = new ArrayList<>();


    public Cart(String cartName) {
        this.cartName = cartName;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
