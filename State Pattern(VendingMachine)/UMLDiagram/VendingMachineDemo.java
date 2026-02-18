// VendingMachineDemo.java
public class VendingMachineDemo {
    public static void main(String[] args) {
        // Create vending machine with 5 items
        VendingMachine vendingMachine = new VendingMachine(5);
        
        System.out.println("=== Testing Normal Operation ===");
        vendingMachine.selectItem();                    // Should work
        vendingMachine.insertCoin(5);                   // Insert $5
        vendingMachine.insertCoin(5);                   // Insert another $5
        vendingMachine.dispenseItem();                   // Should work
        
        System.out.println("\n=== Testing Invalid Operations ===");
        vendingMachine.insertCoin(5);                    // Should fail (need to select item first)
        vendingMachine.selectItem();                      // Should work
        vendingMachine.selectItem();                      // Should fail (already selected)
        
        System.out.println("\n=== Testing Insufficient Funds ===");
        vendingMachine = new VendingMachine(3);           // Reset machine
        vendingMachine.selectItem();
        vendingMachine.insertCoin(3);                     // Insert insufficient amount
        vendingMachine.dispenseItem();                     // Should fail
        
        System.out.println("\n=== Testing Out of Order ===");
        vendingMachine.setOutOfOrder();
        vendingMachine.selectItem();                       // Should fail
        vendingMachine.insertCoin(5);                      // Should fail
        vendingMachine.dispenseItem();                      // Should fail
    }
}