// Peso20Dispenser.java
public class Peso20Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 20) {
            int num = cur.getAmount() / 20;
            int remainder = cur.getAmount() % 20;
            System.out.println("Dispensing " + num + " 20 bills");
            if (remainder != 0) {
                System.out.println("Remaining amount: " + remainder + " cannot be dispensed");
            }
        } else {
            System.out.println("Remaining amount: " + cur.getAmount() + " cannot be dispensed");
        }
    }
}