package session11_.AggregationExcercises.PirateAndTreasureMap;

public class MainPirateTreasureMap {

  public static void main(String[] args) {

    Pirate sparrow = new Pirate("Jack Sparrow", "Lawless", 40);
    TreasureMap carribeanMap = new TreasureMap("Roatan", "N15°30' W75°45'", "A Pot of Gold", 20);

    sparrow.acquireMap(carribeanMap);
    System.out.println("Pirate has map: " + sparrow.hasMap());

    System.out.println(carribeanMap.getMapInfo());

    sparrow.giveAwayMap();
    System.out.println("Pirate has map: " + sparrow.hasMap());


    sparrow.addProsthetic("EyePatch", "Eye", "Leather", "Replacement for Eye");
    sparrow.addProsthetic("Tree Leg", "Left Leg", "Almond Tree", "Replacement for Left Eye");


    for (Prosthetic p: sparrow.getProsthetics()){
      System.out.println(p);
    }

  }
}
