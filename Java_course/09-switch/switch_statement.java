
import java.util.Scanner;

public class switch_statement {

    public static void main(String[] args) throws Exception {
        /*
    switch (expression) {use case}
    use it when there is a variable that you want to compare with different values.

    it depend on the equality comparison

    if it equal a specific value you execute the code

    if no case is equal, it will execute the default
         */

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the day: ");
        String day = in.next().toLowerCase();

        // switch control statement
        switch (day) {
            case "saturday":
                System.out.println(1);
                break;
            case "sunday":
                System.out.println(2);
                break;
            case "monday":
                System.out.println(3);
                break;
            case "tuesday":
                System.out.println(4);
                break;
            case "wednesday":
                System.out.println(5);
                break;
            case "thursday":
                System.out.println(6);
                break;
            case "friday":
                System.out.println(7);
                break;
            default:
                System.out.println("invalid day");
        }

        // switch rule for string
        switch (day) {
            case "saturday" ->
                System.out.println(1);
            case "sunday" ->
                System.out.println(2);
            case "monday" ->
                System.out.println(3);
            case "tuesday" ->
                System.out.println(4);
            case "wednesday" ->
                System.out.println(5);
            case "thursday" ->
                System.out.println(6);
            case "friday" ->
                System.out.println(7);
            default ->
                throw new AssertionError();
        }
        

        //!  cannot accept float or double
        //* */ if entered a float or double it will take the int part and ignore the decimal part


        // you can use a block of code => case : {}
        
        /* 
          Case value conditions
          
          [1] must be const and not dynamic
          [2] must be unique
          [3] must  be same type (of the origin variable)
          [4] DO NOT support range, float, double
         */

         // if you have a complex condition rather than equality  => use if else
    }
}
