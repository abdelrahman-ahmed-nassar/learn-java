public class FunctionsExamples {
    // write a java method to find the smallest number among three numbers

    static int minNumber(int n1, int n2, int n3) {

      // if (n1 < n2 && n1 < n3) {
      //   return n1;
      // } else if (n2 < n1 && n2 < n3) {
      //   return n2;
      // }else {
      //   return n3;
      // }

      //---------------

      int minNumber = n1;
      for(int i = 0; i < 3; i++) {
        if(n2 < minNumber)  {
          minNumber = n2;
        }else if (n3 < minNumber) {
          minNumber = n3;
        }
      }
      return minNumber;
    }

    // write a java method to calculate average of the three numbers
    static float average(float n1, float n2, float n3) {

      return (n1 + n2 + n3) / 3;
    }

    // write a function that calc the sum of n numbers
    static int sumAll(int...numbers){
      // now numbers is an array

      // looping over the array using for each
      int s = 0;
      for (int i:numbers) {
        s = s + i;
      }
      return s;
    }


  public static void main(String[] args) throws Exception {

    System.out.println("min : " + minNumber(1, 4, 7));

    System.out.println("average:" + average(1, 2, 3));

    System.out.println("sum All : " + sumAll(1, 2, 3, 5, 6));
  };
}