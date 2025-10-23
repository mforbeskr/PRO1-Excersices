package session11_.AggregationExcercises.WizardAndWand;

public class MainMagicWonderLand
{
  public static void main(String[] args)
  {

    Wand wand1 = new Wand(WoodType.ELDER, "Kunai from Centurion", 94);
    Wizard wizard1 = new Wizard("Chainreaver", wand1);

    System.out.println(wizard1);

    wizard1.castSpell("Perfect Execution", 20);


    Wand wand2 = new Wand(WoodType.YEW, "Babushka", 400);
    Wizard wizard2 = new Wizard("Akali", wand2);

    System.out.println(wand2.getWandDescription());

    wizard2.castSpell("Five Point Strike", 40);
    System.out.println(wand2.getPowerLevel());
    System.out.println(wand2.getWoodtype());
    System.out.println(wand2.getCoreMaterial());
    System.out.println(wand2.getWandDescription());
  }
}


enum WoodType{
  OAK,
  ELDER,
  HAWTHORN,
  CYPRESS,
  YEW;
}