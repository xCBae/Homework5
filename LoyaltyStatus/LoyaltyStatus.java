package LoyaltyStatus;

public class LoyaltyStatus {
    private double loyaltyRate;
    private double maxDiscount;

    public LoyaltyStatus(double loyaltyRate, double maxDiscount) {
        setLoyaltyRate(loyaltyRate);
        setMaxDiscount(maxDiscount);
    }

    public double getLoyaltyRate() {
        return loyaltyRate;
    }

    public void setLoyaltyRate(double loyaltyRate) {
        if (loyaltyRate >= 0 && loyaltyRate <= 1) {
            this.loyaltyRate = loyaltyRate;
        } else {
            throw new IllegalArgumentException("Loyalty rate must be between 0 and 1");
        }
    }

    public double getMaxDiscount() {
        return maxDiscount;
    }

    public void setMaxDiscount(double maxDiscount) {
        if (maxDiscount >= 0) {
            this.maxDiscount = maxDiscount;
        } else {
            throw new IllegalArgumentException("Maximum discount must be non-negative");
        }
    }

    public double calculateDiscountedPrice(double totalPrice) {
        double discount = this.maxDiscount * this.loyaltyRate;
        double discountedPrice = totalPrice - (totalPrice * discount);
        return Math.floor(discountedPrice * 100) / 100; // Round to 2 decimal places
    }
}
