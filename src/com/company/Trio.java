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
    public double getPrice(){
        if(sandwich.getPrice()>salad.getPrice()&& sandwich.getPrice()>drink.getPrice()){
            if(salad.getPrice()>drink.getPrice()){
                return sandwich.getPrice()+salad.getPrice();
            }
            else{
                return sandwich.getPrice()+drink.getPrice();
            }
        }
        if(salad.getPrice()>drink.getPrice()){
            return salad.getPrice()+drink.getPrice();
        }
        return salad.getPrice()+drink.getPrice();
    }
}
