package session8_objects.libary;

public class Book
{

  private String title;
  private String author;
  private int isbn;
  private int year;
  private boolean isAvailable;


  // Constructors
  public Book (String title, String author, int isbn, int year)
  {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.year = year;
    this.isAvailable = true;
  }


  //Getters

  public String getTitle()
  {
    return title;
  }

  public String getAuthor()
  {
    return author;
  }

  public int getIsbn()
  {
    return isbn;
  }

  public int getYear()
  {
    return year;
  }

  public boolean isAvailable()
  {
    return isAvailable;
  }


  //Methods to loan and return books

  public void loanOut(){
    if (isAvailable){
      isAvailable = false;
      System.out.println(title + "has been loaned out.");
    }
    else {
      System.out.println(title+ " is already loaned out.");
    }
  }

  public void returnBook(){
    if (!isAvailable){
      isAvailable=true;
      System.out.println(title + " has been returned");
    }
    else {
      System.out.println(title+ " was not loaned out");
    }
  }

  @Override
  public String toString(){
    return String.format("%-20s %-20s ISBN: %-10d Year: %-4d [%s]",
        title, author, isbn, year, (isAvailable ? "Available" : "Loaned out"));
  }








}

