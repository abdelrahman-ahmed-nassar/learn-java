
import java.util.Scanner;

public class WhileLoop2 {

    public static void main(String[] args) throws Exception {
        //* ### Sentinel while loop###

        // when repeat a code depending on a condition 
        // example
        char letter = 'a';

        System.out.println("Enter the char: ");
        Scanner in = new Scanner(System.in);

        while (letter != 'q') {

            letter = in.next().charAt(0);
        }

        //* ### Flag while loop ###

        // when repeat a code depending on a boolean expression
        // example
        boolean flag = true;
        while (flag) {
          letter = in.next().charAt(0);
          if (letter == 'q') {
            flag = false;
          }
        } // end while


        in.close();
    }
;
}
