public class BranchingStatement {

  public static void main(String[] args) throws Exception {
    //*  ### Branching statement ###


    // unlabeled break : Cause immediate exit from control structure
    // continue: Skips remaining statement in a for loop
    // return : Exit from current method

    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        continue;
      }
        System.out.println(i);

        if (i == 8) {
          break;
        }
    }


  };
}