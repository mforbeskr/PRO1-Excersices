package session11_.AssociationExcercises.Extended;

import java.util.ArrayList;
import java.util.List;

public class CaseExtend
{

  private String caseNumber;
  private String crimeType;
  private List<Evidence> evidence = new ArrayList<>();
  private String status;

  public CaseExtend(String caseNumber, String crimeType)
  {
    this.caseNumber = caseNumber;
    this.crimeType = crimeType;
    this.evidence = new ArrayList<>();
    this.status = "Open";
  }

  public String getCaseNumber()
  {
    return caseNumber;
  }

  public String getCrimeType()
  {
    return crimeType;
  }

  public String getStatus()
  {
    return status;
  }

  public void setStatus(String status)
  {
    this.status = status;
  }


  public void addEvidence (Evidence e){
    this.evidence.add(e);
  }

  public List<Evidence> getEvidence()
  {
    return evidence;
  }

  @Override public String toString()
  {
    return "Case " + caseNumber + " (" + crimeType + ") - " + status;
  }
}
