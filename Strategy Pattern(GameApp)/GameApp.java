import characters.*;
import characters.Character;
import strategies.defense.Shield;

public class GameApp {
    public static void main(String[] args) {
        System.out.println("=== Welcome to the Game App ===\n");
        
        // Create characters
        Character knight = new Knight();
        Character wizard = new Wizard();
        Character archer = new Archer();
        
        // Display character introductions
        System.out.println("=== Character Introductions ===");
        displayCharacterInfo(knight, "Knight");
        displayCharacterInfo(wizard, "Wizard");
        displayCharacterInfo(archer, "Archer");
        
        // Battle demonstration
        System.out.println("\n=== Battle Demonstration ===");
        demonstrateBattle(knight, wizard, archer);
        
        // Strategy switching demo
        System.out.println("\n=== Strategy Adaptation ===");
        demonstrateStrategySwitching();
    }
    
    private static void displayCharacterInfo(Character character, String type) {
        System.out.println("\n" + type + ":");
        System.out.print("Attack: ");
        character.attack();
        System.out.print("Defense: ");
        character.defend();
    }
    
    private static void demonstrateBattle(Character... characters) {
        System.out.println("\nBattle Sequence:");
        for (int i = 0; i < characters.length; i++) {
            System.out.println("\nRound " + (i + 1) + ":");
            System.out.print("Character " + (i + 1) + " attacks: ");
            characters[i].attack();
            
            int defenderIndex = (i + 1) % characters.length;
            System.out.print("Character " + (defenderIndex + 1) + " defends: ");
            characters[defenderIndex].defend();
        }
    }
    
    private static void demonstrateStrategySwitching() {
        Knight knight = new Knight();
        Archer archer = new Archer();
        
        System.out.println("\n--- Knight's Multiple Defenses ---");
        System.out.print("Knight uses shield: ");
        knight.defend();
        
        knight.useDodgeDefense();
        System.out.print("Knight dodges: ");
        knight.defend();
        
        knight.useMagicBarrierDefense();
        System.out.print("Knight uses magic barrier: ");
        knight.defend();
        
        System.out.println("\n--- Archer Learns New Defense ---");
        System.out.print("Archer's normal defense: ");
        archer.defend();
        
        archer.setDefenseStrategy(new Shield());
        System.out.print("Archer finds a shield: ");
        archer.defend();
    }
}