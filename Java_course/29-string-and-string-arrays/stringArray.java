
public class stringArray {
  public static void main(String[] args) {
    // java class string
    String str = "ahmed";
    String str1 = new String("ahmed");


    // built in methods

    /*
    .concat("", "")
    .equals() [check equality for strings created by new String()]
    .equalsIgnoreCase() [check equality with x]
    .compareTo() [ASCII first difference]
    .trim() [remove spaces]
    .toUpperCase()
    .toLowerCase()

    String.valueOf(value) [string casting] or [ + ""]

    .replace("", "") [replace all]
    .contains() [return boolean | when letter -> "a"]

    .endsWith("") [return boolean]
    .startsWith("")

    .subString(<startIndex> , <endIndex>) [end is optional]

    .split(" ") [convert String to array and use it in forEach]
    */

    // when two strings has the same value they will share same place in memory (string pool)

    String str3 = "ahmed";
    String str4 = "ahmed";

    // str3 = str4 ==> will not copy reference but the value

    System.out.println(str3 == str4); // true

    String str5 = new String("ahmed");
    String str6 = new String("ahmed");

    System.out.println(str5 == str6); // false
    System.out.println(str3.equals(str6)); // true (compare content)
    
  }
}

