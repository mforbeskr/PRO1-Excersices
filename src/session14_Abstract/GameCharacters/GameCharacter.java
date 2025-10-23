package session14_Abstract.GameCharacters;

public abstract class GameCharacter {

  String name;
  int maxHealth;
  int currentHealth;
  int level;
  boolean isAlive = true;

  public GameCharacter(String name, int maxHealth)
  {
    this.name = name;
    this.maxHealth = maxHealth;
    this.currentHealth = maxHealth;
  }

  public void heal (int amount){
    this.currentHealth += amount;
    System.out.println(name+" heals for " + amount + ". Current HP: " + currentHealth);
  }

  public boolean isAlive(){
    return isAlive;
  }
  public void levelUp(){
    this.level = level+1;
  }

  public void takeDamage (int damage, DamageType type){
  }

  public abstract void attack();

  public abstract void defend ();

  public abstract void specialAbility();

  @Override public String toString()
  {
    return "GameCharacter{" + "name='" + name + '\'' + ", maxHealth="
        + maxHealth + ", currentHealth=" + currentHealth + ", level=" + level
        + ", isAlive=" + isAlive + '}';
  }

  public String getName()
  {
    return name;
  }

  public int getCurrentHealth()
  {
    return currentHealth;
  }

  public int getLevel()
  {
    return level;
  }
}

enum DamageType {
  Physical,
  Magical;
}



