package session13_Inheritance.shapes;

public class rectangle extends Shape
{

  private double width;
  private double height;

  public rectangle(double width, double height)
  {
    super("Rectangle");
    this.width = width;
    this.height = height;
  }

  @Override public String toString()
  {
    return "rectangle{" + "area=" + area + ", circumference=" + circumference
        + ", name='" + name + '\'' + '}';
  }

  @Override public double calculateArea()
  {
    return height*width;
  }


}
