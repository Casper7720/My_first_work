package com.casper.lab1.repositories;

import com.casper.lab1.pojo.Dish;

import java.util.HashMap;
import java.util.Map;

public class DishRepository {
    public static Map<String, Dish> hashmap = new HashMap<>();

    public static void hashmap_put(Dish dish) {
        hashmap.put(dish.getName(), dish);
    }

    public static void printValues(Map<String, Dish> map) {
        for (Map.Entry<String, Dish> pair : map.entrySet()) {
            Dish value = pair.getValue();
            System.out.println(value);
        }
    }
}
