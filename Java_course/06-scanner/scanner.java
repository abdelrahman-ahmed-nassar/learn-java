
import java.util.Scanner;

public class scanner {

    public static void main(String[] args) throws Exception {
        // creating a scanner object from the scanner class
        Scanner in = new Scanner(System.in);

        // give an input message 
        System.out.println("Enter the number: ");

        //* ### use the scanner object  ###

        // get integer 
        int userInputInt = in.nextInt();
        // get float 
        float userInputFloat = in.nextFloat();
        // get Byte 
        byte userInputByte = in.nextByte();
        // get Short 
        short userInputShort = in.nextShort();
        // get Long 
        long userInputLong = in.nextLong();
        // get Double 
        double userInputDouble = in.nextDouble();


        //* ### get string from user  ###
        // get String 
        String userInputString = in.next();

        // get the string with spaces
        String userInputStringLn = in.nextLine();

        // get char
        char userInputChar = in.next().charAt(0);




        System.out.println("the number: " + userInputInt);
        System.out.println("the float: " + userInputFloat);
        System.out.println("the byte: " + userInputByte);

    }
;
}
