// ItemSelectedState.java
public class ItemSelectedState implements VendingMachineState {
    
    @Override
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Item already selected. Please insert coins or dispense");
    }
    
    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        vendingMachine.addBalance(amount);
        System.out.println("Inserted $" + amount + ". Current balance: $" + vendingMachine.getBalance());
        
        // Check if enough money inserted
        if (vendingMachine.getBalance() >= vendingMachine.getItemPrice()) {
            System.out.println("Sufficient funds. You can now dispense the item");
        }
    }
    
    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        if (vendingMachine.getBalance() >= vendingMachine.getItemPrice()) {
            vendingMachine.dispenseItem();
            vendingMachine.setState(new DispensingState());
            
            // Simulate dispensing process and transition to idle
            System.out.println("Dispensing item...");
            vendingMachine.completeDispensing();
        } else {
            int remaining = vendingMachine.getItemPrice() - vendingMachine.getBalance();
            System.out.println("Insufficient funds. Need $" + remaining + " more");
        }
    }
    
    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Vending machine is now out of order");
        vendingMachine.setState(new OutOfOrderState());
    }
}