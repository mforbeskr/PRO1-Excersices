package session16_Excercises.ApartmentComplex;

import java.util.Objects;

public class MyDate
{
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public MyDate()
  {
    day = 1;
    month = 1;
    year = 1;
  }

  // Getters
  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public void setDate(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  @Override public boolean equals(Object o)
  {
    if (o == null || getClass() != o.getClass())
      return false;
    MyDate myDate = (MyDate) o;
    return day == myDate.day && month == myDate.month && year == myDate.year;
  }

  @Override public int hashCode()
  {
    return Objects.hash(day, month, year);
  }

  @Override public String toString()
  {
    return "Date{" + day + "/" + month + "/" + year + '}';
  }
}
