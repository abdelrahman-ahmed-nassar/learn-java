
public class IfStatement {

    public static void main(String[] args) throws Exception {
        //* ### Relational operator
        int a = 10;
        /*
        ==
        !=
        >
        <
        >=
        <=
         */
        //* ### Selection Statement ###
        int num = 10;

        // one line condition [can remove curly braces]
        if (num == 10) {
            System.out.printf("number = 10");
        }

        // multi line condition
        if (num > 0) {
            System.out.println("greater0");
        } else if (num < 0) {
            System.out.println("smaller than 0");
        } else {
            System.out.println("Number = 0");
        }
    }
;
}
