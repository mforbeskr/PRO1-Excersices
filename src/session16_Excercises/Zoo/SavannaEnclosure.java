package session16_Excercises.Zoo;

public class SavannaEnclosure extends Enclosure
{
  private boolean hasWaterhole;
  private double grassAreaSize;

  public SavannaEnclosure(int id, String name, boolean hasWaterhole, double grassAreaSize)
  {
    super(id, name);
    this.hasWaterhole = true;
    this.grassAreaSize = grassAreaSize;
  }

  public double getGrassAreaSize()
  {
    return grassAreaSize;
  }

  public void setGrassAreaSize(double grassAreaSize)
  {
    this.grassAreaSize = grassAreaSize;
  }

  public boolean HasWaterhole()
  {
    return hasWaterhole;
  }

  public void setHasWaterhole(boolean hasWaterhole)
  {
    this.hasWaterhole = hasWaterhole;
  }

  @Override public int getMaxCapacity()
  {
    return 0;
  }

  @Override public String getEnclosureType()
  {
    return "";
  }
}
