package session13_Inheritance.shapes;

public class circle extends Shape
{
  public circle(double radius)
  {
    super("Circle");
    this.radius = radius;
  }

  private double radius;

  @Override public double calculateArea()
  {
    return 2*Math.PI*radius;
  }
}
