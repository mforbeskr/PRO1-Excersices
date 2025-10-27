package session15_Interfaces.MadHouse;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;


public class test
{
  House house = new House();

  public static void main(String[] args)
  {
    try {
      String asciiArt = Files.readString(Path.of("src/Ascii_art.txt"));
      System.out.println(asciiArt);
    } catch (IOException e) {
      e.printStackTrace();
    }

    House house = new House();
    house.setLivingRoom(new LivingRoom("Living Room", "A large living room with a fireplace and a large window."));
    house.setKitchen(new Kitchen("Kitchen", "Huge kitchen with marble countertops and a large window, with a view of the garden."));
    house.setKitchen(new Kitchen("Kitchen", "A shoddy second kitchen that is quite unhygienic. Use the other one."));
    house.addBathroom(new Bathroom("Bathroom", "A bathroom with a small window. Just a toilet and a sink. You will have to wash yourself in the sink."));
    house.setGarage(new Garage("Garage", "This is actually just a drive way."));

    house.addRoom(new GenericRoom("Office", "A room with a small window. Great as an office."));
    house.addRoom(new GenericRoom("Kids Room", "The perfect kids room with pink colored walls."));

    house.display();

  }
}

