package Seminar1;
import java.util.ArrayList;
public class HotDrinkMachine<T extends  HotDrink> extends WendingMachine {
    private ArrayList<T> hotDrinkList;
    public HotDrinkMachine(String secondMachine) {
        super(secondMachine);
        hotDrinkList = new ArrayList<T>();;
    }
    public void addHotDrink(T hdr){

        productList.add(hdr);
    }

    public T returnProduct(String name, int volume, int temperature){
        for (T el: hotDrinkList){
            if(name.equals(el.getName()) && (volume==el.getVolume())){
                if(temperature==el.getTemperature()) return el;
            }
        }

        return null;
    }

    public ArrayList<T> getHotDrinkList() {
        return hotDrinkList;
    }

    @Override
    public String toString() {
        return "HotDrinkMachine{" +
                "hotDrinkList=" + hotDrinkList +
                '}';
    }
}