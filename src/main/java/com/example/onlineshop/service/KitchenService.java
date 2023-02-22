package com.example.onlineshop.service;

import com.example.onlineshop.ds.Dish;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class KitchenService {

    public Flux<Dish> getDishes(){
/*        return Flux.just(new Dish("Sesame Chicken"),
                new Dish("Lo Mein Noodles, plain"),
                new Dish("Sweet & Sour Beef"));*/
        return Flux.<Dish> generate(sink ->sink.next(randomDish()))
                .delayElements(Duration.ofMillis(250));
    }


    private Dish randomDish(){
        return menu.get(picker.nextInt(menu.size()));
    }

    private List<Dish> menu = Arrays.asList(
            new Dish("Sesame Chicken"),
            new Dish("Lo Mein Noodles, plain"),
            new Dish("Sweet & Sour Beef")
    );

    private Random picker = new Random();
}
