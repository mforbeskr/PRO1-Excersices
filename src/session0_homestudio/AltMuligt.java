package session0_homestudio;

public class AltMuligt
{

  public static void main(String[] args)
  {

    boolean isPerfect = true;

    String name = "Georgia";
    String email = "error404@gmail.com";
    String age = "27";
    String car = "Bentley";
    String color = "purple";

    System.out.println("Hello " + name + ".");
    System.out.println("You are " + age + " years old.");
    System.out.println("Your email is " + email + ".");
    System.out.println("You favorite color is " + color + ".");
    System.out.println("Did you ever own a " + car + "?");

    if (isPerfect)
    {
      System.out.println("You are so perfect!");
    }
    else{
      System.out.println("You can do better.");
    }
  }
}
