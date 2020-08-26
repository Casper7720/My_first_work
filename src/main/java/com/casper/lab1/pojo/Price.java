package com.casper.lab1.pojo;

import java.util.ArrayList;
import java.util.List;

public class Price {
    public List<CollectedDrink> price;
    private static int fullPrice;

    public Price() {
        price = CollectedDrink.collectedDrinks;
        priceSummer();
    }

    private void priceSummer() {
        for (CollectedDrink drink : price) {
            fullPrice = fullPrice + drink.summCost;
        }
    }

    @Override
    public String toString() {
        return "com.casper.lab1.pojo.Price{" +
                "price=" + price + "\n" +
                "Сумма заказа :" + fullPrice +
                '}';
    }
}
