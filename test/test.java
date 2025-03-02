public class test {
  public static void main(String[] args) {
      String s1 = "abc";
      String s2 = s1;
      s1 = s1 + "d";

      System.out.println(s1);  // Output?
      System.out.println(s2);  // Output?
      System.out.println(s1 == s2);  // Output?
  }
}