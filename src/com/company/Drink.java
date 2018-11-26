package com.company;

public class Drink implements MenuItem {
    private String name;
    private int price;
    public Drink(String name, int price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
}
