package session16_Excercises.ApartmentComplex;


public class Main
{
  public static void main(String[] args) {
    // Create an apartment complex
    ApartmentComplex complex = new ApartmentComplex("123 Main Street");

    // Create apartments
    Apartment apt101 = new Apartment(101);
    Apartment apt102 = new Apartment(102);
    Apartment apt103 = new Apartment(103);
    Apartment apt104 = new Apartment(104);

    // Add apartments to complex
    complex.add(apt101);
    complex.add(apt102);
    complex.add(apt103);
    complex.add(apt104);

    System.out.println("Apartment Complex: " + complex);
    System.out.println("Number of apartments: " + complex.getNumberOfApartments());

    // Create tenants
    Tenant john = new Tenant("John Smith");
    Tenant sarah = new Tenant("Sarah Johnson");

    // Create rental dates
    MyDate date1 = new MyDate(1, 3, 2024);
    MyDate date2 = new MyDate(15, 3, 2024);

    // Rent apartments
    System.out.println("\n--- Renting Apartments ---");
    apt101.rentTo(john, date1);
    System.out.println("Apartment 101 rented to: " + apt101.getTenant());

    apt103.rentTo(sarah, date2);
    System.out.println("Apartment 103 rented to: " + apt103.getTenant());

    // Check availability
    System.out.println("\n--- Checking Availability ---");
    System.out.println("Apartment 101 available? " + apt101.isAvailable());
    System.out.println("Apartment 102 available? " + apt102.isAvailable());
    System.out.println("Apartment 103 available? " + apt103.isAvailable());
    System.out.println("Apartment 104 available? " + apt104.isAvailable());

    // Get first available apartment
    Apartment available = complex.getFirstAvailableApartment();
    System.out.println("\nFirst available apartment: " + available);

    // Find apartment by number
    System.out.println("\n--- Finding Apartments ---");
    Apartment foundByNumber = complex.getApartmentByNumber(103);
    System.out.println("Apartment 103: " + foundByNumber);

    // Find apartment by tenant
    Apartment foundByTenant = complex.getApartmentByTenant(john);
    System.out.println("Apartment rented by John Smith: " + foundByTenant);

    // Display all apartments
    System.out.println("\n--- All Apartments ---");
    for (int i = 0; i < complex.getNumberOfApartments(); i++) {
      Apartment apt = complex.getApartment(i);
      System.out.println(apt);
    }
  }
}
