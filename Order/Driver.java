package Order;

import Foods.*;
import Toppings.*;
import Order.*;
import LoyaltyStatus.*;

public class Driver {
    public static void main(String[] args) {
        // Create some food items
        FoodItem tastyBurger = new Burger(6.00);
        FoodItem tenderChicken = new ChickenTender(8.50);
        FoodItem crispyFries = new Fries(3.00);
        FoodItem juicyHotdog = new Hotdog(5.50);
        FoodItem cheesyPizza = new Pizza(12.00);

        // Add some toppings
        tastyBurger = new Cheese(tastyBurger, 1.50);
        tastyBurger = new Ketchup(tastyBurger, 0.25);
        tenderChicken = new Pepperoni(tenderChicken, 1.00);
        crispyFries = new Ketchup(crispyFries, 0.25);
        juicyHotdog = new Onion(juicyHotdog, 0.50);
        cheesyPizza = new Tomato(cheesyPizza, 0.75);

        // Display food items with toppings
        System.out.println("Food Items:");
        System.out.println("1. " + tastyBurger.getName() + " - Price: $" + tastyBurger.getPrice());
        System.out.println("2. " + tenderChicken.getName() + " - Price: $" + tenderChicken.getPrice());
        System.out.println("3. " + crispyFries.getName() + " - Price: $" + crispyFries.getPrice());
        System.out.println("4. " + juicyHotdog.getName() + " - Price: $" + juicyHotdog.getPrice());
        System.out.println("5. " + cheesyPizza.getName() + " - Price: $" + cheesyPizza.getPrice());

        // Create a customer's order
        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.addToOrder(juicyHotdog);
        customerOrder.addToOrder(tastyBurger);

        // Display the customer's order
        System.out.println("\nCustomer's Order:");
        customerOrder.printOrder();
        System.out.println("Total Price: $" + customerOrder.getTotalPrice());

        // Create a loyalty program for the customer
        LoyaltyStatus customerLoyalty = new LoyaltyStatus(1.0, 0.30);
        System.out.println("\nCustomer Loyalty Program:");
        System.out.println("Customer with 100% loyalty and a maximum discount of 30%");
        System.out.println("Discounted Price after Loyalty Discount: $" + customerLoyalty.calculateDiscountedPrice(customerOrder.getTotalPrice()));
    }
}
