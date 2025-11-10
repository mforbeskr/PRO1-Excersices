package binaryexercises;

import java.io.Serializable;

public class MyOtherData implements Serializable
{
  private String description;
  private int quantity;
  private boolean isAvailable;
  private double price;

  public MyOtherData(String description, int quantity, boolean isAvailable,
      double price)
  {
    this.description = description;
    this.quantity = quantity;
    this.isAvailable = isAvailable;
    this.price = price;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public int getQuantity()
  {
    return quantity;
  }

  public void setQuantity(int quantity)
  {
    this.quantity = quantity;
  }

  public boolean isAvailable()
  {
    return isAvailable;
  }

  public void setAvailable(boolean available)
  {
    isAvailable = available;
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  @Override public String toString()
  {
    return "MyOtherData{" + "description='" + description + '\'' + ", quantity="
        + quantity + ", isAvailable=" + isAvailable + ", price=" + price + '}';
  }
}


