package session11_.AggregationExcercises.MagicCarpet;

public class FlyingCarpet {

  private String carpetName;
  private String material;
  private String condition;
  private int speedRating;
  private Racer racer;

  public FlyingCarpet(String carpetName, String material, int speedRating)
  {
    this.carpetName = carpetName;
    this.material = material;
    this.speedRating = speedRating;
  }

  public void addRacer (Racer racer){
    if (this.racer == null){
      this.racer = racer;
      System.out.println(racer.getName() + " has been added to " + carpetName);
    }else {
      System.out.println("This carpet already has a racer!");
    }
  }

  public Racer releaseRacer () {
    if (racer != null)
    {
      Racer released = racer;
      racer = null;
      System.out.println(
          released.getName() + " has been released from " + carpetName);
      return released;
    }else{
      System.out.println("no racer to release!");
      return null;
    }
  }

  public boolean hasRacer (){
   return racer !=null;
  }

  public String getCarpetName()
  {
    return carpetName;
  }

  public String getMaterial()
  {
    return material;
  }

  public int getSpeedRating()
  {
    return speedRating;
  }

  public String getCondition()
  {
    return condition;
  }
}
