package session8_objects.circleexercise;


public class Circle
{

  private double radius;
  private String color;
  private double diameter;

  Circle(double radius, String color, double diameter)
  {
    this.radius = radius;
    this.color = color;
    this.diameter = radius * 2;
  }

  Circle(double radius, String color)
  {
    this.radius = radius;
    this.color = color;
    this.diameter = radius *2;
  }

  Circle()
  {

  }

  Circle(double diameter)
  {
    this.radius = diameter / 2;
    this.color = "unknown";

  }

  @Override
  public String toString() {
    return "Circle: [radius = " + radius + ", color = " + color + ", diameter=" + diameter + "]";
  }

  void display(){
    System.out.print("Circle: ");
    System.out.print(radius + "\t");
    System.out.print(color+ "\t");
    System.out.print(diameter+ "\t");
  }


}
