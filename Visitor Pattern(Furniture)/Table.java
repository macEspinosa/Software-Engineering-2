public class Table implements Furniture {
    private String model;
    private double length;
    private double width;
    private double height;
    private String material;
    
    public Table(String model, double length, double width, double height, String material) {
        this.model = model;
        this.length = length;
        this.width = width;
        this.height = height;
        this.material = material;
    }
    
    @Override
    public double accept(ShippingVisitor visitor) {
        return visitor.visitTable(this);
    }
    
    @Override
    public String getDescription() {
        return "Table [Model: " + model + ", Dimensions: " + length + "x" + width + "x" + height + 
               "cm, Material: " + material + "]";
    }
    
    // Getters
    public double getVolume() { return length * width * height / 1000; } // Convert to liters
    public String getMaterial() { return material; }
}