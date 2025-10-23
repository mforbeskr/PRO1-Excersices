package session11_.AggregationExcercises.MagicCarpet;

public class MainCarpetRacer
{
  public static void main(String[] args)
  {

    FlyingCarpet carpet1 = new FlyingCarpet("Tailored Carpet", "Neatherweave",
        400);
    Racer racer1 = new Racer("Fastboi", 300);



    carpet1.addRacer(racer1);
    System.out.println("Carpet has racer: " + carpet1.hasRacer());

    carpet1.releaseRacer();
    System.out.println("Carpet has racer: " + carpet1.hasRacer());


  }
}
