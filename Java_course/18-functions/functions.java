
public class functions {
    //* ### functions | methods ###

    // we use it when we have a reusable block of code and make it dynamic
    //* function structure
    // function accessability | function type | return value | function name(parameter type | parameter name) | body
    // when no return value => void
    static void greet() {
        System.out.println("Hello, World!");

        // you can return like this in a void function

        return;
    }

    // using parameters *

    static void printInt(int args) {
        System.out.println(args);
    }

    // return value
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) throws Exception {
        //* function declaration

        // function should be static
        greet();
        //* dynamic function (adding arguments & parameters)

        printInt(1);

        System.out.println(add(1, 2));
        int mySum = add(3, 5);
      System.out.println(mySum);
    }
}
