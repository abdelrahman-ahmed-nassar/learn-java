
public class RecursionExamples {

    // fibonacci series 
    // 0 1 2 3 4 5 6 7  8  9  10 ... (argument)
    // 0 1 1 2 3 5 8 13 21 34 55 ... (return value)


    public static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // print fibonacci series
    static int n1 = 0, n2 = 1, n3, counter = 0;

    static void printFib(int n) {
        // for (int i = 0; i < n; i++) {
        //     System.out.println(fibonacci(i));
        // }
        counter++;
        if (counter == 1) {
            System.out.print(n1 + " " + n2);
            n = n - 2;
        }

        if (n > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFib(n - 1);
        }
    }

    // 4..6 = 4 + 5 + 6
    static int sum(int a, int b) {


        if (a == b) {
            return a;
        } else {
            if (a < b) {
                return a + sum(a + 1, b);
            } else {
                return a + sum(a - 1, b);
            }
        }
        // SUM = (upper - lower + 1) * (lower + upper) / 2
    }


    public static void main(String[] args) throws Exception {
        // printFib(5);
        // fibonacci(3);
        System.out.println(sum(6, 4));
    }
}
