public class VendingMachine {
    private int inventory;
    private double balance;
    private VendingMachineState currentState;
    
    public VendingMachine(int initialInventory) {
        this.inventory = initialInventory;
        this.balance = 0.0;
        this.currentState = new IdleState(); // Start in Idle state
    }
    
    // State getter and setter
    public void setState(VendingMachineState state) {
        this.currentState = state;
    }
    
    public VendingMachineState getState() {
        return currentState;
    }
    
    // Inventory methods
    public int getInventory() {
        return inventory;
    }
    
    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
    
    // Balance methods
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    // Delegate methods to current state
    public void selectItem() {
        currentState.selectItem(this);
    }
    
    public void insertCoin(double amount) {
        currentState.insertCoin(this, amount);
    }
    
    public void dispenseItem() {
        currentState.dispenseItem(this);
    }
    
    public void setOutOfOrder() {
        currentState.setOutOfOrder(this);
    }
}