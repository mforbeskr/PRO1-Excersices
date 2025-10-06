package session8_objects.Rectangle;

public class Rectangle
{

  private double width;
  private double height;
  private String color;

  public Rectangle(String color, double width, double height)
  {
    this.color = color;
    this.width = width;
    this.height = height;
  }

  public Rectangle(String color, double side)
  {
    this.color = color;
    this.width = side;
    this.height = side;

  }

  @Override
  public String toString() {
    if (width==height){
      return "Rectangle: Width: " + width + ", Height: " + height + ", Color: "
          + color + ". This is a square!";

    }else {
      return "Rectangle: Width: " + width + ", Height: " + height + ", Color: "
          + color;
    }
  }

}
