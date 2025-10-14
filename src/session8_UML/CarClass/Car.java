package session8_UML.CarClass;

public class Car
{
  private String make;
  private String model;
  private int year;
  private int mileage;



  public Car (String make, String model, int year, int mileage){
    this.make = make;
    this.model = model;
    this.year = year;
    this.mileage = mileage;
  }

  public String getMake()
  {
    return make;
  }

  public void setMake(String make)
  {
    this.make = make;
  }

  public void drive(int distance)
  {
    System.out.println(
        "You drive the " + make + " " + distance + " kilometers.");
  }

  public void displayDetails()
  {
    System.out.println(make);
    System.out.println(model);
    System.out.println(year);
    System.out.println(mileage);
  }

  @Override public String toString()
  {
    return "Car{" + "make='" + make + '\'' + ", model='" + model + '\''
        + ", year=" + year + ", mileage=" + mileage + '}';
  }
}
