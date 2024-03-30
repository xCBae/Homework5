package Foods;

import java.util.ArrayList;

public interface FoodItem {
    Double getPrice();
    String getName();
    ArrayList<String> getToppings();
}