package characters;
import strategies.attack.CastSpell;
import strategies.defense.CreateMagic;

public class Wizard extends Character {
    public Wizard() {
        attackStrategy = new CastSpell();
        defenseStrategy = new CreateMagic();
    }
}