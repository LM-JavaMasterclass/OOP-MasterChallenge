package com.lm;

public class DeluxeBurger extends Hamburger {
    private String addition1 = "Chips";
    private String addition2 = "Drink";

    public DeluxeBurger(String orderName, Bread bread, Patty patty, double basePrice, double additionPrice) {
        super(orderName, bread, patty, basePrice, additionPrice);
    }

    @Override
    public void addAddition(String addition) {
        System.out.println("Deluxe burgers additions cannot be modified");
    }

    @Override
    public void removeAddition(int additionNumber) {
        System.out.println("Deluxe burgers additions cannot be modified");
    }
}
