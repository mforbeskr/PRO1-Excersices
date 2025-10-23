package session13_Inheritance.shapes;

public class runShapes
{
  public static void main(String[] args)
  {
    rectangle rectangle = new rectangle(5.0, 46.0);
    rectangle other = new rectangle(4.0, 10.0);
    circle circle = new circle(4.7);
    triangle triangle = new triangle();
    Shape[] arrayOfShapes = new Shape[]{rectangle, other, circle};

  }
}
