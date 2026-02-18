// IdleState.java
public class IdleState implements VendingMachineState {
    
    @Override
    public void selectItem(VendingMachine vendingMachine) {
        if (vendingMachine.hasInventory()) {
            System.out.println("Item selected successfully");
            vendingMachine.setState(new ItemSelectedState());
        } else {
            System.out.println("Sorry, item is out of stock");
            vendingMachine.setState(new OutOfOrderState());
        }
    }
    
    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Please select an item first");
    }
    
    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Please select an item first");
    }
    
    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Vending machine is now out of order");
        vendingMachine.setState(new OutOfOrderState());
    }
}