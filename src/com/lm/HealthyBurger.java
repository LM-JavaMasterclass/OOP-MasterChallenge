package com.lm;

public class HealthyBurger extends Hamburger {


    public HealthyBurger(String orderName, Patty patty, double basePrice, double additionPrice) {
        super(orderName, new BrownRye(), patty, basePrice, additionPrice);
    }


    @Override
    public void addAddition(String addition) {
        if (super.getNumberAdditions() < 2) {
            super.addAddition(addition);
        } else {
            System.out.println("You cannot include more than 2 additions with the Health Burger. " + addition + " not added.");
        }
    }


}

