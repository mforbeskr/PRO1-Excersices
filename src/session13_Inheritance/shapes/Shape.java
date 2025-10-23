package session13_Inheritance.shapes;

public class Shape
{

  protected double area;
  protected double circumference;
  protected String name;


  public double calculateArea(){
    return 0.0;
  }

  public String getName()
  {
    return name;
  }

  public Shape(String name)
  {
    this.name = name;
  }
}
