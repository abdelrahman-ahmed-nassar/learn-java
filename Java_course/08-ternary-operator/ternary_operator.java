public class ternary_operator {

  public static void main(String[] args) throws Exception {
    //* ### Logical operators ###

    /*
    and => &&
    or => ||
    -- can be written double or single & |
    not => !
     */


    //*  ### Ternary operator

    // deal with expression not statements

    // expression ? (if true) : (if false)
    int y = 1;
    int z = y==1 ? 1: 2;

    // nested ternary operator
    int l = y == 1 ? 1 :  (5 == y) ? 1 : 0 ;
    
    //*  ### check data type [with non primitive] ###

    String myName = "ali";
    System.out.println(myName instanceof String); 
    //  return boolean
    
    System.out.println(z);
    System.out.println(l);
  };
}