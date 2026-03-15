import java.util.ArrayList;
import java.util.List;

public class ECommercePlatform {
    public static void main(String[] args) {
        System.out.println("=== E-Commerce Furniture Shipping Calculator ===\n");
        
        // Create a list of furniture items
        List<Furniture> orderItems = new ArrayList<>();
        
        // Add various furniture items
        orderItems.add(new Chair("Ergonomic Pro", 5.5, true));
        orderItems.add(new Chair("Dining Classic", 4.2, false));
        orderItems.add(new Table("Dining Table", 150, 90, 75, "Wood"));
        orderItems.add(new Table("Glass Coffee Table", 120, 60, 45, "Glass"));
        orderItems.add(new Sofa("Comfort Supreme", 200, 90, 85, 3, false));
        orderItems.add(new Sofa("L-Shape Deluxe", 250, 150, 85, 4, true));
        
        // Create visitors
        ShippingCostCalculator costCalculator = new ShippingCostCalculator();
        ShippingLabelGenerator labelGenerator = new ShippingLabelGenerator();
        
        // Calculate shipping costs for all items
        System.out.println("--- Calculating Shipping Costs ---");
        double totalShippingCost = 0;
        for (Furniture item : orderItems) {
            totalShippingCost += item.accept(costCalculator);
        }
        System.out.println("\nTotal Shipping Cost for Order: $" + String.format("%.2f", totalShippingCost));
        
        // Generate shipping labels
        System.out.println("\n--- Generating Shipping Labels ---");
        for (Furniture item : orderItems) {
            item.accept(labelGenerator);
            System.out.println();
        }
        
        // Demonstrate adding a new furniture type without modifying existing code
        System.out.println("=== Extending with New Furniture Type ===");
        // In a real scenario, we would add a new class Bed.java that implements Furniture
        // and update the visitor interfaces, but this demonstrates the pattern's extensibility
    }
}