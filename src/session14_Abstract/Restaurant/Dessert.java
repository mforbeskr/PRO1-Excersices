package session14_Abstract.Restaurant;

public class Dessert extends MenuItem
{
  private boolean isCold;
  private int sweetnessLevel;

  public Dessert(String name, double basePrice, int preparationTime,
      boolean isCold, int sweetnessLevel)
  {
    super(name, basePrice, preparationTime);
    this.isCold = isCold;
    if (sweetnessLevel < 1 || sweetnessLevel > 5) {
      System.out.println("Sweetness level must be between 1 and 5.");
    }
    this.sweetnessLevel = sweetnessLevel;
  }

  @Override public void prepare()
  {
    System.out.println("Preparing dessert: " + name + ", Chilling/Setting as needed, Adding sweetness level (level " + sweetnessLevel +")");
  }

  @Override public double calculateCost()
  {
    if (isCold){
      System.out.println("Cold desserts costs 10% more");
      return basePrice *= 1.08;
    }
    else{
      System.out.println("Room temperature appetizers costs 3% more");
      return basePrice *= 1.03;
    }
  }

  public String getDescription()
  {
    if (isCold)
    {
      return "Name: " + name + "| Base Price: " + basePrice
          + "| Preparation Time: " + preparationTime + "| Sweetness Level: "
          + sweetnessLevel + " Temperature: Cold";
    }
    else
    {
      return "Name: " + name + "| Base Price: " + basePrice
          + "| Preparation Time: " + preparationTime + "| Sweetness Level: "
          + sweetnessLevel + " | Temperature: Room temperature";
    }
  }
  @Override public String toString()
  {
    return "Dessert {" + "isCold=" + isCold + ", sweetnessLevel="
        + sweetnessLevel + ", name='" + name + '\'' + ", basePrice=" + basePrice
        + ", preparationTime=" + preparationTime + '}';
  }
}