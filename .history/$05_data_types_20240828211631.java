public class $05_data_types {

  public static void main(String[] args) throws Exception {
      //* PRIMITIVE DATA TYPE

      byte my_byte = 1; // from -128 -> 127
      short my_short = 1000; // from -2^15 -> 2^15
      int my_int = 10; // Integer.MAX_VALUE -> Integer.MAX_VALUE (32 bit)
      long my_long = 10; // Long.MAX_VALUE -> Long.MAX_VALUE (64 bit)
      float y = 2.3f; // Float.MAX_VALUE -> Float.MAX_VALUE (7 digits)
      double s = 2.3d; // Double.MAX_VALUE -> Double.MAX_VALUE (15 digits)

      char c = 's'; // must be single quote
      boolean r = true; // NOT bool

      String my_name = "ahmed";

      System.out.println(my_byte);
      System.out.println(my_short);
      System.out.println(my_int);
      System.out.println(my_long);
      System.out.println(y);
      System.out.println(s);
      System.out.println(c);
      System.out.println(r);
      System.out.println(my_name);
  };
} 