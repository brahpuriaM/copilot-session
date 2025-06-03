//Dynamic Discounting for Walmart’s Holiday Sales
// Scenario: Walmart wants to implement a dynamic discounting system for their holiday sales.
// The system should calculate discounts based on the product category and the original price.
public class DiscountCalculator {

    public static double calculateDiscount(String category, double originalPrice) {
        double discountRate;

        switch (category.toLowerCase()) {
            case "electronics":
                discountRate = 0.20; // 20% discount for electronics
                break;
            case "furniture":
                discountRate = 0.15; // 15% discount for furniture
                break;
            case "clothing":
                discountRate = 0.10; // 10% discount for clothing
                break;
            default:
                discountRate = 0.05; // Default discount rate
        }

        return originalPrice * discountRate;
    }

    public static void main(String[] args) {
        String category = "electronics";
        double originalPrice = 500.00;
        double discount = calculateDiscount(category, originalPrice);
        System.out.println("Discount for " + category + ": $" + discount);
    }
}