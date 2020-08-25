import java.util.ArrayList;
import java.util.List;

public class Price {
    public List<CollectedDrink> price = new ArrayList<>();
    private static int fullPrice;

    public Price(){
        price = CollectedDrink.collectedDrinks;
        priceSummer();
    }

    private void priceSummer(){
        for (CollectedDrink drink : price){
            fullPrice = fullPrice + drink.summCost;
        }
    }

    @Override
    public String toString() {
        return "Price{" +
                "price=" + price + "\n" +
                "Сумма заказа :" + fullPrice +
                '}';
    }
}
