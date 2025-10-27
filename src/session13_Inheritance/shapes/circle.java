package session13_Inheritance.shapes;

public class circle extends Shape
{
  private double radius;

  public circle(double radius)
  {
    super("Circle");
    this.radius = radius;
  }

  @Override public double calculateArea()
  {
    return 2*Math.PI*radius;
  }

  @Override public void move(){
    System.out.println(name + "Cat runs fast");
  }

}

