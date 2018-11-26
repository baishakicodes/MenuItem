package com.company;

public class Salad implements MenuItem{
    private String name;
    private int price;
    public Salad(String name, int price){
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
