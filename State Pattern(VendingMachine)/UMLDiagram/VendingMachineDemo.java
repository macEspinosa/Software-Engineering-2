public class VendingMachineDemo {
    public static void main(String[] args) {
        // Create vending machine with 5 items
        VendingMachine machine = new VendingMachine(5);
        
        System.out.println("=== Vending Machine Demo ===\n");
        
        // Test Idle State
        System.out.println("1. Testing Idle State:");
        machine.selectItem(); // Should work
        machine.insertCoin(0.50); // Should show error
        
        System.out.println("\n2. Testing ItemSelected State:");
        machine.insertCoin(0.50); // Should add to balance
        machine.selectItem(); // Should show error
        machine.dispenseItem(); // Should dispense (now $1.00 total)
        
        System.out.println("\n3. Testing Dispensing State:");
        machine.selectItem(); // Should show waiting message
        machine.insertCoin(0.25); // Should show waiting message
        machine.dispenseItem(); // Should complete and return to Idle
        
        System.out.println("\n4. Testing OutOfOrder State:");
        machine.setOutOfOrder(); // Set out of order
        machine.selectItem(); // Should show out of order
        machine.insertCoin(1.00); // Should show out of order
        machine.dispenseItem(); // Should show out of order
    }
}