package characters;
import strategies.AttackStrategy;
import strategies.DefenseStrategy;
import strategies.attack.SwingSword;
import strategies.defense.Shield;
import strategies.defense.Dodge;
import strategies.defense.CreateMagic;

public class Knight extends Character {
    public Knight() {
        attackStrategy = new SwingSword();
        defenseStrategy = new Shield();
    }
    
    public void useDodgeDefense() {
        setDefenseStrategy(new Dodge());
    }
    
    public void useMagicBarrierDefense() {
        setDefenseStrategy(new CreateMagic());
    }
    
    public void useShieldDefense() {
        setDefenseStrategy(new Shield());
    }
}