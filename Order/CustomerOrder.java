package Order;

import Foods.FoodItem;
import LoyaltyStatus.LoyaltyStatus;

import java.util.ArrayList;
import java.util.List;

public class CustomerOrder {
    private List<FoodItem> foodItems;
    private LoyaltyStatus loyaltyStatus;

    public CustomerOrder() {
        this.foodItems = new ArrayList<>();
    }

    public void addToOrder(FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    public void removeFromOrder(FoodItem foodItem) {
        foodItems.remove(foodItem);
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (FoodItem foodItem : foodItems) {
            totalPrice += foodItem.getPrice();
        }
        return totalPrice;
    }

    public void printOrder() {
        for (FoodItem foodItem : foodItems) {
            System.out.println(foodItem.getName() + " - $" + foodItem.getPrice());
        }
    }

    public LoyaltyStatus getLoyaltyStatus() {
        return loyaltyStatus;
    }

    public void setLoyaltyStatus(LoyaltyStatus loyaltyStatus) {
        this.loyaltyStatus = loyaltyStatus;
    }

    public List<FoodItem> getFoodItems() {
        return this.foodItems;
    }
}
