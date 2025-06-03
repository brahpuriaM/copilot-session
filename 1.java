//Example 1 (Java) – Auto-Generating a Sales Tax Function
//Scenario: Walmart needs a function to calculate sales tax dynamically for different product categories.


// This function will be used in their inventory management system to ensure accurate tax calculations based on product type.
// The function will take the product category and price as inputs and return the calculated sales tax.
public class SalesTaxCalculator {

    public static double calculateSalesTax(String category, double price) {
        double taxRate;

        switch (category.toLowerCase()) {
            case "electronics":
                taxRate = 0.15; // 15% tax for electronics
                break;
            case "furniture":
                taxRate = 0.10; // 10% tax for furniture
                break;
            case "clothing":
                taxRate = 0.05; // 5% tax for clothing
                break;
            default:
                taxRate = 0.08; // Default tax rate
        }

        return price * taxRate;
    }

    public static void main(String[] args) {
        String category = "electronics";
        double price = 1000.00;
        double salesTax = calculateSalesTax(category, price);
        System.out.println("Sales Tax for " + category + ": $" + salesTax);
    }
}

