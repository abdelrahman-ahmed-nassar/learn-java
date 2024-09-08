import java.util.Scanner;

public class do_while_loop {

  public static void main(String[] args) throws Exception {

    // do-while loop
    // main difference that it execute at least once even the condition is false 

    int c = 0;

    do {
      System.out.println("Hello, World!");
      c++;
    } while (c < 5);

    // when to use do-while loop

    // [1] if you don't know the initial value  and want to execute whatever it is

      char letter ;

      System.out.println("Enter the char: ");
      Scanner in = new Scanner(System.in);

      do {

          letter = in.next().charAt(0);
      }while (letter != 'q');

      char let ;


      // [2] when the condition that you will check will be generated after the first iteration
      do {
        // enter the letter
        let = in.next().charAt(0);
      }while(let != 'q');
      in.close();
  };
}