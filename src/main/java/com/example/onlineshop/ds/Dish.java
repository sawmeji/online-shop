package com.example.onlineshop.ds;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dish {

    private String description;
    private boolean delivered = false;
//    private String name;

    public Dish(String description){
        this.description = description;
    }

    public static Dish deliver(Dish dish){

        Dish deliveredDish = new Dish(dish.description);
        deliveredDish.delivered=true;
        return deliveredDish;
    }
}
