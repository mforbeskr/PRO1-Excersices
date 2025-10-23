package session14_Abstract.GameCharacters;

public class MainPlayingRoom
{
  public static void main(String[] args) {


    Archer hunter = new Archer("Hunter", 100, 80, 2000);
    Mage mage = new Mage("Mage", 80, 140, "Codex of Darkness");
    Warrior warrior = new Warrior("Warrior", 120, 80, "Two-handed Axe");

    System.out.println(hunter);
    System.out.println(mage);
    System.out.println(warrior);
    warrior.levelUp();

    warrior.takeDamage(120, DamageType.Physical);
    System.out.println(warrior.getCurrentHealth());
    warrior.takeDamage(120, DamageType.Magical);



  }
}
