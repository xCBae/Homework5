package Foods;

import java.util.ArrayList;

public class Pizza implements FoodItem {

    private String itemName;
    private ArrayList<String> itemToppings;
    private Double itemPrice;

    public Pizza(Double price) {
        this.itemName = "Pizza";
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