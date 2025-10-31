package session16_Excercises.ApartmentComplex;


public class Apartment
{
  private final int number;
  private Tenant tenant;

  public Apartment(int number)
  {
    this.number = number;
  }

  public int getNumber()
  {
    return number;
  }

  public boolean isAvailable()
  {
    return (tenant == null);
  }
  // return (tenant == null ? true : false)

  public void rentTo(Tenant tenant, MyDate rentedFrom)
  {
    if (isAvailable())
    {
      this.tenant = tenant;
      tenant.setRentedFrom(rentedFrom);
    }
    else
    {
      System.out.println("Apartment " + number + " is already rented.");
    }
  }

  public Tenant getTenant()
  {
    return tenant;
  }

  @Override public String toString()
  {
    String formattedString;
    if (isAvailable())
    {
      formattedString = "number=" + number + ", available";
    }
    else
    {
      formattedString =
          "Apartment{" + "number=" + number + ", " + tenant + '}';
    } return formattedString;
  }
}
