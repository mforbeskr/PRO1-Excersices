package session7_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_SetMethodLists {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    ArrayList<Integer> Grades = new ArrayList<>();
    Grades.add(85);
    Grades.add(72);
    Grades.add(91);
    Grades.add(68);
    Grades.add(95);

    System.out.println("Original grades: " + Grades);

    while(true){
      System.out.print("Enter student number 1-5 (0 to Exit): ");
      int chosenStudent = scanner.nextInt();

      if (chosenStudent == 0 ){
        System.out.println("Closing program... Bye!");
        return;
      }

      if (chosenStudent >= 1 && chosenStudent <= 5)
      {
        System.out.print("Enter new grade: ");
        int chosenGrade = scanner.nextInt();

        int index = chosenStudent - 1;
        int oldGrade = Grades.set(index, chosenGrade);

        System.out.println("Updated grades: " + Grades);
        System.out.println("Grade for student " + chosenStudent
            + " changed from " + oldGrade
                + " to " + chosenGrade);
        System.out.println();
      }else {
        System.out.println("Invalid student number");
      }
    }
  }
}
