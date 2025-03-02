import java.util.Arrays;

public class passArraysToMethods {
  // take array
  public static void printArr(int[] args) {
    for (int i : args) {
      System.out.println(i);
    }
  }

  // return array
  public static int[] getArray() {
    return new int[]{1, 2, 3};
  }

  // get array by reference
  static void setArray(int[] x) {
    x[0] = 50;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    printArr(arr);

    // passing anonymous array
    printArr(new int[]{1, 2, 3});

    // printing a returned array
    int[] arr2 = getArray();
    System.out.println(arr2[0]);
    System.out.println(arr2); // will be the address of the array
    System.out.println(Arrays.toString(arr2)); // print the elements

    // arrays is reference called
    int arr3[] = {1, 2, 3};
    int arr4[] = {10, 20, 30};
    arr3 = arr4; // now the two arrays has the same reference
    arr4[0] = 100;
    System.out.println(arr3[0]);

    setArray(arr); // will work
    System.out.println(arr[0]);
  }
}