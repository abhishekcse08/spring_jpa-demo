package com.jpa.trainings.oneToManyBiModel;


import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "item")
@NoArgsConstructor
@ToString
public class Item {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String serialNo;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    public Item(String name, String serialNo, Cart cart) {
        this.name = name;
        this.serialNo = serialNo;
        this.cart = cart;
    }
}
