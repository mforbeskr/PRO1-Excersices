package binaryexercises;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DataContainer implements Serializable
{
  private List<MyData> myDataList;
  private List<MyOtherData> myOtherDataList;


  public DataContainer(List<MyData> myDataList, List<MyOtherData> myOtherDataList) {
    this.myDataList = myDataList;
    this.myOtherDataList = myOtherDataList;
  }

  public List<MyData> getMyDataList()
  {
    return myDataList;
  }

  public void setMyDataList(List<MyData> myDataList)
  {
    this.myDataList = myDataList;
  }

  public List<MyOtherData> getMyOtherDataList()
  {
    return myOtherDataList;
  }

  public void setMyOtherDataList(List<MyOtherData> myOtherDataList)
  {
    this.myOtherDataList = myOtherDataList;
  }
}
