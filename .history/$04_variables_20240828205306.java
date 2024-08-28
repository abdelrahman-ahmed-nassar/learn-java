
public class $04_variables {

    public static void main(String[] args) throws Exception {
        System.out.println("hello world");

        // [1] define the data type
        // [2] define the name 
        // [3] assignment operator
        // [4] assign a value
        // [5] define the value type
        int example = 10;

        /* NAMING CONVENTIONS :
        allowed special chars : $ , _

        forbidden
          - no space 
          - not start with number
         */
        // PRIMITIVE DATA TYPE
        byte z = 1; // from -128 -> 127
        short n = 1000; // from -2^15 -> 2^15
        int x = 10; // Integer.MAX_VALUE -> Integer.MAX_VALUE (32 bit)
        long l = 10; // Integer.MAX_VALUE -> Integer.MAX_VALUE (32 bit)

        float y = 2.3f; // Float.MAX_VALUE -> Float.MAX_VALUE (7 digits)
        double s = 2.3d; // Double.MAX_VALUE -> Double.MAX_VALUE (15 digits)


        System.out.println(example);
        System.out.println(z);
        System.out.println(n);
        System.out.println(x);
        System.out.println(l);
        System.out.println(y);
        System.out.println(s);
    };
}
