package session10_Excercises___Repetitions.Dragon;

public class MainDragon
{
  public static void main(String[] args)
  {

    Dragon dragon1 = new Dragon("Chainreaver", 100, 50, 25);
    Dragon dragon2 = new Dragon("Toothless", 80, 40, 25);
    Dragon dragon3 = new Dragon("Red Proto Drake", 150, 75, 30);

    System.out.println(dragon1.getName() + " vs " + dragon2.getName());

    dragon1.takeFlight();
    dragon1.breatheFire();
    dragon1.castSpell();

    dragon2.takeFlight();
    dragon2.breatheFire();

    System.out.println(dragon1.getName() + " health: " + dragon1.getHealth());
    System.out.println(dragon2.getName() + " health: " + dragon2.getHealth());

    System.out.println();

    dragon3.takeFlight();
    dragon3.land();

    Dragon dragon4 = new Dragon("Vidun", 4, 10, 10);
    dragon4.takeFlight();
    dragon4.breatheFire();
    dragon4.setMagicPower(100);
    System.out.println(dragon4.getMagicPower());
    dragon4.breatheFire();
    dragon4.land();
    dragon4.castUltimate("All kids Sleep");
    System.out.println(dragon4.getMagicPower());

  }
}
