package session7_lists;

import java.util.ArrayList;

public class ListsExcercises
{
  public static void main(String[] args)
  {
    ArrayList<String> list = new ArrayList<>();
    list.add("Apple");
    list.add("Banana");
    list.add("Citrus");
    System.out.println(list);

    System.out.println("Enter a fruit and wished position on list as a number"); // MANGLER 'SCANNER' OG RESTERENDE KODE, PRØV UDFØR :)

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
