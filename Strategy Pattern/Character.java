package characters;
import strategies.AttackStrategy;
import strategies.DefenseStrategy;

public abstract class Character {
    protected AttackStrategy attackStrategy;
    protected DefenseStrategy defenseStrategy;
    
    public void attack() {
        attackStrategy.attack();
    }
    
    public void defend() {
        defenseStrategy.defend();
    }
    
    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
    
    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }
}