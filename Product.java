package Seminar1;

public class Product<T extends Product> {
    protected String name;
    protected int price;
    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void consume(){
        System.out.println("Продукт " + name + " потреблен");
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}



