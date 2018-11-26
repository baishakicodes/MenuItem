package com.company;

public class Sandwich implements MenuItem {
    private String name;
    private double price;
    public Sandwich(String name, int price){
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
