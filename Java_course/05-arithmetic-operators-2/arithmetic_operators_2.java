public class arithmetic_operators_2 {

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

  // DOES not make difference in declaration

  // MAKES difference in other expressions
  System.out.println(++x);
  System.out.println(x++);

  y = x++;
  y = ++x;

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