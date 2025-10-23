package session14_Abstract.Animals;

public class MainAnimals
{
  public static void main(String[] args)
  {
   Dog doggo = new Dog("Doggo", 2, "Rottweiler");
   Dog henrik = new Dog("Henrik", 4, "Svin");
   Cat kitty = new Cat("Missy", 4, false);
   Bird bird = new Bird("Birdie", 12, true);

    bird.fly();
    doggo.sleep();

    System.out.println(doggo.equals(henrik));

    bird.sleep("left");
    doggo.sleep();
    bird.sleep("right");




  }
}
