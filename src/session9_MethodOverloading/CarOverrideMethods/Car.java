package session9_MethodOverloading.CarOverrideMethods;

import java.util.Objects;

public class Car {

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

  public void updateMileage(int newMileage){
    if (newMileage >= mileage){
      mileage = newMileage;
      System.out.println("The cars mileage is now: " + mileage);
    }
    else {
      System.out.println("Error. The mileage cannot be decreased.");
    }
  }

  @Override public String toString()
  {
    return "Car{" + "make= '" + make + '\''
        + ", model= '" + model + '\''
        + ", year= " + year + ", mileage= " + mileage + '}';
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Car other = (Car) obj;
    return  make.equals(other.make) &&
            model.equals(other.model) &&
            mileage == other.mileage &&
            year == other.year;
  }


  @Override
  public int hashCode() {
    // Simple and common approach using java.util.Objects, notice the import at the top
    return Objects.hash(make, model, mileage, year);
  }


}
