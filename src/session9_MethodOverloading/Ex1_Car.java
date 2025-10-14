package session9_MethodOverloading;

public class Ex1_Car
{
  private String make;
  private String model;
  private int year;
  private int mileage;

public Ex1_Car(String make, String model, int year, int mileage)
{
  this.make = make;
  this.model = model;
  this.year = year;
  this.mileage = mileage;
}

public void updateMileage(int newMileage)
{
  mileage = newMileage;
}

@Override public String toString()
  {
    return "Ex1_Car{" + "make='" + make + '\'' + ", model='" + model + '\''
        + ", year=" + year + ", mileage=" + mileage + '}';
  }

@Override
  public boolean equals(Object other){

  if (other== null)
  return false;
  if (!(other instanceof Ex1_Car))
  return false;
  Ex1_Car otherCar = (Ex1_Car)other;
  boolean isSame = this.make.equals(otherCar.make)&&
      this.model.equals(otherCar.model)&&
      this.year == otherCar.year &&
      this.mileage == otherCar.mileage;
  return isSame;

}

}
