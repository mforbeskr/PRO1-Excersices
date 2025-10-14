package session8_UML.BookClass;

public class Book
{

  private String title;
  private String author;
  private int pages;
  private double price;

  public Book(String title, double price, int pages, String author)
  {
    this.title = title;
    this.price = price;
    this.pages = pages;
    this.author = author;
  }

  public String getTitle()
  {
    return title;
  }

  public void setTitle(String Title)
  {
    this.title = Title;
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public void displayInfo()
  {
    System.out.println("Book information:");
    System.out.println(
        "title : '" + title + '\'' + ", author= '" + author + '\''
            + ", pages= " + pages + ", price= " + price + "$");
  }

  @Override public String toString()
  {
    return "Book{" + "title= '" + title + '\'' + ", author= '" + author + '\''
        + ", pages= " + pages + ", price= " + price + '$';
  }
}

