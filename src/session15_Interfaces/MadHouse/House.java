package session15_Interfaces.MadHouse;


import java.util.ArrayList;

public class House
{
  private Kitchen kitchen;
  private Garage garage;
  private ArrayList<Bathroom> bathrooms = new ArrayList<>();
  private LivingRoom livingRoom;
  private ArrayList<Room> rooms = new ArrayList<>();

  public String getDescription()
  {
    String defaultString = "A wonderful house with a ";
    int numLivingRoom = 0;
    int numKitchen = 0;
    int numBathroom = 0;
    int numGarage = 0;
    int numRooms = 0;

    for (Room room : rooms)
    {
      if (room instanceof Kitchen)
      {
        numKitchen++;
      }
      else if (room instanceof Bathroom)
      {
        numBathroom++;
      }
      else if (room instanceof Garage)
      {
        numBathroom++;
      }
      else
      {
        numRooms++;
      }
    }
    return defaultString + numBathroom + " bathrooms, " + numKitchen
        + " kitchens, " + numGarage + " garages, and " + numRooms
        + " boring rooms";
  }

  public void display()
  {
    System.out.println(getDescription());
    for (Room room : rooms)
    {
      System.out.println(room.getName() + ": " + room.getDescription());
    }
  }

  public void addRoom(Room room)
  {
    rooms.add(room);
  }

  public void addBathroom(Bathroom room)
  {
    bathrooms.add(room);
    rooms.add(room);
  }

  public void setKitchen(Kitchen room)
  {
    this.kitchen = room;
    rooms.add(room);
  }

  public void setGarage(Garage room)
  {
    this.garage = room;
    rooms.add(room);
  }

  public void setLivingRoom(LivingRoom room)
  {
    this.livingRoom = room;
    rooms.add(room);
  }
}