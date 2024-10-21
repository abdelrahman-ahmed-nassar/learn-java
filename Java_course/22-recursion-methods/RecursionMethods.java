
public class RecursionMethods {

    public static int factorial(int a) {
        if (a == 1) {
            return 1;
        }
        return a * factorial(a - 1
        );
    }
    static int counter = 0;

    public static void fun() {
        counter++;
        if (counter < 5) { // base case 
            System.out.println("HI");
            fun();
        }
        // counter++ (infinite recursion)
    }

    // *### indirect recursion ###
    // when two function calling each other

    public static void main(String[] args) throws Exception {
        // use a function in itself
        fun();
        int a = factorial(1);
        System.out.println(a);
    }
}
