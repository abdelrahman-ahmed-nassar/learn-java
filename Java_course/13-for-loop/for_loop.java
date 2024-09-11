
public class for_loop {

    public static void main(String[] args) throws Exception {

        int c = 0;
        while (c < 5) {
            System.out.println("loop");
            c++;
        }

        // repeat with full control
        // for (init variable ; condition ; update variable)
        for (int i = 0; i < 5; i++) {
            System.out.println("loop : " + i);
        }

        // you can update the value within the condition
        //     for (int i = 0; i++ < 5;) {}
        // for loop cannot act like the do while 
        //! Can't access the i variable outside the for loop
        // if you want to access it => declare it outside the loop
        // reverse for loop
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        // custom increment
        for (int i = 0; i < 5; i += 2) {
            System.out.println("loop : " + i);
        }

        // start from 1 and looping 10 times
        for (int i = 1; i <= 10; i++) {
        }
        for (int i = 1; i < 10 + 1; i++) {
        }

        // combine conditions
        for (int i = 0; i < 10 && i % 2 == 0; i++) {
            System.out.println(i);
        }

        // define more than variable
        for (int i = 0, j = 5; i < 6 && j > 0; i++, j--) {
            System.out.println("i : " + i + " J : " + j);
        }

    }
;
}
