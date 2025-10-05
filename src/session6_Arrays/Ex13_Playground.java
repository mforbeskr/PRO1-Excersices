package session6_Arrays;

public class Ex13_Playground
{
  public static void main(String[] args)
  {
    // 3D array: [depth][rows][columns]
    int[][][] cube = new int[2][3][4];

    // Initialize some values
    cube[0][0][0] = 1;
    cube[1][2][3] = 100;

    // Access elements
    System.out.println(cube[0][0][0]); // Output: 1
    System.out.println(cube[1][2][3]); // Output: 100
  }
}
