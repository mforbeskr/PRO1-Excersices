package session15_Interfaces.MadHouse;


public class test
{
  House house = new House();

  public static void main(String[] args)
  {
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

