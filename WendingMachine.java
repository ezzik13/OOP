package Seminar1;

import java.util.ArrayList;

public class WendingMachine<T extends Product> {
    private String name = "default";
    protected ArrayList<T> productList;


    public WendingMachine(String firstMachine) {
        this.name = firstMachine;
        this.productList = new ArrayList<T>();
    }



    public void addProduct (T product){
        productList.add(product);
    }
    public T returnProduct(String name){
        for (T el: productList) {
            if(el.getName().equals(name)) return el;
        }
        return null;
    }
    public void printProducts(){
        for (T el: this.productList) {
            System.out.println(el);
        }
    }



    public ArrayList<T> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<T> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "WendingMachine{" +
                "name='" + name + '\'' +
                ", productList=" + productList +
                '}';
    }
}
