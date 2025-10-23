package session14_Abstract.Restaurant;

public class MainCourse extends MenuItem
{

  private String proteinType;
  private int spiceLevel;

  public MainCourse(String name, double basePrice, int preparationTime,
      String proteinType, int spiceLevel) {

    super(name, basePrice, preparationTime);
    this.proteinType = proteinType;
    if (spiceLevel < 1 || spiceLevel > 5) {
      System.out.println("Spice level must be between 1 and 5.");
    }
    this.spiceLevel = spiceLevel;
  }

  public String getProteinType()
  {
    return proteinType;
  }

  public int getSpiceLevel()
  {
    return spiceLevel;
  }

  @Override public void prepare()
  {
    System.out.println("Preparing main course: " + name + ", Cooking " + proteinType +  ", Adding spices (level "+spiceLevel+")");

  }

  @Override public double calculateCost()
  {
    if (proteinType.equalsIgnoreCase("Beef"))
    {
      System.out.println("Beef course costs 15% more");
      return basePrice *= 1.15;
    }
    else if (proteinType.equalsIgnoreCase("Fish"))
    {
      System.out.println("Fish course costs 12% more");
      return basePrice *= 1.12;
    }
    else if (proteinType.equalsIgnoreCase("Chicken"))
    {
      System.out.println("Chicken course costs 8% more");
      return basePrice *= 1.08;
    }
    else if (proteinType.equalsIgnoreCase("Vegetarian"))
    {
      System.out.println("Veggie course costs 5% more");
      return basePrice *= 1.05;
    }
    else return basePrice;
  }

  public String getDescription(){
    return "Name: " + name + "| Base Price: " + basePrice
        + "| Preparation Time: " + preparationTime
        + "| Spice Level: " + spiceLevel + " | Protein Type: " + proteinType;
  }

  @Override public String toString()
  {
    return "MainCourse {" + "proteinType='" + proteinType + '\''
        + ", spiceLevel=" + spiceLevel + ", name='" + name + '\''
        + ", basePrice=" + basePrice + ", preparationTime=" + preparationTime
        + '}';
  }


}
