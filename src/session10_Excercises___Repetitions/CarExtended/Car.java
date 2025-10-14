package session10_Excercises___Repetitions.CarExtended;

public class Car
{

  private String brand;
  private String model;
  private int year;
  private double mileage;
  private boolean isRunning;

  public Car(String brand, String model, int year, double mileage)
  {
    this.brand = brand;
    this.model = model;
    this.year = year;
    this.mileage = mileage;

    this.isRunning = true;
  }

  public String getModel()
  {
    return model;
  }

  public String getBrand()
  {
    return brand;
  }

  public int getYear()
  {
    return year;
  }

  public double getMileage()
  {
    return mileage;
  }

  public boolean isRunning()
  {
    return isRunning;
  }

  public void setBrand(String brand)
  {
    this.brand = brand;
  }

  public void setRunning(boolean running)
  {
    isRunning = running;
  }

  public void setMileage(double mileage)
  {
    this.mileage = mileage;
  }

  public void setYear(int year)
  {
    this.year = year;
  }

  public void setModel(String model)
  {
    this.model = model;
  }

  public void start()
  {if (isRunning)
  {
    System.out.println("The engine is already on");
  }else{
    System.out.println("You start the " +model+ "'s engine");
    }
    isRunning=true;
  }

  public void stop()
  {if (isRunning){
    System.out.println("You stop the " + model);
  }else{
    System.out.println("Car is already off");
    }
    isRunning=false;
  }

  public void drive(double newMileage)
  {
    if (isRunning)
    System.out.println(
        "You drove "+ newMileage + " kilometers in the " +  model);
    else{
      System.out.println("Error. Car is not running");
    }
    setMileage(mileage+newMileage);
  }




}
