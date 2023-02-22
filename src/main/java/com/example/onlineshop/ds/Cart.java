package com.example.onlineshop.ds;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Cart {

    private @Id String id;

    private List<CartItem> cartItems;
}
