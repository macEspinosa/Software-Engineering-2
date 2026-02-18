// OutOfOrderState.java
public class OutOfOrderState implements VendingMachineState {
    
    @Override
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Machine is out of order");
    }
    
    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Machine is out of order");
    }
    
    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Machine is out of order");
    }
    
    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Machine is already out of order");
    }
}