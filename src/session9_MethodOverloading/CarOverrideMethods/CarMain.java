package session9_MethodOverloading.CarOverrideMethods;

public class CarMain {
  public static void main(String[] args) {


Car car1 = new Car (
    "Audi", "TT", 2011, 50000);

Car car2 = new Car (
    "Audi", "TT", 2011, 50000);

    System.out.println("car1 = car2" + car1.equals(car2));
    System.out.println();
    System.out.println(car1);
    System.out.println(car2);
    System.out.println();

   if (car1.hashCode()==car2.hashCode()){
     System.out.println(car1.hashCode());
     System.out.println(car2.hashCode());
     System.out.println("Identical. Alles Gut");
   }
   else {
     System.out.println("not identical hashCodes");
   }

   Car car3 = new Car ("Ferrari", "Gelato", 2001, 100000);

    System.out.println();
       System.out.println(car3);
    System.out.println();

    System.out.println(car1.equals(car3));
    System.out.println(car2.equals(car3));

    if (car3.hashCode()==car1.hashCode()){
      System.out.println("car1 :" +car1.hashCode());
      System.out.println("car2 :" + car2.hashCode());
      System.out.println("car3 :" +car3.hashCode());
      System.out.println("Identical. Alles Gut");
    }
    else {
      System.out.println("car1 hashCode:" +car1.hashCode());
      System.out.println("car2 hashCode:" + car2.hashCode());
      System.out.println("car3 hashCode:" +car3.hashCode());
      System.out.println("not identical hashCodes");
    }



  }
}
