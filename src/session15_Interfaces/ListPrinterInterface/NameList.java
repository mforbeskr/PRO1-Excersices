package session15_Interfaces.ListPrinterInterface;

import java.util.ArrayList;

public class NameList {

  protected ArrayList<String> names;

  public NameList(){
  names = new ArrayList<>();
  }

  public void addName(String name)
  {
    names.add(name);
  }

  protected void printNames (ListPrinterStrategy printer){

  }

}
