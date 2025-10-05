package session6_Arrays;

public class Ex1_DefaultValues
{
  public static void main(String[] args)
  {
    int[] numbers = new int[5];     //LAVER STØRRELSEN PÅ ARRAY //int altid '0' som default
    numbers[1] = 4;                 // TILDELER INDEX 1 EN NY VÆRDI
    System.out.println(numbers[1]); // KALDER PÅ INDEX 1 I ARRAY OG UDSKRIVER VÆRDI


    String[] names = new String[5]; // String altid 'null' som default
    names[2] = "Alice";
    System.out.println(names[2]);


    boolean[] flags = new boolean[5]; // Boolean altid false som default
    flags[2] = true;
    System.out.println(flags[2]);

  }

}
