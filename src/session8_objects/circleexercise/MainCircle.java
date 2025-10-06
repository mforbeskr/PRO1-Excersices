package session8_objects.circleexercise;

public class MainCircle {
  public static void main(String[] args) {

Circle c = new Circle(33, "Green", 66);
Circle q = new Circle(44, "Purple", 88);
Circle b = new Circle(11, "Abdi");
Circle h = new Circle();
Circle c2 = new Circle(10);
Circle myCircle = new Circle(11, "Purple");

c.display();
    System.out.println();
q.display();
    System.out.println();
b.display();
    System.out.println();
h.display();
    System.out.println();
c2.display();
    System.out.println();
System.out.println(myCircle);
myCircle.display();
    System.out.println();
    System.out.println(q);


  }
}
