package session11_.AssociationExcercises.Extended;

import session11_.AssociationExcercises.Case;
import session11_.AssociationExcercises.Detective;

public class Main_DetectiveCasesExtend
{
  public static void main(String[] args)
  {

    DetectiveExtend d1 = new DetectiveExtend("Sherlock", "M22A");
    CaseExtend c1 = new CaseExtend("#221.2014", "Terror");

    System.out.println(d1.getName());
    d1.takeCase(c1);
    d1.addEvidence(new Evidence("Wet", "Metal", "London", "14y/o run-off", "'Shank'"));
    System.out.println(c1);
    d1.solveCase();
    d1.closeCase();



  }
}
