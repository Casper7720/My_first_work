package com.casper.lab1.pojo;

import com.casper.lab1.repositories.AdditonRepository;
import com.casper.lab1.repositories.DishRepository;

import java.util.ArrayList;
import java.util.List;

public class CollectedDrink {

    public static List<CollectedDrink> collectedDrinks = new ArrayList<>();
    private final String drinkName;
    private List<String> additionName;
    public final int summCost;

    private CollectedDrink(final CollectionDrinkBuilder collectionDrinkBuilder) {

        drinkName = collectionDrinkBuilder.getDrinkName();
        additionName = collectionDrinkBuilder.getAdditionName();
        summCost = collectionDrinkBuilder.getSummCost();
        collectedDrinks.add(this);
    }

    public static class CollectionDrinkBuilder {

        private String drinkName;
        private List<String> additionName = new ArrayList<>();
        private int summCost;

        public CollectionDrinkBuilder drinkName(final String drinkName) {
            summCost = summCost + DishRepository.hashmap.get(drinkName).getCost();
            this.drinkName = drinkName;
            return this;
        }

        public CollectionDrinkBuilder additionName(final String additionName) {
            summCost = summCost + AdditonRepository.additionMap.get(additionName).getCost();
            System.out.println(additionName);
            this.additionName.add(additionName);
            return this;
        }


        public String getDrinkName() {
            return drinkName;
        }

        public List<String> getAdditionName() {
            return additionName;
        }

        public int getSummCost() {
            return summCost;
        }

        public CollectedDrink build() {
            return new CollectedDrink(this);
        }
    }

    @Override
    public String toString() {
        return "com.casper.lab1.pojo.CollectedDrink{" +
                "drinkName='" + drinkName + '\'' +
                ", additionName=" + additionName +
                ", summCost=" + summCost +
                '}';
    }
}
