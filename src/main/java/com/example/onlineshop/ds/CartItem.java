package com.example.onlineshop.ds;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class CartItem {

    private Cart cart;
    private Item item;
    private int quantity;

    private CartItem(){}

    CartItem(Item item){
        this.item = item;
        this.quantity = 1;
    }
}
