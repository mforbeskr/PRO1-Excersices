package binaryexercises;

import java.io.Serializable;

public class MyData implements Serializable {


  private String name;
  private int age;
  private double salary;
  private boolean isActive;
  private char grade;

  public MyData(String name, int age, double salary, boolean isActive,
      char grade)
  {
    this.name = name;
    this.age = age;
    this.salary = salary;
    this.isActive = isActive;
    this.grade = grade;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public double getSalary()
  {
    return salary;
  }

  public void setSalary(double salary)
  {
    this.salary = salary;
  }

  public boolean isActive()
  {
    return isActive;
  }

  public void setActive(boolean active)
  {
    isActive = active;
  }

  public char getGrade()
  {
    return grade;
  }

  public void setGrade(char grade)
  {
    this.grade = grade;
  }

  @Override public String toString()
  {
    return "MyData{" + "name='" + name + '\'' + ", age=" + age + ", salary="
        + salary + ", isActive=" + isActive + ", grade=" + grade + '}';
  }


  @Override
  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    MyData other = (MyData) obj;
    return age == other.age && Double.compare(other.salary, salary) == 0
        && isActive == other.isActive && grade == other.grade && name.equals(
        other.name);
  }
}
