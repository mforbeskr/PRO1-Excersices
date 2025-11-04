package session16_Excercises.Zoo;

public class AviaryEnclosure extends Enclosure
{
  private double height;
  private boolean hasCoverTop;

  public AviaryEnclosure(int id, String name, double height,
      boolean hasCoverTop)
  {
    super(id, name);
    this.height = height;
    this.hasCoverTop = hasCoverTop;
  }

  public double getHeight()
  {
    return height;
  }

  public void setHeight(double height)
  {
    this.height = height;
  }

  public boolean HasCoverTop()
  {
    return hasCoverTop;
  }


  public void setHasCoverTop(boolean hasCoverTop)
  {
    this.hasCoverTop = hasCoverTop;
  }

  @Override public int getMaxCapacity()
  {
    return 0;
  }

  @Override public String getEnclosureType()
  {
    return "Aviary Enclosure";
  }
}
