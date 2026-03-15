public class Chair implements Furniture {
    private String model;
    private double weight;
    private boolean isStackable;
    
    public Chair(String model, double weight, boolean isStackable) {
        this.model = model;
        this.weight = weight;
        this.isStackable = isStackable;
    }
    
    @Override
    public double accept(ShippingVisitor visitor) {
        return visitor.visitChair(this);
    }
    
    @Override
    public String getDescription() {
        return "Chair [Model: " + model + ", Weight: " + weight + "kg, " + 
               (isStackable ? "Stackable" : "Non-stackable") + "]";
    }
    
    // Getters
    public double getWeight() { return weight; }
    public boolean isStackable() { return isStackable; }
}