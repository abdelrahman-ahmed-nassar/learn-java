import java.util.Scanner;

public class multiDimensionalArray {
  // passing a 2d array
  static void print(int[][] arr) {
    for (int[] i : arr) {
      for (int j : i) {
        System.out.println(j);
      }
    }
  }

  // return 2d array
  static int[][] get2dArray() {
    return new int[][] {
            {1, 2, 3},
            {4, 5, 6}
    };
  }

  public static void main(String[] args) {
    // each row can have variable columns

    // reach a cell [row][cell]

    int[][] arr1 = new int[5][3];

    // define number of cols per row
    arr1[0] = new int[3];


    // define cells
    arr1[0][0] = 1;

    // initialization

    //    int[][] arr1 = new int[][] {
    //            {1, 3, 2},
    //            {1, 3}
    //    };

    int[][] arr = {
            {1, 3, 2},
            {1, 3}
    };

    // get rows number
    System.out.println(arr.length);

    // get cols number
    System.out.println(arr[0].length);

    // loop over array
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.println(arr[i][j]);
      }
    }

    // for each looping
    for (int[] i : arr) {
      for (int j : i) {
        System.out.println(j);
      }
    }

    // transpose of 2d array
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.println(arr[j][i]);
      }
    }
  }

}