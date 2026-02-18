// DispensingState.java
public class DispensingState implements VendingMachineState {
    
    @Override
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Cannot select item while dispensing");
    }
    
    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Cannot insert coins while dispensing");
    }
    
    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Already dispensing");
    }
    
    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Cannot set out of order while dispensing");
    }
}