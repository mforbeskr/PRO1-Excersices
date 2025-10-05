package session7_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ListsExcercises
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);


    ArrayList<String> list = new ArrayList<>();
    list.add("Apple");
    list.add("Banana");
    list.add("Citrus");
    System.out.println(list);

    System.out.println("Enter a fruit and wished # position on list ");// MANGLER 'SCANNER' OG RESTERENDE KODE, PRØV UDFØR :)
    String inputFruit = scanner.nextLine();
    int inputIndex = scanner.nextInt();

    list.add(inputIndex, inputFruit);

    list.add(1, "Orange");

    System.out.println(list);

    list.add(0,"Mango");
    System.out.println(list);

    list.add(5,"Kiwi");
    System.out.println(list);

    list.add(6, "Melon");

    System.out.println(list);


  }
}
