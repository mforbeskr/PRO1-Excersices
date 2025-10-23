package session11_.AggregationExcercises.WizardAndWand;

public class Wand {

private WoodType woodtype;
private String coreMaterial;
private int powerLevel;

public Wand (WoodType woodtype, String coreMaterial, int powerLevel){
  this.woodtype = woodtype;
  this.coreMaterial = coreMaterial;
  this.powerLevel = powerLevel;
  }

  public WoodType getWoodtype()
  {
    return woodtype;
  }

  public String getCoreMaterial()
  {
    return coreMaterial;
  }

  public int getPowerLevel()
  {
    return powerLevel;
  }

  public String getWandDescription(){
  return "Wood type: " + this.woodtype + ". Core Material: " + this.coreMaterial + ". Power Level: " + getPowerLevel();
  }

  @Override public String toString()
  {
    return "Wand{" + "woodtype=" + woodtype + ", coreMaterial='" + coreMaterial
        + '\'' + ", powerLevel=" + powerLevel + '}';
  }


}

