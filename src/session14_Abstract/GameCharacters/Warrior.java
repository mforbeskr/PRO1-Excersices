package session14_Abstract.GameCharacters;

public class Warrior extends GameCharacter {

  private int strength;
  private String weapon;

  public Warrior(String name, int maxHealth, int strength, String weapon)
  {
    super(name, maxHealth);
    this.weapon = weapon;
    this.strength = strength;
  }

  @Override public void takeDamage(int damage, DamageType type)
  {
    super.takeDamage(damage, type);
    if (type == DamageType.Physical){
      int physTaken = (int) (damage * 0.5);
      this.currentHealth = currentHealth-physTaken;
      System.out.println(this.name + " absorbs some of the damage! Takes " + physTaken + " damage.");
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
      System.out.println(name + " uses special ability Whirlwind!");
    }
  }

  public void equipWeapon(String newWeapon){
    this.weapon = newWeapon;
    System.out.println(name + " equips the " + newWeapon + ". Feels good!");
  }

  @Override public String toString()
  {
    return "Warrior{" + "strength=" + strength + ", weapon='" + weapon + '\''
        + ", name='" + name + '\'' + ", maxHealth=" + maxHealth
        + ", currentHealth=" + currentHealth + ", level=" + level + ", isAlive="
        + isAlive + '}';
  }
}
