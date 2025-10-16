package session11_.AssociationExcercises.Extended;


public class DetectiveExtend
{

  private String name;
  private String badgeNumber;
  private CaseExtend currentCase;

  public DetectiveExtend(String name, String badgeNumber){
    this.name = name;
    this.badgeNumber = badgeNumber;
    this.currentCase = null;
  }

  public String getBadgeNumber()
  {
    return badgeNumber;
  }

  public String getName()
  {
    return name;
  }

  public void takeCase (CaseExtend newCase){
    if(newCase != null){
      this.currentCase = newCase;
      System.out.println(name + " working on " + newCase.getCaseNumber());
    }else{
      System.out.println("Cannot take a 'null' case.");
    }
  }

  public void takeOffCase (){
    this.currentCase = null;
  }


  public void addEvidence(Evidence e) {
    if (currentCase != null) {
      currentCase.addEvidence(e);  // ✅ delegate to Case
      System.out.println("Added evidence to " + currentCase.getCaseNumber());
    } else {
      System.out.println("No case assigned!");
    }
  }

 public void solveCase ()
 {
   if (currentCase != null)
   {
     currentCase.setStatus("Solved");
     System.out.println(
         "Case " + currentCase.getCaseNumber() + " SOLVED!");
   }else{
     System.out.println("No case assigned, so cannot solve any.");
   }
 }

 public void closeCase(){
    if (currentCase !=null){
      currentCase.setStatus("Closed");
      System.out.println("Case" + currentCase.getCaseNumber() + " is now closed.");
      currentCase = null;
    }
 }

  @Override public String toString()
  {
    return "Detective {name = '" + name + '\'' + ", badgeNumber = '"
        + badgeNumber + '\'' + ", currentCase = " + currentCase + '}';
  }
}
