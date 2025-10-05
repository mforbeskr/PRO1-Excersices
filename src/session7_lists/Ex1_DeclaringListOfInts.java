package session7_lists;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex1_DeclaringListOfInts {
  public static void main(String[] args){

    ArrayList<Integer> myList = new ArrayList<>();
    myList.add(5);
    myList.add(0,4);
    myList.add(0,3);
    myList.add(1,7);
    int value = myList.get(3);


    System.out.println(myList);
    System.out.println(value);


    ArrayList<String> stringList = new ArrayList<>();

    stringList.add("Banana");
    stringList.add("Orange");
    stringList.add("Strawberry");
    stringList.add("Mango");
    stringList.add("Melon");
    stringList.add(2,"Lichee");


    System.out.println(stringList);



  }
}
