package strategies.attack;

import strategies.AttackStrategy;

public class SwingSword implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Attacks with a sword!");
    }
}