public class OutOfOrderState implements VendingMachineState {
    
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Machine out of order. Please try again later.");
    }
    
    @Override
    public void insertCoin(VendingMachine machine, double amount) {
        System.out.println("Machine out of order. Please try again later.");
    }
    
    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Machine out of order. Please try again later.");
    }
    
    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is already out of order.");
    }
}