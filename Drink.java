package Seminar1;

public class Drink extends Product{
    protected int volume;
    public Drink(String name, int volume, int price) {

        super(name, price);
        this.volume=volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getVolume(){
        return this.volume;
    }
    public void consume(){
        System.out.println("Напиток выпит");
    }
    public String toString(){
        return name + ", " + volume + ": " + price;
    }
}
