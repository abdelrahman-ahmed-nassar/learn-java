// java calculator app
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        // ### fixed array ###

        // container object 
        // fixed elements number of the same datatype

        // array of integers

        int[] myArray = new int[5];

        // access elements [zero based]
        myArray[0] = 1;

        // myArray[5] = 1; ERROR

        // More methods;
        int myArray2[] = new int[5];
        int myArray3[];
        myArray3 = new int[5];

        // Initialization
        int[] n = {1, 2, 3, 4, 5};
        int[] n2 = new int[] {1, 2, 3, 4, 5};
        // can update but not add more elements

        // get length of the array
        System.out.println(n.length);

        // data types 
        // can accept any primitive or non-premitive

        // default value for undefined
        // [int, float, double, short] => 0
        // boolean => false
        // char, string => null

        String myFriends[] = {"ali", "omar"};

        // looping over array
        for (int i = 0; i < myFriends.length; i++) {
            System.out.printf(myFriends[i]);
        }

        // looping over element (for each)
        for(String i: myFriends) {
            System.out.printf(i);
        }

        // size of array
        
        // can only be integer , can be variable
        int size = 15; // can get it from user
        int arr4[] = new int[size];






    }
}