package session10_Excercises___Repetitions.Dragon;

public class Dragon {

  private String name;
  private int health;
  private int magicPower;
  private boolean isFlying;
  private int breathPower;
  private int damageTaken;

  public Dragon (String name, int health, int magicPower, int breathPower){
    this.name=name;
    this.health=health;
    this.magicPower=magicPower;
    this.isFlying=false;
    this.breathPower=breathPower;
  }

  public String getName()
  {
    return name;
  }

  public int getHealth()
  {
    return health;
  }

  public int getMagicPower()
  {
    return magicPower;
  }

  public boolean isFlying()
  {
    return isFlying;
  }

  public int getBreathPower()
  {
    return breathPower;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setHealth(int health)
  {
    this.health = health;
  }

  public void setMagicPower(int magicPower)
  {
    this.magicPower = magicPower;
  }

  public void setFlying(boolean flying)
  {
    isFlying = flying;
  }

  public void setBreathPower(int breathPower)
  {
    this.breathPower = breathPower;
  }



  public void breatheFire (){
    setMagicPower(magicPower -10);
    System.out.println(name + " used Fire Breath! *Magic power "+ magicPower + "*.");
  }

  public void takeFlight(){
    isFlying = true;
    System.out.println(name + "[HP: " + getHealth()+ ", MP: " + getMagicPower() + "] is now flying. *Swoosh* ");
  }

  public void land(){
    isFlying = false;
    System.out.println(name + "[HP: " + getHealth()+ ", MP: " + getMagicPower() + "] has now landed. *Ground shakes* ");
  }


  public void castSpell (){
    setMagicPower(magicPower -5);
    System.out.println(name + " casts Pyroblast! *Magic power "+ magicPower + "*.");
  }


  public void castUltimate (String ultimateName){
    setMagicPower(magicPower -15);
    System.out.println(name + " casts " + ultimateName  + " *Magic power "+ magicPower + "*.");
  }
}
