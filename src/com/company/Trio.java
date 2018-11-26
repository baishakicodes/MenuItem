package com.company;

public class Trio implements MenuItem {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;
    public Trio(Sandwich sandwich, Salad salad, Drink drink){
        this.sandwich=sandwich;
        this.salad=salad;
        this.drink=drink;
    }
    public String getName(){
        return sandwich.getName()+"/"+salad.getName()+"/"+drink.getName();

    }
    public int getPrice(){
        return sandwich.getPrice()+salad.getPrice()+drink.getPrice();
    }
}
