package session16_Excercises.Zoo;

public abstract class Reptile extends Animal
{
  private String scaleType;
  private boolean isColdBlooded;

  public Reptile(String name, int age, double weight, String scaleType)
  {
    super(name, age, weight);
    this.scaleType = scaleType;
  }

  public String getScaleType()
  {
    return scaleType;
  }

  public void setScaleType(String newScale){
    this.scaleType = newScale;
  }

  public boolean isColdBlooded(){
    return isColdBlooded;
  }



  }
