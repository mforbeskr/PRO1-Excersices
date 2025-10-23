package session11_.AggregationExcercises.WizardAndWand;

public class Wizard {

private String name;
private Wand wand;

  public Wizard(String name, Wand wand)
  {
    this.name = name;
    this.wand = wand;
  }

  @Override public String toString()
  {
    return "Wizard{" + "name='" + name + '\'' + ", wand=" + wand + '}';
  }

  public void castSpell(String spellName, int requiredPower){
   if (requiredPower > wand.getPowerLevel()){
     System.out.println("Can't cast that yet!");
   }
   else {
     System.out.println(this.name + " is casting " + spellName);
   }



   }

}
