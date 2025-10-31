package session16_Excercises.ColourPalette;


import java.util.ArrayList;

public class ColourPalette
{
  private int numberOfColours;
  private int maxNumberOfColours;
  private ArrayList<Colour> colours;

  public ColourPalette(int maxNumberOfColours)
  {
    numberOfColours = 0;
    this.maxNumberOfColours = maxNumberOfColours;
    colours = new ArrayList<>();
  }
  //

  public int getNumberOfColours()
  {
    return numberOfColours;
  }

  public void addColour(Colour colour)
  {
    if (numberOfColours < maxNumberOfColours)
    {
      colours.add(colour);
      System.out.println();
      numberOfColours++;
    }
  }

  public Colour getColour(int index)
  {
    return colours.get(index).copy();
  }

  public int getNumberOfGrayColours()
  {
    int grayColours = 0;
    for (Colour colour : colours)
    {
      if (colour.isGray())
      {
        grayColours++;
      }
    }
    return grayColours;
  }

  public void mixColours(int index, Colour colour)
  {
    colours.get(index).mixWith(colour);
  }

  @Override public boolean equals(Object obj)
  {
    return super.equals(obj);
  }

  @Override public String toString()
  {
    return colours.toString();
  }
}
