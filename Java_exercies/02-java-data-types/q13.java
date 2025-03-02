
import java.util.Scanner;

public class q13 {

  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    int max = Integer.MIN_VALUE;
    int min =  Integer.MAX_VALUE;

    for (int i = 0; i < 10; i++) {
        
    }
    

    for (int i = 0; i < 5; i++) {
        int n = in.nextInt();
        if(n > max) {
          max = n;
        }
         if (n < min) {
          min = n;
        }
     }
     System.out.printf("min : %d -- max : %d", min, max);
  };
}