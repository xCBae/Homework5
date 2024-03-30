package Foods;

import java.util.ArrayList;

public class Fries implements FoodItem {

    private String itemName;
    private ArrayList<String> itemToppings;
    private Double itemPrice;

    public Fries(Double price) {
        this.itemName = "Fries";
        this.itemPrice = price;
        this.itemToppings = new ArrayList<String>();
    }

    @Override
    public Double getPrice() {
        return this.itemPrice;
    }

    @Override
    public String getName() {
        StringBuilder foodName = new StringBuilder(this.itemName);

        if (!this.itemToppings.isEmpty()) {
            foodName.append(" with ");
        }
        for (int i = 0; i < this.itemToppings.size(); i++) {
            foodName.append(this.itemToppings.get(i));
            if (i != this.itemToppings.size() - 1) {
                foodName.append(", ");
            }
        }

        return foodName.toString();
    }

    @Override
    public ArrayList<String> getToppings() {
        return this.itemToppings;
    }
}