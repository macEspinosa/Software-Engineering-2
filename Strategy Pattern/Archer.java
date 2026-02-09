package characters;
import strategies.attack.ShootArrow;
import strategies.defense.Dodge;

public class Archer extends Character {
    public Archer() {
        attackStrategy = new ShootArrow();
        defenseStrategy = new Dodge();
    }
}