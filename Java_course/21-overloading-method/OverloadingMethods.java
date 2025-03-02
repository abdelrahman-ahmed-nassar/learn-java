
public class OverloadingMethods {

    static int sum(int a, int b) {
        return a + b;
    }

    static float sum(float a, float b) {
        return a + b;
    }

    static float sum(int a, float b) {
        return a + b;
    }

    // you can use an overloaded function in another one
    static void fun() {
        System.out.println("hello : ");
    }

    static void fun(int x) {
        fun();
        System.out.println("x : " + x);
    }

    /*
    how compiler differ from the methods
    [1] from the number of arguments
    [2] from the arguments data types (!! not the return value)
     */
    public static void main(String[] args) throws Exception {
        // different methods has the same name (different signatures (parameter type))
        // this is because of the polymorphism

        System.out.println("sum int : " + sum(1, 2));
        System.out.println("sum int : " + sum(1.3f, 2.5f));
        System.out.println("sum int : " + sum(1, 2.5f));

        fun();

    }

    // you can overload the main function
;
}
