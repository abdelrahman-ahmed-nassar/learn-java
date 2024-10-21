public class NestedLoops {

  public static void main(String[] args) throws Exception {
    

    for (int i = 0; i < 10; i++) {
        System.out.println("Outer Loop : " + i);
        // cannot access j here
        for (int j = 0; j < 10; j++) {
            System.out.println("--- Inner loop : " + j + " Outer loop : " + i);
        }
    }
  };
}