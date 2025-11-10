package binaryexercises;

import java.io.*;

public class SingleObjectTest {
  public static void main(String[] args) {

    // CREATING AN INSTANCE OF 'MYDATA' OBJECT
    MyData original = new MyData("Hassan", 30, 44.000, true, 'A');
    System.out.println("Original: " + original);


    // WRITE OBJECT TO A BINARY FILE
    String filename = "mysingleobject.bin";
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
      oos.writeObject(original);
      System.out.println("Object written to file successfully");
    }
    catch (IOException e)
    {
      System.out.println("Error loading object: "+ e.getMessage());
    }

    // READ THE OBJECT BACK FROM THE FILE
    MyData retrieved = null;
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){

      retrieved = (MyData) ois.readObject();
      System.out.println("Object successfully read from file");
    }
    catch (IOException | ClassNotFoundException e)
    {
      System.out.println("Error loading object: "+ e.getMessage());
    }

    // PRINT BOTH OBJECTS
    System.out.println("retrieved: " + retrieved);

    // COMPARE OBJECTS
    System.out.println("Are they the same object (==)? " + (original == retrieved));
    System.out.println("Are they equal (.equals())? " + original.equals(retrieved));

  }
}
