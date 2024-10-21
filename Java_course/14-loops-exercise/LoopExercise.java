
import java.util.Scanner;

public class LoopExercise {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        // if he didn't define the type of the loop you can use any one
        // while - do while - for


        //* print Numbers from one to 10
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        //* calc sum first 10 float numbers
        float sum = 0;
        for (float i = 1f; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        //* write a program that ask use to input positive integer and then print multiplication table
        System.out.println("Enter a positive number : ");
        int multiNumber = in.nextInt();

        for (int i = 1; i < 13; i++) {
            System.out.printf("%d * %d = %d\n", i, multiNumber, i * multiNumber);
        }

        //* write a for that find the44 factorial 
        System.out.println("Enter a positive number : ");
        int factNumber = in.nextInt();

        int sumFact = 1;
        for (int i = factNumber; i > 1; i--) {
            sumFact *= i;
        }
        System.out.println(sumFact);

        //* write a program that enters 10 integer numbers from the user, and then prints the sum of the even and odd integers
        int sumEven = 0, sumOdd = 0;

        for (int i = 0; i < 1; i++) {
            System.out.println("Enter a positive number : ");
            int n = in.nextInt();

            if (n % 2 == 0) {
                sumEven += n;
            } else {
                sumOdd += n;
            }
        }
        System.out.println("sum even  : " + sumEven + " Sum odd : " + sumOdd);

        //* write a program that solve the following series for n
        // 1 + 1/2 + 1/3 + 1/4 ... 1/n

        System.out.println("Enter a positive number : ");
        int SeriesNumber = in.nextInt();
        float SeriesSum = 0;

        for (int i = 1; i <= SeriesNumber ; i++) {
            SeriesSum += 1.0/i; // covert to float by mixing
        }
        System.out.println("Series sum : " + SeriesSum);

        //*  write a program that calc the average of 10 entered numbers
        float averageSum = 0f;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number : ");
            int n = in.nextInt();
            averageSum += n;
        }
        System.out.println(
          "Avg = "
          +
          averageSum /10);

        in.close();

    }
;
}
