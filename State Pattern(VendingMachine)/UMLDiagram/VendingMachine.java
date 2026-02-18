// VendingMachine.java
public class VendingMachine {
    private VendingMachineState currentState;
    private int itemInventory;
    private int balance;
    private final int ITEM_PRICE = 10; // Fixed price for simplicity
    
    public VendingMachine(int initialInventory) {
        this.itemInventory = initialInventory;
        this.balance = 0;
        this.currentState = new IdleState();
    }
    
    public void setState(VendingMachineState state) {
        this.currentState = state;
    }
    
    public void selectItem() {
        currentState.selectItem(this);
    }
    
    public void insertCoin(int amount) {
        currentState.insertCoin(this, amount);
    }
    
    public void dispenseItem() {
        currentState.dispenseItem(this);
    }
    
    public void setOutOfOrder() {
        currentState.setOutOfOrder(this);
    }
    
    // Helper methods
    public boolean hasInventory() {
        return itemInventory > 0;
    }
    
    public void dispenseItem() {
        if (itemInventory > 0 && balance >= ITEM_PRICE) {
            itemInventory--;
            balance -= ITEM_PRICE;
            System.out.println("Item dispensed. Remaining inventory: " + itemInventory);
        }
    }
    
    public void completeDispensing() {
        // Automatically transition back to Idle state
        setState(new IdleState());
        System.out.println("Transaction complete. Returning to idle state");
    }
    
    public void addBalance(int amount) {
        this.balance += amount;
    }
    
    // Getters
    public int getBalance() {
        return balance;
    }
    
    public int getItemPrice() {
        return ITEM_PRICE;
    }
    
    public VendingMachineState getCurrentState() {
        return currentState;
    }
}