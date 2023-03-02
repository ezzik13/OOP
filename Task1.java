package Seminar1;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        WendingMachine firstMachine = new WendingMachine("first_Machine");
        DrinkMachine drinkMachine = new DrinkMachine<>("drinkMachine");
        HotDrinkMachine secondMachine = new HotDrinkMachine("secondMachine");

        Product<Product> first = new Product<Product>("орешки", 100);
        Product<Product> second = new Product<Product>("чай", 150);
        Drink firstDrink = new Drink("sprite", 100, 70);
        Drink secondDrink = new Drink("cola", 150, 70);
        HotDrink firsHotDrink = new HotDrink("cocoa", 200, 96, 90);
        HotDrink secondHotDrink = new HotDrink("coffee", 150, 96, 100);
        firstMachine.addProduct(first);
        firstMachine.addProduct(second);
        drinkMachine.addDrink(firstDrink);
        drinkMachine.addDrink(secondDrink);
        secondMachine.addHotDrink(firsHotDrink);
        secondMachine.addHotDrink(secondHotDrink);

        System.out.println(firstMachine.returnProduct("орешки"));


        for (Object el : firstMachine.getProductList()) {
            if (el instanceof Product<?>) {
                Product product = (Product) el;
                product.consume();
            }
        }
        System.out.println(drinkMachine);

        System.out.println(secondMachine);


        System.out.println(secondMachine.returnProduct("cocoa", 200, 96));

        for (Object el : secondMachine.getHotDrinkList()) {
            if (el instanceof HotDrink) {
                HotDrink ht = (HotDrink) el;
                System.out.println(el);
                ht.consume();
            }
        }
    }
}