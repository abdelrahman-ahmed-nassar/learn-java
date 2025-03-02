public class ArithmeticOperators2 {

  public static void main(String[] args) throws Exception {
      int y = 0;
      int x = 1;
    //* ###  Prefixes & Postfixes ### 

    // pre increment
    // ++x
    // --x

    // post increment
    // x++
    // x--

    System.out.println(++x);
    System.out.println(x++);

  // MAKES difference in other expressions


    System.out.println(y);
  y = x++;
    System.out.println(y);
  y = ++x;
    System.out.println(y);


  //! HAS high precedence 
  y = ++x * ++x;


  System.out.println(y);

  //* ### Assignment operator ###
  // =
  // +=
  // -=
  // *=
  // /=
  // %=
  // &=
  // ^=
  // |=
  // <<=
  // >>=
  // >>>=

  };
} 