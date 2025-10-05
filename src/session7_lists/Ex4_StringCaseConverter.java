package session7_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4_StringCaseConverter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<String> words = new ArrayList<>();
    words.add("hello");
    words.add("WORLD");
    words.add("Java");
    words.add("CODE");
    words.add("programming");
    words.add("FUN");

    System.out.println("original words: " + words);


      System.out.println("Enter word position (1-" + (words.size()) + "): ");
      int position = scanner.nextInt() -1;
      scanner.nextLine();

      if (position >= 0 && position < words.size())
      {
        System.out.println("Enter operation (upper/lower): ");
        String operation = scanner.nextLine ();

        String currentWord = words.get(position);
        String newWord;

        if (operation.equals("upper"))
        {
          newWord = currentWord.toUpperCase();
          words.set(position, newWord);

          System.out.println(
              "Word at position " + position + " changed from '" + currentWord
                  + " to '" + newWord + "'.");
          System.out.println("updated words: " + words);
        }

        else if (operation.equals("lower"))
        {
          newWord = currentWord.toLowerCase();
          words.set(position, newWord);
          System.out.println(
              "Word at position " + position + " changed from '" + currentWord
                  + " to '" + newWord + "'.");
          System.out.println("updated words: " + words);
        }
        else
        {
          System.out.println(
              "Not a valid input. please enter 'upper' or 'lower'.");
        }
      }else{
        System.out.println("Invalid position!");
      }

  }
}
