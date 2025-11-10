package binaryexercises;

import java.io.*;
import java.util.ArrayList;

public class ArrayListTest{
  public static void main(String[] args) {

    // Step 1: CREATE ARRAYLIST OF MYDATA OBJECTS
    ArrayList<MyData> originalList = new ArrayList<>();

    // Step 2: ADD SEVERAL MYDATA OBEJCTS
    originalList.add(new MyData("Alice Smith", 30, 75000.0, true, 'B'));
    originalList.add(new MyData("Bob Johnson", 45, 82000.0, false, 'A'));
    originalList.add(new MyData("Charlie Brown", 28, 60000.0, true, 'C'));
    originalList.add(new MyData("Diana Prince", 35, 95000.0, true, 'A'));
    originalList.add(new MyData("Ethan Hunt", 40, 105000.0, false, 'B'));
    originalList.add(new MyData("Fiona Davis", 32, 72000.0, true, 'B'));
    originalList.add(new MyData("George Miller", 50, 120000.0, false, 'A'));

    System.out.println("Original List:");
    for (MyData data : originalList){
      System.out.println(data);
    }

    // Step 3: WRITE THE ENTIRE LIST TO A BINARY FILE
    String filename = "mydatalist.bin";
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
      oos.writeObject(originalList);
      System.out.println("\nList written to file successfully!");
    }
    catch (IOException e) {
      System.out.println("Error loading list: "+ e.getMessage());

    }

    // Step 4: Read the list back from the file
    ArrayList<MyData> retrievedList = null;
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
    {
      retrievedList = (ArrayList<MyData>) ois.readObject();
      System.out.println("List read from file successfully!");
    }
    catch (IOException | ClassNotFoundException e)
    {
      System.out.println("Error loading list: "+ e.getMessage());

    }

    // Step 5: Print the retrieved list
    System.out.println("Retrieved List:");
    for (MyData data : retrievedList) {
      System.out.println(data);
    }

    // Step 6: Compare the original and retrieved lists
    System.out.println("Are they the same object (==)? " + (originalList == retrievedList));
    System.out.println("Are they equal (.equals())? " + originalList.equals(retrievedList));




  }
}
