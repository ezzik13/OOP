package Seminar1;

public class HotDrink extends Drink{
    private int temperature;


    public HotDrink(String name,int volume, int temperature, int price) {
        super(name, volume, price);
        this.temperature=temperature;
    }

    public void setTemperature(int temperature) {

        this.temperature = temperature;
    }
    public int getTemperature(){

        return this.temperature;
    }
    public void consume(){
        System.out.println("Обжигающий напиток выпит");
    }
    public String toString(){
        return name + ", " + volume + "мл, " + temperature +" с: " + price;
    }


}
