package session10_Excercises___Repetitions.CarExtended;

public class MainCarExtended {
  public static void main(String[] args) {

Car car = new Car("Audi", "Quattro E-Tron", 2024, 24000);
    System.out.println(car.getBrand() + " " + car.getModel()+  " " + car.getYear());

car.drive(10);
    System.out.println(car.getMileage());

car.drive(20);
    System.out.println(car.getMileage());
car.start();
car.stop();
car.drive(44);
car.start();
car.drive(44);
    System.out.println(car.getMileage());














  }
}
