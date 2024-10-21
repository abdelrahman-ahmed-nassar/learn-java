import java.util.Arrays;
import java.util.Scanner;

public class arraysExercise {

  public static void main(String[] args) throws Exception {
    // [1] write a java program to sum values of an array
    Scanner in = new Scanner(System.in);
    int[] arr = new int[5];
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Enter the element #" + i + " : ");
      arr[i] = in.nextInt();
    }


    int sum = 0;
    for (int j : arr) {
      sum += j;
    }

    for (int j : arr) {
      System.out.println(j);
    }

    double avg = (double) sum / arr.length;


    // [2] write a java program to test if an array contains a specific value

    int num = 2;
    boolean isExisted = false;
    for (int i : arr) {
      if (i == num) {
        isExisted = true;
        break;
      }
    }


    System.out.println(isExisted ? "found" : "not found");

    // write a program find max and min in an array
    int min = arr[0];
    int max = arr[0];
    for (int i : arr) {
      if (i < min) {
        min = i;
      }
      if (i > max) {
        max = i;
      }
    }
    System.out.println("min : " + min + " max  :" + max);

    // [3] write a java program sort a numeric numbers
    Arrays.sort(arr);

    // [4] write a java program
  }
}