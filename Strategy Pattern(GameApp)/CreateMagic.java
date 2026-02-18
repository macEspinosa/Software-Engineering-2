package strategies.defense;

import strategies.DefenseStrategy;

public class CreateMagic implements DefenseStrategy {
    @Override
    public void defend() {
        System.out.println("Creating a magic barrier for defense!");
    }
}