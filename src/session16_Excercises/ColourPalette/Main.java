package session16_Excercises.ColourPalette;


public class Main
{
  public static void main(String[] args)
  {
    // Create a colour palette with max 5 colours
    ColourPalette palette = new ColourPalette(5);

    // Create some colours
    Colour red = new Colour(255, 0, 0);
    Colour blue = new Colour(0, 0, 255);
    Colour gray = new Colour(128, 128, 128);
    Colour white = new Colour(255, 255, 255);

    // Add colours to palette
    palette.addColour(red);
    palette.addColour(blue);
    palette.addColour(gray);
    palette.addColour(white);

    // Display palette
    System.out.println("Palette: " + palette);
    System.out.println("Number of colours: " + palette.getNumberOfColours());
    System.out.println("Number of gray colours: " + palette.getNumberOfGrayColours());

    // Test colour mixing
    System.out.println("\nBefore mixing:");
    System.out.println("Red: " + red);

    red.mixWith(blue);
    System.out.println("\nAfter mixing red with blue:");
    System.out.println("Red (now purple): " + red);

    // Test palette mixing
    System.out.println("\nMixing palette colour at index 0 with white:");
    palette.mixColours(0, white);
    System.out.println("Colour at index 0: " + palette.getColour(0));

    // Test color copy
    Colour blueCopy = blue.copy();
    System.out.println("\nOriginal blue: " + blue);
    System.out.println("Copy of blue: " + blueCopy);
    System.out.println("Are they equal? " + blue.equals(blueCopy));

    // Test gray detection
    System.out.println("\nIs gray a gray colour? " + gray.isGray());
    System.out.println("Is red a gray colour? " + red.isGray());
  }
}

