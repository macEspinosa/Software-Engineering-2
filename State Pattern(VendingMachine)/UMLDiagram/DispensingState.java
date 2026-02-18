public class DispensingState implements VendingMachineState {
    
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Please wait, dispensing in progress...");
    }
    
    @Override
    public void insertCoin(VendingMachine machine, double amount) {
        System.out.println("Please wait, dispensing in progress...");
    }
    
    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Dispensing complete. Returning to idle state.");
        // Auto-transition to Idle state after dispensing
        machine.setState(new IdleState());
    }
    
    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}