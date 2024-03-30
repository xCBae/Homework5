package Toppings;

import Foods.FoodItem;
import java.util.ArrayList;

public class Pepperoni implements FoodItem {
    private FoodItem itemName;
    private double itemPrice;

    public Pepperoni(FoodItem food, Double price) {
        this.itemPrice = price;
        this.itemName = food;
        this.itemName.getToppings().add("Pepperoni");
    }

    @Override
    public Double getPrice() {
        return this.itemPrice + this.itemName.getPrice();
    }

    @Override
    public String getName() {
        return this.itemName.getName();
    }

    @Override
    public ArrayList<String> getToppings() {
        return this.itemName.getToppings();
    }
}