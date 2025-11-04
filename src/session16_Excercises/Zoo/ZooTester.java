package session16_Excercises.Zoo;

public class ZooTester
{

  public static void main(String[] args)
  {
        // Create Zoo
        Zoo myZoo = new Zoo("Wildlife Adventure Park");
        System.out.println("Created Zoo: " + myZoo);

        // Create Enclosures
        Enclosure reptileHouse = new ReptileHouse(101, "Reptile House", 30.5, 80);
        Enclosure aviary = new AviaryEnclosure(102, "Bird Paradise", 15.0, true);
        Enclosure savannahEnclosure = new SavannaEnclosure (103, "Winter Wonderland", false, 27.4);

        // Add Enclosures to Zoo
        myZoo.buildEnclosure(reptileHouse);
        myZoo.buildEnclosure(aviary);
        myZoo.buildEnclosure(savannahEnclosure);

        System.out.println("\nEnclosures added to Zoo:");
        for (Enclosure e : myZoo.getEnclosures()) {
          System.out.println(e);
        }

        // Create Animals
        Animal lion = new Lion("Simba", 5, 190.5, "Golden", 31, 12);
        Animal elephant = new Elephant("Dumbo", 10, 500.0, "green", 20, 10);
        Animal eagle = new Eagle("Sky", 3, 6.0, 2.0, true, 10000);
        Animal penguin = new Penguin("Pingu", 4, 12.0, 2.1, false, 4.8);
        Animal snake = new Snake("Python", 4, 15.0, "Sticky", 22.1, true);
        Animal anole = new Snake("Greeny", 2, 12, "Nasty", 22.1,false);

        // Assign animals to enclosures
        reptileHouse.addAnimal(snake);
        reptileHouse.addAnimal(anole);
        aviary.addAnimal(eagle);
        savannahEnclosure.addAnimal(penguin);
        savannahEnclosure.addAnimal(lion);
        savannahEnclosure.addAnimal(elephant);

        System.out.println("\nAnimals assigned to enclosures.");

        // Display animals in each enclosure

    System.out.println("\n--- Animals in each enclosure ---");
    for (Enclosure e : myZoo.getEnclosures()) {
      System.out.println("\n" + e.getEnclosureName() + ":");
      for (Animal animal : e.getAnimals()) {
        System.out.println(animal); // Calls overridden toString()
      }
    }


    // Test getAllAnimals() from Zoo
        System.out.println("\nAll animals in the zoo:");
        for (Animal a : myZoo.getAllAnimals()) {
          System.out.println(a);
        }

        // Test getTotalAnimals()
        System.out.println("\nTotal number of animals in the zoo: " + myZoo.getAllAnimals());

        // Test findEnclosure by ID
        System.out.println("\nFinding enclosure with ID 102:");
        Enclosure foundEnclosure = myZoo.findEnclosure(102);
        System.out.println(foundEnclosure != null ? foundEnclosure : "Enclosure not found");

        // Test takeOutAnimal
        System.out.println("\nRemoving 'Python' from Reptile House...");
        Animal removedAnimal = reptileHouse.takeOutAnimal(snake);
        System.out.println("Removed: " + removedAnimal);

        // Test getCurrentNumberOfAnimals
        System.out.println("\nCurrent number of animals in Reptile House: " + reptileHouse.getCurrentNumberOfAnimals());

        // Test Animal behaviors
        System.out.println("\n--- Testing Animal behaviors ---");
        lion.makeSound();
        eagle.makeSound();
        snake.makeSound();

        lion.feed("Meat");
        penguin.feed("Fish");

        lion.checkHealth();
        penguin.checkHealth();

        System.out.println("\nFinal Zoo Summary:");
        System.out.println(myZoo);
      }
}