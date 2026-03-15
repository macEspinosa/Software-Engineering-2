public class ShippingCostCalculator implements ShippingVisitor {
    private static final double BASE_RATE_PER_KG = 2.5;
    private static final double BULKY_ITEM_SURCHARGE = 50.0;
    private static final double VOLUME_RATE_PER_LITER = 0.3;
    private static final double FRAGILE_SURCHARGE = 25.0;
    
    @Override
    public double visitChair(Chair chair) {
        double cost = chair.getWeight() * BASE_RATE_PER_KG;
        
        // Chairs are lightweight, have flat rate for stackable chairs
        if (chair.isStackable()) {
            cost *= 0.8; // 20% discount for stackable chairs
        }
        
        System.out.println("Shipping cost for " + chair.getDescription() + ": $" + String.format("%.2f", cost));
        return cost;
    }
    
    @Override
    public double visitTable(Table table) {
        double cost = table.getVolume() * VOLUME_RATE_PER_LITER;
        
        // Tables are bulky, add surcharge for glass tables (fragile)
        if (table.getMaterial().toLowerCase().contains("glass")) {
            cost += FRAGILE_SURCHARGE;
        }
        
        // Add bulky item surcharge if volume exceeds threshold
        if (table.getVolume() > 100) {
            cost += BULKY_ITEM_SURCHARGE;
        }
        
        System.out.println("Shipping cost for " + table.getDescription() + ": $" + String.format("%.2f", cost));
        return cost;
    }
    
    @Override
    public double visitSofa(Sofa sofa) {
        double cost = sofa.getVolume() * VOLUME_RATE_PER_LITER * 1.5; // Sofas are 50% more expensive to ship
        
        // Sectional sofas cost more due to complexity
        if (sofa.isSectional()) {
            cost *= 1.3;
        }
        
        // Add cost per seat
        cost += sofa.getSeats() * 10.0;
        
        System.out.println("Shipping cost for " + sofa.getDescription() + ": $" + String.format("%.2f", cost));
        return cost;
    }
}