package session14_Abstract.Animals;

public class MainAnimals
{
  public static void main(String[] args)
  {


   Dog doggo = new Dog("Doggo", 2, "Rottweiler");
   Dog henrik = new Dog("Henrik", 4, "Svin");
   Cat kitty = new Cat("Missy", 4, false);

    doggo.sleep();

    System.out.println(doggo.equals(henrik));


    Bird fugl1 = new Bird("birdie", 12, true);


    fugl1.sleep("right");


    }
  }