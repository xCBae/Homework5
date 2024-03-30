package Test;

import Foods.FoodItem;
import Foods.Burger;
import Foods.ChickenTender;
import Foods.Fries;
import Foods.Hotdog;
import Foods.Pizza;
import LoyaltyStatus.LoyaltyStatus;
import Toppings.Cheese;
import Toppings.Ketchup;
import Toppings.Onion;
import Toppings.Pepperoni;
import Toppings.Tomato;
import Order.CustomerOrder;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProgramTest {

    @Test
    public void testCustomerOrder() {
        // Create some food items
        FoodItem tastyBurger = new Burger(6.00);
        FoodItem juicyHotdog = new Hotdog(5.50);

        // Add some toppings
        tastyBurger = new Cheese(tastyBurger, 1.50);
        tastyBurger = new Ketchup(tastyBurger, 0.25);
        juicyHotdog = new Onion(juicyHotdog, 0.50);

        // Create a customer's order
        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.addToOrder(juicyHotdog);
        customerOrder.addToOrder(tastyBurger);

        // Test if items are added to the order correctly
        assertEquals(2, customerOrder.getFoodItems().size());
    }

    @Test
    public void testTotalCostCalculation() {
        // Create some food items
        FoodItem tastyBurger = new Burger(6.00);
        FoodItem juicyHotdog = new Hotdog(5.50);

        // Add some toppings
        tastyBurger = new Cheese(tastyBurger, 1.50);
        tastyBurger = new Ketchup(tastyBurger, 0.25);
        juicyHotdog = new Onion(juicyHotdog, 0.50);

        // Create a customer's order
        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.addToOrder(juicyHotdog);
        customerOrder.addToOrder(tastyBurger);

        // Calculate the total price
        double totalPrice = customerOrder.getTotalPrice();

        // Test if total price is calculated correctly
        assertEquals(13.75, totalPrice, 0.01);
    }

    @Test
    public void testAddTopping() {
        // Create a burger
        FoodItem burger = new Burger(6.00);

        // Add cheese topping
        burger = new Cheese(burger, 1.50);

        // Test if topping is added correctly
        assertEquals(1, burger.getToppings().size());
        assertTrue(burger.getToppings().contains("Cheese"));
    }

    @Test
    public void testFoodItem() {
        // Create a chicken tender
        FoodItem chickenTender = new ChickenTender(7.50);

        // Test if food item name is correct
        assertEquals("Chicken Tenders", chickenTender.getName());
    }

    @Test
    public void testAddMultipleToppings() {
        // Create a pizza
        FoodItem pizza = new Pizza(10.00);

        // Add multiple toppings
        pizza = new Tomato(pizza, 0.75);
        pizza = new Pepperoni(pizza, 1.25);

        // Test if toppings are added correctly
        assertEquals(2, pizza.getToppings().size());
        assertTrue(pizza.getToppings().contains("Tomato"));
        assertTrue(pizza.getToppings().contains("Pepperoni"));
    }

    @Test
    public void testDiscountLoyaltyStatus() {
        // Create a customer's order
        CustomerOrder customerOrder = new CustomerOrder();

        // Create a loyalty program for the customer
        LoyaltyStatus customerLoyalty = new LoyaltyStatus(0.9, 0.20);

        // Set loyalty status for the customer
        customerOrder.setLoyaltyStatus(customerLoyalty);

        // Add some food items to the order
        customerOrder.addToOrder(new Burger(6.00));
        customerOrder.addToOrder(new Hotdog(5.50));

        // Calculate the discounted price after loyalty discount
        double discountedPrice = customerLoyalty.calculateDiscountedPrice(customerOrder.getTotalPrice());

        // Test if loyalty discount is applied correctly
        assertEquals(9.43, discountedPrice, 0.01);
    }
}
