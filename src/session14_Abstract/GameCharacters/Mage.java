package session14_Abstract.GameCharacters;

public class Mage extends GameCharacter {

private int mana;
private String spellBook;

  public Mage(String name, int maxHealth, int mana, String spellBook)
  {
    super(name, maxHealth);
    this.mana = mana;
    this.spellBook = spellBook;
  }

  @Override public void takeDamage(int damage, DamageType type)
  {
    super.takeDamage(damage, type);
    if (type == DamageType.Magical){
      int magicTaken = (int) (damage * 0.5);
      this.currentHealth = currentHealth-magicTaken;
      System.out.println(this.name + " absorbs some of the damage! Takes " + magicTaken + " damage.");
    }
    else {
      this.currentHealth = currentHealth-damage;
      System.out.println(this.name + " takes " + damage + " damage");
    }
    if (currentHealth <= 0){
      isAlive = false;
      System.out.println(name + " has died.");
    }
  }

  @Override public void attack()
  {
    System.out.println(name + " attacks!");

  }

  @Override public void defend()
  {
    System.out.println(name + " defends!");

  }

  @Override public void specialAbility()
  {
    if (!isAlive){
      System.out.println(name + " is dead. Cannot perform action.");
    }
    else {
      System.out.println(name + " uses special ability Frostfireball!");
    }
  }

  public void castSpell (String spell){
    System.out.println(name + " is casting " + spell);
  }

}
