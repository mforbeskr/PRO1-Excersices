package session6_Arrays;

public class Ex9_SumAndAverage
{
  public static void main(String[] args)
  {
    int[] grades = new int[]{85, 92, 78, 96, 88};
    int sum = 0;

    for (int i = 0; i < grades.length; i++){
      int gradeValue = grades[i];
      sum+=gradeValue;

    }
    System.out.println("Total sum: " + sum);
    System.out.println("Average: " + ((double)sum/grades.length));

  }
}
