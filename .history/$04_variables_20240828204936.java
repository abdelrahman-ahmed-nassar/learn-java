
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
        int x = 10; // Number.MAX_INT
        float y = 2.3f;


        System.out.println(example);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(n);
    };
}
