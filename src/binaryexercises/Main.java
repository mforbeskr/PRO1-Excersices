package binaryexercises;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main
{
  public static void main(String[] args)
  {
        // Create MyData objects
        List<MyData> myDataList = new ArrayList<>();
        myDataList.add(new MyData("Hassan", 30, 44.000, true, 'A'));
        myDataList.add(new MyData("Beta", 20, 55.000, false, 'b'));
        myDataList.add(new MyData("Gamma", 40, 60.000, true, 'C'));

        // Create MyOtherData objects
        List<MyOtherData> myOtherDataList = new ArrayList<>();
        myOtherDataList.add(new MyOtherData("Item A", 5, true, 12.99));
        myOtherDataList.add(new MyOtherData("Item B", 10, false, 8.49));
        myOtherDataList.add(new MyOtherData("Item C", 3, true, 19.99));

        // Create DataContainer
        DataContainer container = new DataContainer(myDataList, myOtherDataList);

        // Serialize DataContainer to file
        String filename = "dataContainer.ser";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
          oos.writeObject(container);
          System.out.println("DataContainer has been serialized to " + filename);
        } catch (IOException e) {
          System.out.println(e.getMessage());
        }

        // Deserialize DataContainer from file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
          DataContainer readContainer = (DataContainer) ois.readObject();
          System.out.println("Deserialized DataContainer:");
          System.out.println(readContainer);
        } catch (IOException | ClassNotFoundException e) {
          System.out.println(e.getMessage());

        }
      }
    }
