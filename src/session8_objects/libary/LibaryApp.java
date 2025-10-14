package session8_objects.libary;

import java.util.ArrayList;
import java.util.Scanner;

public class LibaryApp
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Book> library = new ArrayList<>();

    library.add(new Book("Beats & Breaks", "Luna Blaze", 10101, 2022));
    library.add(new Book("Graffiti Dreams", "Kairo D.", 10102, 2021));
    boolean running = true;

    while (running) {
      System.out.println("\n===== LIBRARY MENU =====");
      System.out.println("1. Add a new book");
      System.out.println("2. Search by title");
      System.out.println("3. Search by author");
      System.out.println("4. Search by ISBN");
      System.out.println("5. Loan out a book");
      System.out.println("6. Return a book");
      System.out.println("7. Remove a book");
      System.out.println("8. List all books");
      System.out.println("9. Exit");
      System.out.print("Choose an option: ");

      int choice = scanner.nextInt();

      switch (choice) {
        case 1 -> {
          System.out.print("Enter title: ");
          String title = scanner.nextLine();
          System.out.print("Enter author: ");
          String author = scanner.nextLine();
          System.out.print("Enter ISBN (number): ");
          int isbn = Integer.parseInt(scanner.nextLine());
          System.out.print("Enter year: ");
          int year = Integer.parseInt(scanner.nextLine());
          library.add(new Book(title, author, isbn, year));
          System.out.println("Book added successfully!");
        }

        case 2 -> {
          System.out.print("Enter title to search: ");
          String title = scanner.nextLine();
          library.stream()
              .filter(b -> b.getTitle().equalsIgnoreCase(title))
              .forEach(System.out::println);
        }

        case 3 -> {
          System.out.print("Enter author to search: ");
          String author = scanner.nextLine();
          library.stream()
              .filter(b -> b.getAuthor().equalsIgnoreCase(author))
              .forEach(System.out::println);
        }

        case 4 -> {
          System.out.print("Enter ISBN to search: ");
          int isbn = Integer.parseInt(scanner.nextLine());
          library.stream()
              .filter(b -> b.getIsbn() == isbn)
              .forEach(System.out::println);
        }

        case 5 -> {
          System.out.print("Enter ISBN of book to loan: ");
          int isbn = Integer.parseInt(scanner.nextLine());
          for (Book b : library) {
            if (b.getIsbn() == isbn) {
              b.loanOut();
            }
          }
        }

        case 6 -> {
          System.out.print("Enter ISBN of book to return: ");
          int isbn = Integer.parseInt(scanner.nextLine());
          for (Book b : library) {
            if (b.getIsbn() == isbn) {
              b.returnBook();
            }
          }
        }

        case 7 -> {
          System.out.print("Enter ISBN of book to remove: ");
          int isbn = Integer.parseInt(scanner.nextLine());
          library.removeIf(b -> b.getIsbn() == isbn);
          System.out.println("Book removed (if found).");
        }

        case 8 -> {
          System.out.println("\nAll books in the library:");
          for (Book b : library) {
            System.out.println(b);
          }
        }

        case 9 -> {
          running = false;
          System.out.println("Exiting the library system. Goodbye!");
        }

        default -> System.out.println("Invalid choice, try again.");
      }
    }

    scanner.close();
  }
}