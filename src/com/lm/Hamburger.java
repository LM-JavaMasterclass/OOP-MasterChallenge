package com.lm;

public class Hamburger {
    private String orderName;
    private Bread bread;
    private Patty patty;
    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;
    private int numberAdditions;
    private double basePrice;
    private double additionPrice;
    private double currentPrice;

    public Hamburger(String orderName, Bread bread, Patty patty, double basePrice, double additionPrice) {
        this.orderName = orderName;
        this.bread = bread;
        this.patty = patty;
        this.addition1 = null;
        this.addition2 = null;
        this.addition3 = null;
        this.addition4 = null;
        this.numberAdditions = 0;
        this.basePrice = basePrice;
        this.additionPrice = additionPrice;
        this.currentPrice = basePrice;
    }

    public String getOrderName() {
        return orderName;
    }

    public Bread getBread() {
        return bread;
    }

    public Patty getPatty() {
        return patty;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getAdditionPrice() {
        return additionPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public int getNumberAdditions() {
        return numberAdditions;
    }


    public void addAddition(String addition) {

        if (numberAdditions < 4) {
            if (this.addition1 == null) {
                addition1 = addition;
            } else {
                if (this.addition2 == null) {
                    addition2 = addition;
                } else {
                    if (this.addition3 == null) {
                        addition3 = addition;
                    } else {
                        addition4 = addition;
                    }
                }
            }
            System.out.println("Added to " + this.orderName + ": " + addition);

            numberAdditions++;
        } else {
            System.out.println("You cannot include more than 4 additions. " + addition + " not added.");
        }
    }

    public void removeAddition(int additionNumber) {
        int i = additionNumber;
        switch (i) {
            case 1:
                System.out.println("Removed Addition 1: " + addition1);
                addition1 = null;
                numberAdditions--;
                break;
            case 2:
                System.out.println("Removed Addition 2: " + addition2);
                addition2 = null;
                numberAdditions--;
                break;
            case 3:
                System.out.println("Removed Addition 3: " + addition3);
                addition3 = null;
                numberAdditions--;
                break;
            case 4:
                System.out.println("Removed Addition 4: " + addition4);
                addition4 = null;
                numberAdditions--;
                break;
            default:
                System.out.println("Invalid number of addition to remove. No changes were made.");
                break;
        }
    }

    public double currentPrice() {
        return this.currentPrice = this.basePrice + numberAdditions * this.additionPrice;
    }

    public void currentOrder() {
        System.out.println(orderName + ": Base Price: $" + basePrice + "\n Bread: " + bread.getRollType() +
                "\n Patty: " + patty.pattyType());
        if (this.addition1 != null) {
            System.out.println("\n Addition 1 ($" + additionPrice + "): " + addition1);
        }
        if (this.addition2 != null) {
            System.out.println("\n Addition 2 ($" + additionPrice + "): " + addition2);
        }
        if (this.addition3 != null) {
            System.out.println("\n Addition 3 ($" + additionPrice + "): " + addition3);
        }
        if (this.addition4 != null) {
            System.out.println("\n Addition 4 ($" + additionPrice + "): " + addition4);
        }
        System.out.println("\nCurrent price is: $" + currentPrice());
    }


}
