package com.driver;

public class Pizza {

    private int basePrice;
    private Boolean isVeg;
    private String bill;
    private int totalPrice;
    private int extraCheesePrice;
    private int extraToppingsPrice;
    private int paperBagPrice;
    private boolean isCheeseTaken;
    private boolean isToppingsTaken;
    private boolean isBagTaken;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            basePrice = 300;
            extraToppingsPrice = 70;
        }
        else
        {
            basePrice = 400;
            extraToppingsPrice = 120;
        }
        extraCheesePrice = 80;
        paperBagPrice = 20;
        bill = "";
        bill += "Base Price Of The Pizza: " + basePrice + "\n";
        totalPrice += basePrice;
    }

    public int getPrice(){
        return this.basePrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseTaken)
        {
            isCheeseTaken = true;
            totalPrice += extraCheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsTaken)
        {
            isToppingsTaken = true;
            totalPrice += extraToppingsPrice;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isBagTaken)
        {
            isBagTaken = true;
            totalPrice += paperBagPrice;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated)
        {
            if(isCheeseTaken)
            {
                bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
            }
            if(isToppingsTaken)
            {
                bill += "Extra Toppings Added: " + extraToppingsPrice + "\n";
            }
            if(isBagTaken)
            {
                bill += "Paperbag Added: " + paperBagPrice + "\n";
            }
            bill += "Total Price: " + totalPrice + "\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
