public class IdleState implements VendingMachineState {
    
    @Override
    public void selectItem(VendingMachine machine) {
        if (machine.getInventory() > 0) {
            System.out.println("Item selected. Please insert coins.");
            machine.setState(new ItemSelectedState());
        } else {
            System.out.println("Sorry, item out of stock.");
        }
    }
    
    @Override
    public void insertCoin(VendingMachine machine, double amount) {
        System.out.println("Please select an item first.");
    }
    
    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Please select an item and insert coins first.");
    }
    
    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}