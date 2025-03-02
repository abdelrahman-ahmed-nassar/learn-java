
// import java.lang.Math.*;

public class BuiltinMethods {

    public static void main(String[] args) throws Exception {
        /*
    Java Number Methods
    Java String Methods
    Java Character Methods
    Java Array Methods
         */

        //*  ###  Math Class & Numbers methods ###
        // import java.lang.Math;
        // absolute value
        // can use abs() direct => import java.lang.Math.abs;

        System.out.println(Math.abs(-1));

        // ceil value (to biggest int value)
        System.out.println(Math.ceil(1.2)); // 2
        System.out.println(Math.ceil(-1.9)); // -2
        
        // floor (to the smallest int value)
        System.out.println(Math.ceil(1.9)); // 1
        System.out.println(Math.ceil(-1.1)); // 2
        
        // round number (round 5)
        System.out.println(Math.round(1.6)); // 2
        System.out.println(Math.round(1.4)); // 1

        // square root 
        System.out.println(Math.sqrt(4)); // 2

        // cosine
        System.out.println(Math.cos(1)); // 0

        // exponential by 2
        System.out.println(Math.exp(2)); // 4

        // ln
        System.out.println(Math.log(2.73));

        // log
        System.out.println(Math.log10(1));

        // power (2^3)
        System.out.println(Math.pow(2,3)); 

        // random (0 , 1) (not 1 | could be 0)
        System.out.println(Math.random());

        // ranged range
        // (random() * (max - min)) + min

        // maximum value of 2 values
        System.out.println(Math.max(2.5 , 6));
        // more than one
        System.out.println(Math.max(2.5 , Math.max(1,2)));
v
        // minimum value of 2 values
        System.out.println(Math.min(2.5 , 6));
        // more than one
        System.out.println(Math.min(2.5 , Math.min(1,2)));


        //--------------

        //* ### String methods ###

        /*
        CharAt
        CompareTo
        Contains
        concat
        equals
        length
        replace
        substring
        toLowerCase
        toUpperCase
         */
        

         //*  ### Char methods ###

        /*
        isDigit
        isLetter
        isLowerCase
        isUpperCase
         */



    }
;
}
