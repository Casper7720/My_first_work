import java.util.HashMap;

public class DishRepository {
    static java.util.Map<String,Dish> hashmap = new HashMap<>();

    public static void hashmap_put(Dish dish) {
        hashmap.put(dish.getName(), dish);
    }

    public static void printValues(java.util.Map<String, Dish> map)
    {
        for(java.util.Map.Entry<String, Dish> pair : map.entrySet())
        {
            Dish value = pair.getValue();
            System.out.println(value);
        }
    }
}
