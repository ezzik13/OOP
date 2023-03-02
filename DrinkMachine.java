package Seminar1;

import java.util.ArrayList;

public class DrinkMachine<T extends Drink> extends WendingMachine{
    private ArrayList<T> drinkList;
    public DrinkMachine(String firstMachine) {
        super(firstMachine);
        drinkList = new ArrayList<T>();
    }
    public void addDrink(T dr){

        productList.add(dr);
    }

}
