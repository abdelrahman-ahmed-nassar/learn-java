
import java.util.Scanner;

public class q02 {

  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the first Number : ");
    float firstNumber = in.nextFloat();

    System.out.println("Enter the Second Number : ");
    float secondNumber = in.nextFloat();

    System.out.println(firstNumber / secondNumber);
  }
}