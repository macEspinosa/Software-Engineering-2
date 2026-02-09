package strategies.attack;

import strategies.AttackStrategy;

public class CastSpell implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Casts a spell!");
    }
}