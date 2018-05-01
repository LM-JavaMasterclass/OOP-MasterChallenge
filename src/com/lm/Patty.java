package com.lm;

public class Patty {
    private boolean isVeggie;

    public Patty(boolean isVeggie) {
        this.isVeggie = isVeggie;
    }

    public String pattyType() {
        if (isVeggie) {
            return "Veggie";
        } else {
            return "Meat";
        }
    }
}
