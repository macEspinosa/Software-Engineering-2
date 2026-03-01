public class WasteContainer {
    private String type;
    private double capacity;
    private double currentFillLevel;
    
    public WasteContainer(String type, double capacity) {
        this.type = type;
        this.capacity = capacity;
        this.currentFillLevel = 0;
    }
    
    public boolean isFull() {
        return currentFillLevel >= capacity;
    }
    
    public String getType() {
        return type;
    }
    
    public double getCapacity() {
        return capacity;
    }
    
    public double getCurrentFillLevel() {
        return currentFillLevel;
    }
    
    public void fill(double amount) {
        if (currentFillLevel + amount <= capacity) {
            currentFillLevel += amount;
        } else {
            currentFillLevel = capacity;
        }
    }
    
    @Override
    public String toString() {
        return String.format("WasteContainer{type='%s', capacity=%.1f, currentFillLevel=%.1f, isFull=%s}", 
                            type, capacity, currentFillLevel, isFull());
    }
}