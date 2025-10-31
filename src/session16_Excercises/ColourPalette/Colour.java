package session16_Excercises.ColourPalette;


public class Colour
{
  private int red;
  private int green;
  private int blue;

  public Colour(int red, int green, int blue)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public void set(int red, int green, int blue)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public int getRed()
  {
    return red;
  }

  public int getGreen()
  {
    return green;
  }

  public int getBlue()
  {
    return blue;
  }

  public boolean isGray()
  {
    return red == green && green == blue;
  }

  public void mixWith(Colour colour2)
  {
    this.red = (int) (0.5 * this.red + 0.5 * colour2.red);
    this.green = (int) (0.5 * this.green + 0.5 * colour2.green);
    this.blue = (int) (0.5 * this.blue + 0.5 * colour2.blue);
  }

  public Colour copy()
  {
    return new Colour(red, green, blue);
  }

  @Override public boolean equals(Object o)
  {
    if (this == o) return true;
    if (!(o instanceof Colour colour)) return false;
    return red == colour.red && green == colour.green && blue == colour.blue;
  }

  @Override public String toString()
  {
    return "Colour{" + "red=" + red + ", green=" + green + ", blue=" + blue
        + '}';
  }
}
