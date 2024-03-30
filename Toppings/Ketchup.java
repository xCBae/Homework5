package Toppings;

import Foods.FoodItem;
import java.util.ArrayList;

public class Ketchup implements FoodItem {
    private FoodItem itemName;
    private double itemPrice;

    public Ketchup(FoodItem food, Double price) {
        this.itemPrice = price;
        this.itemName = food;
        this.itemName.getToppings().add("Ketchup");
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
