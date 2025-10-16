package session11_.AssociationExcercises;

public class Main_DetectiveCases
{
  public static void main(String[] args)
  {
    Detective d1 = new Detective("Detective Sherlock Holmes", "no.444");
    Case c1 = new Case("#2024-001", "Theft");
    Case c2 = new Case("#2024-002", "Murder");
    d1.takeCase(c1);
    c1.setStatus("Under Investigation");
    System.out.println("Crime: " + c1.getCrimeType() + ", Status: " + c1.getStatus());
    c1.addEvidence("Fingerprints");
    c1.addEvidence("Security footage");
    System.out.println("Evidence found: "+ c1.getEvidence());
    d1.solveCase();
    System.out.print(d1.getName() + " can now take on Case " + c2.getCaseNumber());




  }
}
