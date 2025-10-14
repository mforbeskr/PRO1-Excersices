package session8_UML.StudentClass;

import java.util.Arrays;

public class Student {

  private String name;
  private int id;
  private int[] grades;


  public Student (String name, int id){
    this.name = name;
    this.id= id;
    this.grades = new int[0];
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }


  public void addGrade(int grade){
  int[] newGrades = new int [grades.length +1];
  for (int i = 0 ; i < grades.length; i++){
    newGrades[i] = grades[i];
  }
    newGrades[grades.length] = grade;
    grades = newGrades;
  }


  @Override public String toString()
  {
    return "Student{" + "name='" + name + '\'' + ", id=" + id + ", grades="
        + Arrays.toString(grades) + '}';
  }
}
