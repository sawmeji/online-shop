package com.example.onlineshop.ds;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dish {

    private String name;

    public static Dish deliver(Dish dish){
        return dish;
    }
}
