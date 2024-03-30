package Toppings;

import Foods.FoodItem;
import java.util.ArrayList;

public class Cheese implements FoodItem {
    private FoodItem itemName;
    private double itemPrice;

    public Cheese(FoodItem food, Double price) {
        this.itemPrice = price;
        this.itemName = food;
        this.itemName.getToppings().add("Cheese");
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
