package session14_Abstract.GameCharacters;

public class Archer extends GameCharacter {

  private int accuracy;
  private int arrows;


  public Archer(String name, int maxHealth, int accuracy, int arrows)
  {
    super(name, maxHealth);
    this.accuracy = accuracy;
    this.arrows = arrows;
  }

  @Override public void takeDamage(int damage, DamageType type)
  {
    super.takeDamage(damage, type);
    int doubleTaken = (int) (damage * 1.5);
    this.currentHealth = currentHealth-doubleTaken;
    System.out.println(this.name + " suffers! Takes " + doubleTaken + " damage.");
    if (currentHealth <= 0){
      isAlive = false;
      System.out.println(name + " has died.");
    }
  }

  @Override public void attack()
  {
    super.attack();
  }

  @Override public void defend()
  {
    super.defend();
  }

  @Override public void specialAbility()
  {
    if (!isAlive){
      System.out.println(name + " is dead. Cannot perform action.");
    }
    else {
      System.out.println(name + " uses special ability Chimera Shot!");
    }
  }

  public void shootArrow (){
    System.out.println(name + " is shooting arrows" );
  }




}
