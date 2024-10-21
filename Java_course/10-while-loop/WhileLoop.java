
public class WhileLoop {

    public static void main(String[] args) throws Exception {
    //* ### First type : Count controlled loop ###

    /*
    while loop MUST

    [1] has a counter with init value
    [2] has a starting condition (Must be boolean => No type corrasion)
    [2] has a breaking line (to exit the loop)
         */
        int count = 1;

        while (count <= 5) {
            System.out.println(count);
            ++count;
        }
        System.out.println(count);
        // count=6

        while (count++ <= 1) {
            System.out.println(count);
            // postfix has high precedence
            /*
            tracing 
            [1] count=1
            [2] apply the postfix operator(next time counter must be 2)
            [3] compare the condition (continue)
            [4] print

            [5] count = 2 
            [6] apply the postfix operator(next time counter must be 3)
            [7] compare the condition (go out of the loop)
            [8]  print count => 3
             */
        }
        System.out.println(count);
        // count=7 

        while (++count <= 5) {
            System.out.println(count);
            // prefix has high precedence
        }
        System.out.println(count);
        // count=3

        while (count >= 5) {
            System.out.println(count);
            --count;
        }
        // count=6

        //* Infinite loop 
        while (true) {
            // System.out.println("infinite loop");
        }

    }
;
}
