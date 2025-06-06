
public class  VariablesAndDataTypes {

    public static void main(String[] args) throws Exception {
        //* ### variables ### 

        // [1] define the data type
        // [2] define the name 
        // [3] assignment operator
        // [4] assign a value
        // [5] define the value type

        int example = 10;
        int example1 = 0, example2 = 3;
        float f = 2.4f;


        /* NAMING CONVENTIONS :
        naming style : camelCase

        allowed special chars : $ , _

        forbidden
            - no space 
            - not start with number
         */

        System.out.println(f);
        System.out.println(example);
        System.out.println(example1);
        System.out.println(example2);

        //* ### PRIMITIVE DATA TYPE ###
        
        byte myByte = 19; // from -128 -> 127
        short myShort = 1000; // from -2^15 -> 2^15
        
        int myInt = 10; // Integer.MAX_VALUE -> Integer.MAX_VALUE (32 bit)
        long myLong = 10; // Long.MAX_VALUE -> Long.MAX_VALUE (64 bit)
        
        // the default dealing with a float number is double => use f to indicate conversion
        float myFloat = 2.3f; // Float.MAX_VALUE -> Float.MAX_VALUE (7 digits)
        double myDouble = 2.3d; // Double.MAX_VALUE -> Double.MAX_VALUE (15 digits)
        

        char myChar = 's'; // must be single quote
        char myCharByCode = 97; // can use the ASCII code
        boolean myBoolean = true; // NOT bool

        // * OBJECT DATA TYPE (reference)
        String myName = "ahmed omar";

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println(myBoolean);

        System.out.println(myName);

        // byte store in java
        byte binaryToDecimal = 0b1111111;

        System.out.println(binaryToDecimal);

        //* ### STRING CONCATENATION ### 
        System.out.println("x = " + myInt);

        //*  ### making a constant variable ###
        final double PI = 3.14;
        System.out.println("PI = " + PI);
    }
;
}
