package Toppings;

import Foods.FoodItem;
import java.util.ArrayList;

public class Onion implements FoodItem {
    private FoodItem itemName;
    private double itemPrice;

    public Onion(FoodItem food, Double price) {
        this.itemPrice = price;
        this.itemName = food;
        this.itemName.getToppings().add("Onions");
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

	public FoodItem removeTopping() {
		// TODO Auto-generated method stub
		return null;
	}
}
