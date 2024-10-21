import java.util.Scanner;

public class arrayChar {
  public static void main(String[] args) {
    char[] arr = {'a', 'b', 'c', 'd', 'e'};

    // don't need a loop to print
    System.out.println(arr);

    // see the ASCII
    System.out.println((int) 'A');

    // can store by ASCII Unicode (A 65, a 97)
    char[] arr2 = {97 , 98};
    System.out.println(arr2);

    // you don't need to preserve last space with null

    // get array of char from the user
    Scanner in = new Scanner(System.in);
    arr = in.next().toCharArray(); // take string before first space
    arr = in.nextLine().toCharArray(); // make it accept spaces

    // sting to array of char
    String myString = "omar";
    arr = myString.toCharArray();

    // you have builtin methods in the char array
    // Array.sort()

    // make a string from char array [arr, start , length]
    String str = new String(arr, 0, 2);
  }
}