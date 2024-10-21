

public class LabeledBreakAndContinue {

  public static void main(String[] args) throws Exception {
    // unlabeled break can only used in the loop 

    // if you want to use the break in any statement to break a block of code
    // if you want to break two loops at the same time
stars:{
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 5; j++) {
        if (j == 3) {
          // break;
          //! only break one block of code 
          break stars;
        }
        System.out.print("* ");
      }
      System.out.println("");
    }
  }

  // print a triangle
      triangle: for (int i = 0; i < 5; i++) {
        System.out.println("");
              for (int j = 0; j < 10; j++) {
                  if (j > i) {
                      continue triangle;
                  }
                  System.out.print("* ");
              }
              System.out.println(" wont' be printed");
          }
      
      // you can combine labeled statements together

      
  };
}