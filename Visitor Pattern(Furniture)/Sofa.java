public class Sofa implements Furniture {
    private String model;
    private double length;
    private double depth;
    private double height;
    private int seats;
    private boolean isSectional;
    
    public Sofa(String model, double length, double depth, double height, int seats, boolean isSectional) {
        this.model = model;
        this.length = length;
        this.depth = depth;
        this.height = height;
        this.seats = seats;
        this.isSectional = isSectional;
    }
    
    @Override
    public double accept(ShippingVisitor visitor) {
        return visitor.visitSofa(this);
    }
    
    @Override
    public String getDescription() {
        return "Sofa [Model: " + model + ", Dimensions: " + length + "x" + depth + "x" + height + 
               "cm, Seats: " + seats + ", " + (isSectional ? "Sectional" : "Standard") + "]";
    }
    
    // Getters
    public double getVolume() { return length * depth * height / 1000; }
    public int getSeats() { return seats; }
    public boolean isSectional() { return isSectional; }
}