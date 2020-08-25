public class Main {
    public static void main(String[] args) {

        // создаем блюда, которые сможет выбрать желающий
        Dish greеn_tee = new Dish("Чай зеленый", 190);
        Dish black_tee = new Dish("Чай черный", 170);
        Dish latte = new Dish("Кофе Латте", 200);
        Dish americano = new Dish("Американо", 210);

        // создаем добавки, которые можно будет запихнуть в напитки
        Addition sugar = new Addition("Сахар", 10);
        Addition chocolate = new Addition("Шоколад", 30);
        Addition vanilla = new Addition("Ваниль", 20);

        // добавляем напитки в хэшмапу для дальнейшего использования
        DishRepository.hashmap_put(greеn_tee);
        DishRepository.hashmap_put(black_tee);
        DishRepository.hashmap_put(latte);
        DishRepository.hashmap_put(americano);

        // добавляем добавки в хэшмапу
        AdditonRepository.additionMapPut(sugar);
        AdditonRepository.additionMapPut(chocolate);
        AdditonRepository.additionMapPut(vanilla);

        // Вывод хэшей
        DishRepository.printValues(DishRepository.hashmap);
        AdditonRepository.printAdditionMap(AdditonRepository.additionMap);

        // комбинирование напитка
        CollectedDrink chai = new CollectedDrink
                .CollectionDrinkBuilder()
                .drinkName("Чай зеленый")
                .additionName("Сахар")
                .build();

        CollectedDrink kofe = new CollectedDrink
                .CollectionDrinkBuilder()
                .drinkName("Кофе Латте")
                .additionName("Сахар")
                .additionName("Шоколад")
                .build();

        // вывод собранных напитков с добавками и стоимостью
        System.out.println(chai);
        System.out.println(kofe);

        Price price = new Price();
        System.out.println(price);
    }
}
