package session7_lists;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex5_ContainsElements {
  public static void main(String[] args) {

    ArrayList<String> names = new ArrayList<>();
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");

    System.out.println(names.indexOf("Bob"));      // 1
    System.out.println(names.indexOf("Diana"));    // -1


    System.out.println("_______________________");

    String[] initialFruits = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "kiwi"};
    int index = Arrays.asList(initialFruits).indexOf("elderberry");

    System.out.println(index);     // 4

    System.out.println("_______________________");
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);

    System.out.println();
    System.out.println(numbers.indexOf(20));    // 1
    System.out.println(numbers.indexOf(40));    // -1

    System.out.println("_______________________");

    ArrayList<String> colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("green");
    colors.add("blue");
    colors.add("yellow");

    System.out.println(colors.indexOf("blue"));   // 1 (first occurrence)
    System.out.println(colors.indexOf("yellow")); // 4
  }
}
