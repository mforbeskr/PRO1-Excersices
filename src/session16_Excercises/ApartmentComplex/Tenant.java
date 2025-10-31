package session16_Excercises.ApartmentComplex;


public class Tenant
{
  private String name;
  private MyDate rentedFrom;

  public Tenant(String name)
  {
    this.name = name;
    this.rentedFrom = null;
  }

  public String getName()
  {
    return name;
  }

  public MyDate getRentedFrom()
  {
    return rentedFrom;
  }

  public void setRentedFrom(MyDate date)
  {
    rentedFrom = date;
  }

  @Override
  public boolean equals(Object obj)
  {
    if (this == obj) return true;
    if (!(obj instanceof Tenant)) return false;

  Tenant other = (Tenant) obj;
  return name == other.name && rentedFrom == other.rentedFrom;
  }


  @Override public String toString()
  {
    return "Tenant{" + "name='" + name + '\'' + ", rentedFrom=" + rentedFrom
        + '}';
  }
}
