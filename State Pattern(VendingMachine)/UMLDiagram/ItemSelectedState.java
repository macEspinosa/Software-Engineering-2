public class ItemSelectedState implements VendingMachineState {
    
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected. Please insert coins or dispense.");
    }
    
    @Override
    public void insertCoin(VendingMachine machine, double amount) {
        machine.setBalance(machine.getBalance() + amount);
        System.out.println("Inserted: $" + amount + " | Total balance: $" + machine.getBalance());
        
        // Assuming item price is $1.00 for this example
        if (machine.getBalance() >= 1.0) {
            System.out.println("Sufficient funds. Please dispense item.");
        }
    }
    
    @Override
    public void dispenseItem(VendingMachine machine) {
        if (machine.getBalance() >= 1.0) {
            System.out.println("Dispensing item...");
            machine.setInventory(machine.getInventory() - 1);
            machine.setBalance(machine.getBalance() - 1.0);
            
            System.out.println("Item dispensed. Remaining balance: $" + machine.getBalance());
            System.out.println("Remaining inventory: " + machine.getInventory());
            
            machine.setState(new DispensingState());
        } else {
            System.out.println("Insufficient funds. Please insert $" + (1.0 - machine.getBalance()) + " more.");
        }
    }
    
    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}