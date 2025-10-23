package session14_Abstract.Restaurant;

public class Appetizer extends MenuItem
{
  private boolean isHot;
  private String servingSize;

  public Appetizer(String name, double basePrice, int preparationTime,
      boolean isHot, String servingSize)
  {
    super(name, basePrice, preparationTime);
    this.isHot = isHot;
    this.servingSize = servingSize;
  }

  @Override public void prepare()
  {
    System.out.println("Preparing appetizer: " + name + ", Checking serving size: " + servingSize +  ", Heating/Cooling as needed");
  }

  @Override public double calculateCost()
  {
    if (isHot){
      System.out.println("Hot appetizer costs 10% more");
      return basePrice *= 1.1;
    }
    else{
      System.out.println("Cold appetizer costs 5% more");
      return basePrice *= 1.05;
    }
  }

  public boolean isHot(){
    return isHot;
  }

  public String getServingSize(){
    return servingSize;
  }

  @Override public String getDescription()
  {
    if (isHot)
    {
      return "Name: " + name + "| Base Price: " + basePrice
          + "| Preparation Time: " + preparationTime
          + "| Temperature: Hot | Serving size: " + servingSize;
    }
    else if (!isHot)
    {
      return "Name: " + name + "| Base Price: " + basePrice
          + "| Preparation Time: " + preparationTime
          + "| Temperature: Cold | Serving size: " + servingSize;
    }
    else return "Name: " + name + "| Base Price: " + basePrice
          + "| Preparation Time: " + preparationTime
          + "| Temperature: Room temp. | Serving size: " + servingSize;
  }

  @Override public String toString()
  {
    return "Appetizer {" + "isHot=" + isHot + ", servingSize='" + servingSize
        + '\'' + ", name='" + name + '\'' + ", basePrice=" + basePrice
        + ", preparationTime=" + preparationTime + '}';
  }
}
