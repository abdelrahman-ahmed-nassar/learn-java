# Data Structures & Algorithms in Java Second Edition

## Table Of content

- [[#chapter.2 : Arrays|chapter.2 : Arrays]]
  - [[#chapter.2 : Arrays#2.1 Low Array Class|2.1 Low Array Class]]
  - [[#chapter.2 : Arrays#2.2 High Array Class|2.2 High Array Class]]
  - [[#chapter.2 : Arrays#2.3 Ordered Array Class (Binary Search)|2.3 Ordered Array Class (Binary Search)]]
  - [[#chapter.2 : Arrays#2.3 Array of Objects Class|2.3 Array of Objects Class]]
- [[#chapter.3 simple sorts|chapter.3 simple sorts]]
  - [[#chapter.3 simple sorts#3.1 Bubble Sort|3.1 Bubble Sort]]
  - [[#chapter.3 simple sorts#3.2 Selection Sort|3.2 Selection Sort]]
  - [[#chapter.3 simple sorts#3.3 Insertion Sort|3.3 Insertion Sort]]
- [[#chapter.4 Stack & Queue|chapter.4 Stack & Queue]]
  - [[#chapter.4 Stack & Queue#4.1 Stack Implementation using Array|4.1 Stack Implementation using Array]]
  - [[#chapter.4 Stack & Queue#4.2 Stack Example.1 : Reversing a word using stack|4.2 Stack Example.1 : Reversing a word using stack]]
  - [[#chapter.4 Stack & Queue#4.3 Stack Example.2 : delimiter matching|4.3 Stack Example.2 : delimiter matching]]
  - [[#chapter.4 Stack & Queue#4.4 Queue Implementation using Array & nItems (fixed size)|4.4 Queue Implementation using Array & nItems (fixed size)]]
  - [[#chapter.4 Stack & Queue#4.5 Queue Implementation using Array without nItems (dynamic size)|4.5 Queue Implementation using Array without nItems (dynamic size)]]
  - [[#chapter.4 Stack & Queue#4.6 priority Queue using Array|4.6 priority Queue using Array]]
  - [[#chapter.4 Stack & Queue#4.7 Java Code to Convert Infix to Postfix|4.7 Java Code to Convert Infix to Postfix]]
- [[#chapter.5 Linked List|chapter.5 Linked List]]
  - [[#chapter.5 Linked List#5.1 simple Linked List class (with no find or delete)|5.1 simple Linked List class (with no find or delete)]]
  - [[#chapter.5 Linked List#5.2 complete Linked List class|5.2 complete Linked List class]]
  - [[#chapter.5 Linked List#5.3 Double ended Linked List|5.3 Double ended Linked List]]
  - [[#chapter.5 Linked List#5.4 Stack implemented Using Linked List|5.4 Stack implemented Using Linked List]]
  - [[#chapter.5 Linked List#5.5 Queue implemented Using Linked List|5.5 Queue implemented Using Linked List]]
  - [[#chapter.5 Linked List#5.6 Sorted Linked List|5.6 Sorted Linked List]]
  - [[#chapter.5 Linked List#5.7 sorting a linked list using the insertion sort|5.7 sorting a linked list using the insertion sort]]
  - [[#chapter.5 Linked List#5.8 Doubly Linked List|5.8 Doubly Linked List]]
  - [[#chapter.5 Linked List#5.9 Iterator Interface|5.9 Iterator Interface]]
- [[#chapter.6 Recursion|chapter.6 Recursion]]
  - [[#chapter.6 Recursion#6.1 Triangle Numbers|6.1 Triangle Numbers]]
  - [[#chapter.6 Recursion#6.2 Anagrams|6.2 Anagrams]]
  - [[#chapter.6 Recursion#6.3 Recursive Binary Search|6.3 Recursive Binary Search]]
  - [[#chapter.6 Recursion#6.4 The Tower Of hanoi|6.4 The Tower Of hanoi]]
  - [[#chapter.6 Recursion#6.5 Merge two arrays|6.5 Merge two arrays]]
  - [[#chapter.6 Recursion#6.6 merge sort|6.6 merge sort]]
  - [[#chapter.6 Recursion#6.7 Eliminating Recursion (stack based solution)|6.7 Eliminating Recursion (stack based solution)]]
  - [[#chapter.6 Recursion#6.8 complete Eliminating Recursion|6.8 complete Eliminating Recursion]]
- [[#chapter.7 Advanced Sorting|chapter.7 Advanced Sorting]]
  - [[#chapter.7 Advanced Sorting#7.1 shell sort|7.1 shell sort]]
  - [[#chapter.7 Advanced Sorting#7.2 partitioning|7.2 partitioning]]
  - [[#chapter.7 Advanced Sorting#7.3 Quick Sort Algorithm|7.3 Quick Sort Algorithm]]
  - [[#chapter.7 Advanced Sorting#|]]
  - [[#chapter.7 Advanced Sorting#7.5 Quick Sort 3 (Handling Small Partitions)|7.5 Quick Sort 3 (Handling Small Partitions)]]
  - [[#chapter.7 Advanced Sorting#7.6 Radix sort|7.6 Radix sort]]
- [[#chapter.8 Binary Tree|chapter.8 Binary Tree]]
  - [[#chapter.8 Binary Tree#8.1 tree class|8.1 tree class]]
- [[#chapter.10 2-3-4 tree|chapter.10 2-3-4 tree]]
  - [[#chapter.10 2-3-4 tree#10.1 2-3-4 tree class|10.1 2-3-4 tree class]]
  - [[#chapter.10 2-3-4 tree#chapter.11 Hash Tables|chapter.11 Hash Tables]]

## chapter.2 : Arrays

### 2.1 Low Array Class

```java
public class LowArray {

    private long[] a;                 // ref to array a
    //-------------------------------------------------------------

    public LowArray(int size) // constructor
    {
        a = new long[size];
    }        // create array
    //-------------------------------------------------------------

    public void setElem(int index, long value) // set value
    {
        a[index] = value;
    }
    //-------------------------------------------------------------

    public long getElem(int index) // get value
    {
        return a[index];
    }
    //------------------------------------------------------------
}  // end class LowArray
```

### 2.2 High Array Class

```java
public class HighArray {

    private long[] a;                 // ref to array a
    private int nElems;               // number of data items
    //----------------------------------------------------------

    public HighArray(int max) // constructor
    {
        a = new long[max];                 // create the array
        nElems = 0;                        // no items yet
    }
    //----------------------------------------------------------

    public boolean find(long searchKey) {                              // find specified value
        int j;
        for (j = 0; j < nElems; j++) // for each element,
        {
            if (a[j] == searchKey) // found item?
            {
                break;                       // exit loop before end
            }
        }
        if (j == nElems) // gone to end?
        {
            return false;                   // yes, can't find it
        } else {
            return true;                    // no, found it
        }
    }  // end find()
    //----------------------------------------------------------

    public void insert(long value) // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }
    //----------------------------------------------------------

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) // look for it
        {
            if (value == a[j]) {
                break;
            }
        }
        if (j == nElems) // can't find it
        {
            return false;
        } else // found it
        {
            for (int k = j; k < nElems; k++) // move higher ones down
            {
                a[k] = a[k + 1];
            }
            nElems--;                   // decrement size
            return true;
        }
    }  // end delete()
    //----------------------------------------------------------

    public void display() // displays array contents
    {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }
    //----------------------------------------------------------
}  // end class HighArray
 ///////////////////////////////////////////////////////////////

```

### 2.3 Ordered Array Class (Binary Search)

```java
public class OrderedArray {
    //ordered

    private long[] a;
    private int nElems;

    public OrderedArray(int size) {
        a = new long[size];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public void setElem(int index, long value) // set value
    {
        a[index] = value;
    }

    public long getElem(int index) // get value
    {
        return a[index];
    }


    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey) {
                return curIn;              // found it
            } else if (lowerBound > upperBound) {
                return nElems;             // can't find it
            } else // divide range
            {
                if (a[curIn] < searchKey) {
                    lowerBound = curIn + 1; // it's in upper half
                } else {
                    upperBound = curIn - 1; // it's in lower half
                }
            }  // end else divide range
        }  // end while
    }  // end find()

    public void insert(long value) // put element into array
    {
        int j;
        for (j = 0; j < nElems; j++) // find where it goes
        {
            if (a[j] > value) // (linear search)
            {
                break;
            }
        }

        for (int k = nElems; k > j; k--) // move bigger ones up
        {
            a[k] = a[k - 1];
        }
        a[j] = value;                  // insert it
        nElems++;                      // increment size
    }  // end insert()

    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems) // can't find it
        {
            return false;
        } else // found it
        {
            for (int k = j; k < nElems; k++) // move bigger ones down
            {
                a[k] = a[k + 1];
            }
            nElems--;                   // decrement size
            return true;
        }
    }  // end delete()

    public void display() // displays array contents
    {
        for (int j = 0; j < nElems; j++) {// for each element,

            System.out.print(a[j] + "");  // display it
            System.out.println("");
        }
    }
}
```

### 2.3 Array of Objects Class

```java
public class Person {

    private String lastName;
    private String firstName;
    private int age;
    //----------------------------------------------------------

    public Person(String last, String first, int a) {  // constructor
        lastName = last;
        firstName = first;
        age = a;
    }
    //----------------------------------------------------------

    public void displayPerson() {
        System.out.print("last Name : " + lastName);
        System.out.print("fisrt Name : " + firstName);
        System.out.print("Age : " + age);

    }
    //----------------------------------------------------------

    public String getLast() // get last name
    {
        return lastName;
    }
}  // end class Person


public class ClassDataArray {

    private Person[] a;               // reference to array
    private int nElems;               // number of data items

    public ClassDataArray(int max) // constructor
    {
        a = new Person[max];               // create the array
        nElems = 0;                        // no items yet
    }
    //-------------------------------------------------------------

    public Person find(String searchName) {                              // find specified value
        int j;
        for (j = 0; j < nElems; j++) // for each element,
        {
            if (a[j].getLast().equals(searchName)) // found item?
            {
                break;                       // exit loop before end
            }
        }
        if (j == nElems) // gone to end?
        {
            return null;                    // yes, can't find it
        } else {
            return a[j];                    // no, found it
        }
    }  // end find()
    //------------------------------------------------------------
// put person into array

    public void insert(String last, String first, int age) {
        a[nElems] = new Person(last, first, age);
        nElems++;                          // increment size
    }
    //-------------------------------------------------------------

    public boolean delete(String searchName) {                              // delete person from array
        int j;
        for (j = 0; j < nElems; j++) // look for it
        {
            if (a[j].getLast().equals(searchName)) {
                break;
            }
        }
        if (j == nElems) // can't find it
        {
            return false;
        } else // found it
        {
            for (int k = j; k < nElems; k++) // shift down
            {
                a[k] = a[k + 1];
            }
            nElems--;                       // decrement size
            return true;
        }
    }  // end delete()
    //-------------------------------------------------------------

    public void displayA() // displays array contents
    {
        for (int j = 0; j < nElems; j++) // for each element,
        {
            a[j].displayPerson();          // display it
        }
    }
    //-------------------------------------------------------------
}  // end class ClassDataArray
 ///////////////////////////////////////////////////////////////
```

## chapter.3 simple sorts

### 3.1 Bubble Sort

```java
public class BubbleSort {

    private long[] a;                 // ref to array a
    private int nElems;               // number of data items
    //-------------------------------------------------------------

    public BubbleSort(int max) // constructor
    {
        a = new long[max];                 // create the array
        nElems = 0;                        // no items yet
    }
    //-------------------------------------------------------------

    public void insert(long value) // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }
    //-------------------------------------------------------------

    public void display() // displays array contents
    {
        for (int j = 0; j < nElems; j++) // for each element,
        {
            System.out.print(a[j] + "");  // display it
        }
        System.out.println("");
    }
    //-------------------------------------------------------------

    public void bubbleSort() {
        int out, in;
        for (out = nElems - 1; out > 1; out--) // outer loop (backward)
        {
            for (in = 0; in < out; in++) // inner loop (forward)
            {
                if (a[in] > a[in + 1]) // out of order?
                {
                    swap(in, in + 1);          // swap them
                }
            }
        }
    }  // end bubbleSort()
    //-------------------------------------------------------------

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
    //-------------------------------------------------------------
}  // end class BubbleSort
 ///////////////////////////////////////////////////////////////

```

### 3.2 Selection Sort

```java
 public class SelectionSort {

    private long[] a;                 // ref to array a
    private int nElems;               // number of data items
    //-------------------------------------------------------------

    public SelectionSort(int max) // constructor
    {
        a = new long[max];                 // create the array
        nElems = 0;                        // no items yet
    }
    //-------------------------------------------------------------

    public void insert(long value) // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }
    //-------------------------------------------------------------

    public void display() // displays array contents
    {
        for (int j = 0; j < nElems; j++) // for each element,
        {
            System.out.print(a[j] + " ");

        }
        System.out.println("");
    }
    //-------------------------------------------------------------

    public void selectionSort() {
        int out, in, min;
        for (out = 0; out < nElems - 1; out++) // outer loop
        {
            min = out;                     // minimum
            for (in = out + 1; in < nElems; in++) // inner loop
            {
                if (a[in] < a[min]) // if min greater,
                {
                    min = in;               // we have a new min
                }
            }
            swap(out, min);                // swap them
        }  // end for(out)
    }  // end selectionSort()
    //-------------------------------------------------------------

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
    //-------------------------------------------------------------
}  // end class ArraySel
///////////////////////////////////////////////////////////////
```

### 3.3 Insertion Sort

```java
public class InsertionSort {

    private long[] a;                 // ref to array a
    private int nElems;               // number of data items
    //-------------------------------------------------------------

    public InsertionSort(int max) // constructor
    {
        a = new long[max];                 // create the array
        nElems = 0;                        // no items yet
    }
    //-------------------------------------------------------------

    public void insert(long value) // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }
    //-------------------------------------------------------------

        public void display() // displays array contents
    {
        for (int j = 0; j < nElems; j++) // for each element,
        {
            System.out.print(a[j] + " ");

        }
        System.out.println("");
    }

 //-------------------------------------------------------------
public void insertionSort() {
        int in, out;
        for (out = 1; out < nElems; out++) // out is dividing line
        {
            long temp = a[out];            // remove marked item
            in = out;                      // start shifts at out
            while (in > 0 && a[in - 1] >= temp) // until one is smaller,
            {
                a[in] = a[in - 1];            // shift item to right--in;                       // go left one position
                in--;
            }
            a[in] = temp;                  // insert marked item
        }  // end for
    }  // end insertionSort()

    public void insertionSortForLoop() {
        int in, out;
        for (out = 1; out < nElems; out++) { // out is dividing line
            long temp = a[out];  // Remove marked item
            for (in = out; in > 0 && a[in - 1] >= temp; in--) {
                a[in] = a[in - 1]; // Shift item to the right
            }
            a[in] = temp; // Insert marked item
        }
    }
    //-------------------------------------------------------------
}  // end class ArrayIns
 ////////////////////////////////////////////////////////////////

```

## chapter.4 Stack & Queue

### 4.1 Stack Implementation using Array

```java
public class StackX {

    private int maxSize;        // size of stack array
    private long[] stackArray;
    private int top;            // top of stack
    //-------------------------------------------------------------

    public StackX(int s) // constructor
    {
        maxSize = s;             // set array size
        stackArray = new long[maxSize];  // create array
        top = -1;                // no items yet
    }
    //-------------------------------------------------------------

    public void push(long j) // put item on top of stack
    {
        stackArray[++top] = j;     // increment top, insert item
    }
    //-------------------------------------------------------------

    public long pop() // take item from top of stack
    {
        return stackArray[top--];  // access item, decrement top
    }
    //-------------------------------------------------------------

    public long peek() // peek at top of stack
    {
        return stackArray[top];
    }
    //-------------------------------------------------------------

    public boolean isEmpty() // true if stack is empty
    {
        return (top == -1);
    }
    //-------------------------------------------------------------

    public boolean isFull() // true if stack is full
    {
        return (top == maxSize - 1);
    }
    //-------------------------------------------------------------
}  // end class Stack
 ////////////////////////////////////////////////////////////////

```

### 4.2 Stack Example.1 : Reversing a word using stack

```java
public class ReverseStringUsingStack {

    private String input;                // input string
    private String output;               // output string
    //-------------------------------------------------------------

    public ReverseStringUsingStack(String in) // constructor
    {
        input = in;
    }
    //-------------------------------------------------------------

    public String doRev() // reverse the string
    {
        int stackSize = input.length();   // get max stack size
        StackX theStack = new StackX(stackSize);  // make stack
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);     // get a char from input
            theStack.push(ch);             // push it
        }
        output = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();      // pop a char,
            output = output + ch;          // append to output
        }
        return output;
    }  // end doRev()
    //-------------------------------------------------------------
}  // end class Reverser
 ///////////////////////////////////////////////////////////////
```

### 4.3 Stack Example.2 : delimiter matching

```java
class DelimiterMatchingUsingStack {

    private String input;                   // input string
    //-------------------------------------------------------------

    public DelimiterMatchingUsingStack(String in) // constructor
    {
        input = in;
    }
    //-------------------------------------------------------------

    public void check() {
        int stackSize = input.length();      // get max stack size
        StackX theStack = new StackX(stackSize);  // make stack
        for (int j = 0; j < input.length(); j++) // get chars in turn
        {
            char ch = input.charAt(j);        // get char
            switch (ch) {
                case '{':                      // opening symbols
                case '[':

                case '(':
                    theStack.push(ch);          // push them
                    break;
                case '}':                      // closing symbols
                case ']':
                case ')':
                    if (!theStack.isEmpty()) // if stack not empty,
                    {
                        char chx = theStack.pop();  // pop and check
                        if ((ch == '}' && chx != '{')
                                || (ch == ']' && chx != '[')
                                || (ch == ')' && chx != '(')) {
                            System.out.println("Error : " + ch + "at " + j);

                        } else // prematurely empty
                        {
                            System.out.println("Error : " + ch + "at " + j);
                        }

                        break;

                    }  // end switch
            }  // end for

            // at this point, all characters have been processed
            if (!theStack.isEmpty()) {
                System.out.println("Error: missing right delimiter");

            }  // end check()
            //-------------------------------------------------------------
        }  // end class BracketChecker

        class BracketsApp {

            public static void main(String[] args) throws IOException {
                String input;
                while (true) {
                    System.out.print("Enter string containing delimiters");
                    System.out.flush();
                    input = getString();     // read a string from kbd
                    if (input.equals("")) // quit if [Enter]
                    {
                        break;
                    }
                    // make a BracketChecker
                    DelimiterMatchingUsingStack theChecker = new DelimiterMatchingUsingStack(input);
                    theChecker.check();      // check brackets
                }  // end while
            }  // end main()
            //-------------------------------------------------------------

            public static String getString() throws IOException {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                String s = br.readLine();
                return s;
            }
            //-------------------------------------------------------------
        }  // end class BracketsApp
    }
}
```

### 4.4 Queue Implementation using Array & nItems (fixed size)

```java
class Queue {

    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;
    //-------------------------------------------------------------

    public Queue(int s) // constructor
    {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    //-------------------------------------------------------------

    public void insert(long j) // put item at rear of queue
    {
        if (rear == maxSize - 1) // deal with wraparound
        {
            rear = -1;
        }
        queArray[++rear] = j;         // increment rear and insert
        nItems++;                     // one more item
    }
    //-------------------------------------------------------------

    public long remove() // take item from front of queue
    {
        long temp = queArray[front++]; // get value and incr front
        if (front == maxSize) // deal with wraparound
        {
            front = 0;
        }
        nItems--;                   // one less item
        return temp;
    }
    //-------------------------------------------------------------

    public long peekFront() // peek at front of queue
    {
        return queArray[front];
    }
    //-------------------------------------------------------------

    public boolean isEmpty() // true if queue is empty
    {
        return (nItems == 0);
    }
    //-------------------------------------------------------------

    public boolean isFull() // true if queue is full
    {
        return (nItems == maxSize);
    }
    //-------------------------------------------------------------

    public int size() // number of items in queue
    {
        return nItems;
    }
    //-------------------------------------------------------------
}  // end class Queue
 ///////////////////////////////////////////////////////////////

```

### 4.5 Queue Implementation using Array without nItems (dynamic size)

```java
class Queue {

    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    //-------------------------------------------------------------

    public Queue(int s) // constructor
    {
        maxSize = s + 1;                 // array is 1 cell larger
        queArray = new long[maxSize];  // than requested
        front = 0;
        rear = -1;
    }
    //-------------------------------------------------------------

    public void insert(long j) // put item at rear of queue
    {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = j;
    }
    //-------------------------------------------------------------

    public long remove() // take item from front of queue
    {
        long temp = queArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        return temp;
    }
    //-------------------------------------------------------------

    public long peek() // peek at front of queue
    {
        return queArray[front];
    }
    //-------------------------------------------------------------

    public boolean isEmpty() // true if queue is empty
    {
        return (rear + 1 == front || (front + maxSize - 1 == rear));
    }
    //-------------------------------------------------------------

    public boolean isFull() // true if queue is full
    {
        return (rear + 2 == front || (front + maxSize - 2 == rear));
    }
    //-------------------------------------------------------------

    public int size() // (assumes queue not empty)
    {
        if (rear >= front) // contiguous sequence
        {
            return rear - front + 1;
        } else // broken sequence
        {
            return (maxSize - front) + (rear + 1);
        }
    }
    //-------------------------------------------------------------
}  // end class Queue
```

### 4.6 priority Queue using Array

```java
class PriorityQ {
    // array in sorted order, from max at 0 to min at size-1

    private int maxSize;
    private long[] queArray;
    private int nItems;
    //------------------------------------------------------------

    public PriorityQ(int s) // constructor
    {
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }
    //------------------------------------------------------------

    public void insert(long item) // insert item
    {
        int j;
        if (nItems == 0) // if no items,
        {
            queArray[nItems++] = item;         // insert at 0
        } else // if items,
        {
            for (j = nItems - 1; j >= 0; j--) // start at end,
            {
                if (item > queArray[j]) // if new item larger,
                {
                    queArray[j + 1] = queArray[j]; // shift upward
                } else // if smaller,
                {
                    break;                     // done shifting
                }
            }  // end for
            queArray[j + 1] = item;            // insert it
            nItems++;
        }  // end else (nItems > 0)
    }  // end insert()
    //------------------------------------------------------------

    public long remove() // remove minimum item
    {
        return queArray[--nItems];
    }
    //------------------------------------------------------------

    public long peekMin() // peek at minimum item
    {
        return queArray[nItems - 1];
    }
    //------------------------------------------------------------

    public boolean isEmpty() // true if queue is empty
    {
        return (nItems == 0);
    }
    //------------------------------------------------------------

    public boolean isFull() // true if queue is full
    {
        return (nItems == maxSize);
    }
    //------------------------------------------------------------
}  // end class PriorityQ

////////////////////////////////////////////////////////////////
 class PriorityQApp {

    public static void main(String[] args) throws IOException {
        PriorityQ thePQ = new PriorityQ(5);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);
        while (!thePQ.isEmpty()) {
            long item = thePQ.remove();
            System.out.print(item + "");  // 10, 20, 30, 40, 50
        }  // end while
        System.out.println("");
    }  // end main()
    //------------------------------------------------------------
}  // end class PriorityQAp
```

### 4.7 Java Code to Convert Infix to Postfix

```java
 // infix.java
// converts infix arithmetic expressions to postfix
// to run this program: C>java InfixApp

import java.io.*;            // for I/O

////////////////////////////////////////////////////////////////
 class StackX {

    private int maxSize;
    private char[] stackArray;
    private int top;
    //-------------------------------------------------------------

    public StackX(int s) // constructor
    {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }
    //-------------------------------------------------------------

    public void push(char j) // put item on top of stack
    {
        stackArray[++top] = j;
    }
    //-------------------------------------------------------------

    public char pop() // take item from top of stack
    {
        return stackArray[top--];
    }
    //-------------------------------------------------------------

    public char peek() // peek at top of stack
    {
        return stackArray[top];
    }
    //-------------------------------------------------------------

    public boolean isEmpty() // true if stack is empty
    {
        return (top == -1);
    }
    //------------------------------------------------------------

    public int size() // return size
    {
        return top + 1;
    }
    //-------------------------------------------------------------

    public char peekN(int n) // return item at index n
    {
        return stackArray[n];
    }
    //-------------------------------------------------------------

    public void displayStack(String s) {
        System.out.print(s);
        System.out.print("Stack (bottom-->top): ");
        for (int j = 0; j < size(); j++) {
            System.out.print(peekN(j));
            System.out.print(' ');
        }
        System.out.println("");
    }
    //-------------------------------------------------------------
}  // end class StackX

////////////////////////////////////////////////////////////////
 class InToPost // infix to postfix conversion
{

    private StackX theStack;
    private String input;
    private String output = "";
    //-------------------------------------------------------------

    public InToPost(String in) // constructor
    {
        input = in;
        int stackSize = input.length();
        theStack = new StackX(stackSize);
    }
    //------------------------------------------------------------

    public String doTrans() // do translation to postfix
    {
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            theStack.displayStack("For " + ch + " "); // *diagnostic*
            switch (ch) {
                case '+':               // it's + or
                case '-':
                    gotOper(ch, 1);      // go pop operators
                    break;               //   (precedence 1)
                case '*':               // it's * or /
                case '/':
                    gotOper(ch, 2);      // go pop operators
                    break;               //   (precedence 2)
                case '(':               // it's a left paren
                    theStack.push(ch);   // push it
                    break;
                case ')':               // it's a right paren
                    gotParen(ch);        // go pop operators
                    break;
                default:                // must be an operand
                    output = output + ch; // write it to output
                    break;
            }  // end switch
        }  // end for
        while (!theStack.isEmpty()) // pop remaining opers
        {
            theStack.displayStack("While ");  // *diagnostic*
            output = output + theStack.pop(); // write to output
        }
        theStack.displayStack("End   ");     // *diagnostic*
        return output;                   // return postfix
    }  // end doTrans()
    //-------------------------------------------------------------

    public void gotOper(char opThis, int prec1) {                                // got operator from input
        while (!theStack.isEmpty()) {
            char opTop = theStack.pop();
            if (opTop == '(') // if it's a '('
            {
                theStack.push(opTop);      // restore '('
                break;
            } else // it's an operator
            {
                int prec2;                 // precedence of new op
                if (opTop == '+' || opTop == '-') // find new op prec
                {
                    prec2 = 1;
                } else {
                    prec2 = 2;
                }
                if (prec2 < prec1) // if prec of new op less
                {                       //    than prec of old
                    theStack.push(opTop);   // save newly-popped op
                    break;
                } else // prec of new not less
                {
                    output = output + opTop;  // than prec of old
                }
            }  // end else (it's an operator)
        }  // end while
        theStack.push(opThis);        // push new operator
    }  // end gotOp()
    //-------------------------------------------------------------

    public void gotParen(char ch) {                             // got right paren from input
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            if (chx == '(') // if popped '('
            {
                break;                  // we're done
            } else // if popped operator
            {
                output = output + chx;  // output it
            }
        }  // end while
    }  // end popOps()
    //-------------------------------------------------------------
}  // end class InToPost

////////////////////////////////////////////////////////////////
 class InfixApp {

    public static void main(String[] args) throws IOException {
        String input, output;
        while (true) {
            System.out.print("Enter infix: ");
            System.out.flush();
            input = getString();         // read a string from kbd
            if (input.equals("")) // quit if [Enter]
            {
                break;
            }
            // make a translator
            InToPost theTrans = new InToPost(input);
            output = theTrans.doTrans(); // do the translation
            System.out.println("Postfix is " + output + '\n');
        }  // end while
    }  // end main()
    //-------------------------------------------------------------

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    //-------------------------------------------------------------
}  // end class InfixApp
 ////////////////////////////////////////////////////////////////

```

## chapter.5 Linked List

### 5.1 simple Linked List class (with no find or delete)

```java
// linkList.java
// demonstrates linked list
// to run this program: C>java LinkListApp
////////////////////////////////////////////////////////////////
class Link {
  public int iData; // data item (key)
  public double dData; // data item
  public Link next; // next link in list
  // -----------------------------------------------------------

  public Link(int id, double dd) // constructor
  {
    iData = id; // initialize data
    dData = dd; // ('next' is automatically
  } // set to null)
  // ------------------------------------------------------------

  public void displayLink() // display ourself
  {
    System.out.print("{" + iData + ", " + dData + "} ");
  }
} // end class Link

////////////////////////////////////////////////////////////////
class LinkList {
  private Link first; // ref to first link on list
  // ------------------------------------------------------------

  public LinkList() // constructor
  {
    first = null; // no items on list yet
  }

  // ------------------------------------------------------------
  public boolean isEmpty() // true if list is empty
  {
    return (first == null);
  }

  // ------------------------------------------------------------
  // insert at start of list
  public void insertFirst(int id, double dd) { // make new link
    Link newLink = new Link(id, dd);
    newLink.next = first; // newLink --> old first
    first = newLink; // first --> newLink
  }

  // ------------------------------------------------------------
  public Link deleteFirst() // delete first item
  { // (assumes list not empty)
    Link temp = first; // save reference to link
    first = first.next; // delete it: first-->old next
    return temp; // return deleted link
  }

  // ------------------------------------------------------------
  public void displayList() {
    System.out.print("List (first-->last): ");
    Link current = first; // start at beginning of list
    while (current != null) // until end of list,
    {
      current.displayLink(); // print data
      current = current.next; // move to next link
    }
    System.out.println("");
  }
  // ------------------------------------------------------------
} // end class LinkList

////////////////////////////////////////////////////////////////
class LinkListApp {
  public static void main(String[] args) {
    LinkList theList = new LinkList(); // make new list
    theList.insertFirst(22, 2.99); // insert four items
    theList.insertFirst(44, 4.99);
    theList.insertFirst(66, 6.99);
    theList.insertFirst(88, 8.99);
    theList.displayList(); // display list
    while (!theList.isEmpty()) // until it's empty,
    {
      Link aLink = theList.deleteFirst(); // delete link
      System.out.print("Deleted "); // display it
      aLink.displayLink();
      System.out.println("");
    }
    theList.displayList(); // display list
  } // end main()
} // end class LinkListApp
////////////////////////////////////////////////////////////////
```

### 5.2 complete Linked List class

```java
class Link {
  public int iData; // data item (key)
  public double dData; // data item
  public Link next; // next link in list
  // ------------------------------------------------------------

  public Link(int id, double dd) // constructor
  {
    iData = id;
    dData = dd;
  }

  // ------------------------------------------------------------
  public void displayLink() // display ourself
  {
    System.out.print("{" + iData + ", " + dData + "} ");
  }
} // end class Link

////////////////////////////////////////////////////////////////
class LinkList {
  private Link first; // ref to first link on list
  // ------------------------------------------------------------

  public LinkList() // constructor
  {
    first = null; // no links on list yet
  }

  // ------------------------------------------------------------
  public void insertFirst(int id, double dd) { // make new link
    Link newLink = new Link(id, dd);
    newLink.next = first; // it points to old first link
    first = newLink; // now first points to this
  }

  // ------------------------------------------------------------
  public Link find(int key) // find link with given key
  { // (assumes non-empty list)
    Link current = first; // start at 'first'
    while (current.iData != key) // while no match,
    {
      if (current.next == null) // if end of list,
        return null; // didn't find it
      else // not end of list,
        current = current.next; // go to next link
    }
    return current; // found it
  }

  // ------------------------------------------------------------
  public Link delete(int key) // delete link with given key
  { // (assumes non-empty list)
    Link current = first; // search for link
    Link previous = first;
    while (current.iData != key) {
      if (current.next == null)
        return null; // didn't find it
      else {
        previous = current; // go to next link
        current = current.next;
      }
    } // found it

    if (current == first) // if first link,
      first = first.next; // change first
    else // otherwise,
      previous.next = current.next; // bypass it
    return current;
  }

  // ------------------------------------------------------------
  public void displayList() // display the list
  {
    System.out.print("List (first-->last): ");
    Link current = first; // start at beginning of list
    while (current != null) // until end of list,
    {
      current.displayLink(); // print data
      current = current.next; // move to next link
    }
    System.out.println("");
  }
  // ------------------------------------------------------------
} // end class LinkList

////////////////////////////////////////////////////////////////
class LinkList2App {
  public static void main(String[] args) {
    LinkList theList = new LinkList(); // make list
    theList.insertFirst(22, 2.99); // insert 4 items
    theList.insertFirst(44, 4.99);
    theList.insertFirst(66, 6.99);
    theList.insertFirst(88, 8.99);
    theList.displayList(); // display list
    Link f = theList.find(44); // find item
    if (f != null)
      System.out.println("Found link with key " + f.iData);
    else

      System.out.println("Can't find link");
    Link d = theList.delete(66); // delete item
    if (d != null)
      System.out.println("Deleted link with key " + d.iData);
    else
      System.out.println("Can't delete link");
    theList.displayList(); // display list
  } // end main()
} // end class LinkList2App
////////////////////////////////////////////////////////////////
```

### 5.3 Double ended Linked List

```java
// firstLastList.java
// demonstrates list with first and last references
// to run this program: C>java FirstLastApp
////////////////////////////////////////////////////////////////
class Link {
  public long dData; // data item
  public Link next; // next link in list
  // ------------------------------------------------------------

  public Link(long d) // constructor
  {
    dData = d;
  }

  // ------------------------------------------------------------
  public void displayLink() // display this link
  {
    System.out.print(dData + " ");
  }
  // ------------------------------------------------------------
} // end class Link

////////////////////////////////////////////////////////////////
class FirstLastList {
  private Link first; // ref to first link
  private Link last; // ref to last link
  // ------------------------------------------------------------

  public FirstLastList() // constructor
  {
    first = null; // no links on list yet
    last = null;
  }

  // ------------------------------------------------------------
  public boolean isEmpty() // true if no links
  {
    return first == null;
  }

  // ------------------------------------------------------------
  public void insertFirst(long dd) // insert at front of list
  {
    Link newLink = new Link(dd); // make new link
    if (isEmpty()) // if empty list,
      last = newLink; // newLink <-- last
    newLink.next = first; // newLink --> old first
    first = newLink; // first --> newLink
  }

  // ------------------------------------------------------------
  public void insertLast(long dd) // insert at end of list
  {
    Link newLink = new Link(dd); // make new link
    if (isEmpty()) // if empty list,
      first = newLink; // first --> newLink
    else
      last.next = newLink; // old last --> newLink
    last = newLink; // newLink <-- last
  }

  // ------------------------------------------------------------
  public long deleteFirst() // delete first link
  { // (assumes non-empty list)
    long temp = first.dData;
    if (first.next == null) // if only one item
      last = null; // null <-- last
    first = first.next; // first --> old next
    return temp;
  }

  // ------------------------------------------------------------
  public void displayList() {
    System.out.print("List (first-->last): ");
    Link current = first; // start at beginning
    while (current != null) // until end of list,
    {
      current.displayLink(); // print data
      current = current.next; // move to next link
    }
    System.out.println("");
  }
  // ------------------------------------------------------------
} // end class FirstLastList

////////////////////////////////////////////////////////////////
class FirstLastApp {
  public static void main(String[] args) { // make a new list
    FirstLastList theList = new FirstLastList();
    theList.insertFirst(22); // insert at front
    theList.insertFirst(44);
    theList.insertFirst(66);
    theList.insertLast(11); // insert at rear
    theList.insertLast(33);
    theList.insertLast(55);
    theList.displayList(); // display the list
    theList.deleteFirst(); // delete first two items
    theList.deleteFirst();
    theList.displayList(); // display again
  } // end main()
} // end class FirstLastApp

```

### 5.4 Stack implemented Using Linked List

```java
////////////////////////////////////////////////////////////////
class Link {
  public long dData; // data item
  public Link next; // next link in list
  // ------------------------------------------------------------

  public Link(long dd) // constructor
  {
    dData = dd;
  }

  // ------------------------------------------------------------
  public void displayLink() // display ourself
  {
    System.out.print(dData + " ");
  }
} // end class Link

////////////////////////////////////////////////////////////////
class LinkList {
  private Link first; // ref to first item on list
  // ------------------------------------------------------------

  public LinkList() // constructor
  {
    first = null;
  } // no items on list yet
  // ------------------------------------------------------------

  public boolean isEmpty() // true if list is empty
  {
    return (first == null);
  }

  // ------------------------------------------------------------
  public void insertFirst(long dd) // insert at start of list
  { // make new link
    Link newLink = new Link(dd);
    newLink.next = first; // newLink --> old first
    first = newLink; // first --> newLink
  }

  // ------------------------------------------------------------
  public long deleteFirst() // delete first item
  { // (assumes list not empty)
    Link temp = first; // save reference to link
    first = first.next; // delete it: first-->old next
    return temp.dData; // return deleted link
  }

  // ------------------------------------------------------------
  public void displayList() {
    Link current = first; // start at beginning of list
    while (current != null) // until end of list,
    {
      current.displayLink(); // print data
      current = current.next; // move to next link
    }
    System.out.println("");
  }
  // ------------------------------------------------------------
} // end class LinkList

////////////////////////////////////////////////////////////////
class LinkStack {
  private LinkList theList;

  // -------------------------------------------------------------
  public LinkStack() // constructor
  {
    theList = new LinkList();
  }

  // -------------------------------------------------------------
  public void push(long j) // put item on top of stack
  {
    theList.insertFirst(j);
  }

  // -------------------------------------------------------------
  public long pop() // take item from top of stack
  {
    return theList.deleteFirst();
  }

  // -------------------------------------------------------------
  public boolean isEmpty() // true if stack is empty
  {
    return (theList.isEmpty());
  }

  // -------------------------------------------------------------
  public void displayStack() {
    System.out.print("Stack (top-->bottom): ");
    theList.displayList();
  }
  // -------------------------------------------------------------
} // end class LinkStack

////////////////////////////////////////////////////////////////
class LinkStackApp {
  public static void main(String[] args) {
    LinkStack theStack = new LinkStack(); // make stack
    theStack.push(20); // push items
    theStack.push(40);
    theStack.displayStack(); // display stack
    theStack.push(60); // push items
    theStack.push(80);
    theStack.displayStack(); // display stack
    theStack.pop(); // pop items
    theStack.pop();
    theStack.displayStack(); // display stack
  } // end main()
} // end class LinkStackApp

```

### 5.5 Queue implemented Using Linked List

```java
class Link {
  public long dData; // data item
  public Link next; // next link in list
  // ------------------------------------------------------------

  public Link(long d) // constructor
  {
    dData = d;
  }

  // ------------------------------------------------------------
  public void displayLink() // display this link
  {
    System.out.print(dData + " ");
  }
  // ------------------------------------------------------------
} // end class Link

////////////////////////////////////////////////////////////////
class FirstLastList {
  private Link first; // ref to first item
  private Link last; // ref to last item
  // ------------------------------------------------------------

  public FirstLastList() // constructor
  {
    first = null; // no items on list yet
    last = null;
  }

  // ------------------------------------------------------------
  public boolean isEmpty() // true if no links
  {
    return first == null;
  }

  // ------------------------------------------------------------
  public void insertLast(long dd) // insert at end of list
  {
    Link newLink = new Link(dd); // make new link
    if (isEmpty()) // if empty list,
      first = newLink; // first --> newLink
    else
      last.next = newLink; // old last --> newLink
    last = newLink; // newLink <-- last
  }

  // -----------------------------------------------------------
  public long deleteFirst() // delete first link
  { // (assumes non-empty list)
    long temp = first.dData;
    if (first.next == null) // if only one item
      last = null; // null <-- last
    first = first.next; // first --> old next
    return temp;
  }

  // ------------------------------------------------------------
  public void displayList() {
    Link current = first; // start at beginning
    while (current != null) // until end of list,
    {
      current.displayLink(); // print data
      current = current.next; // move to next link
    }
    System.out.println("");
  }
  // ------------------------------------------------------------
} // end class FirstLastList

////////////////////////////////////////////////////////////////
class LinkQueue {
  private FirstLastList theList;

  // -------------------------------------------------------------
  public LinkQueue() // constructor
  {
    theList = new FirstLastList();
  } // make a 2-ended list
  // -------------------------------------------------------------

  public boolean isEmpty() // true if queue is empty
  {
    return theList.isEmpty();
  }

  // -------------------------------------------------------------
  public void insert(long j) // insert, rear of queue
  {
    theList.insertLast(j);
  }

  // -------------------------------------------------------------
  public long remove() // remove, front of queue
  {
    return theList.deleteFirst();
  }

  // -------------------------------------------------------------
  public void displayQueue() {
    System.out.print("Queue (front-->rear): ");
    theList.displayList();
  }
  // -------------------------------------------------------------
} // end class LinkQueue

////////////////////////////////////////////////////////////////
class LinkQueueApp {
  public static void main(String[] args) {
    LinkQueue theQueue = new LinkQueue();
    theQueue.insert(20); // insert items
    theQueue.insert(40);
    theQueue.displayQueue(); // display queue
    theQueue.insert(60); // insert items
    theQueue.insert(80);
    theQueue.displayQueue(); // display queue
    theQueue.remove(); // remove items
    theQueue.remove();
    theQueue.displayQueue(); // display queue
  }
}
// end main()

```

### 5.6 Sorted Linked List

```java
// sortedList.java
// demonstrates sorted list
// to run this program: C>java SortedListApp
////////////////////////////////////////////////////////////////
class Link {
  public long dData; // data item
  public Link next; // next link in list
  // ------------------------------------------------------------

  public Link(long dd) // constructor
  {
    dData = dd;
  }

  // ------------------------------------------------------------
  public void displayLink() // display this link
  {
    System.out.print(dData + " ");
  }
} // end class Link

////////////////////////////////////////////////////////////////
class SortedList {
  private Link first; // ref to first item on list
  // ------------------------------------------------------------

  public SortedList() // constructor
  {
    first = null;
  }

  // ------------------------------------------------------------
  public boolean isEmpty() // true if no links
  {
    return (first == null);
  }

  // ------------------------------------------------------------
  public void insert(long key) // insert, in order
  {
    Link newLink = new Link(key); // make new link
    Link previous = null; // start at first
    Link current = first;
    // until end of list,
    while (current != null && key > current.dData) { // or key > current,
      previous = current;
      current = current.next; // go to next item
    }
    if (previous == null) // at beginning of list
      first = newLink; // first --> newLink
    else // not at beginning
      previous.next = newLink; // old prev --> newLink
    newLink.next = current; // newLink --> old current
  } // end insert()
  // ------------------------------------------------------------

  public Link remove() // return & delete first link
  { // (assumes non-empty list)
    Link temp = first; // save first
    first = first.next; // delete first
    return temp; // return value
  }

  // ------------------------------------------------------------
  public void displayList() {
    System.out.print("List (first-->last): ");
    Link current = first; // start at beginning of list
    while (current != null) // until end of list,
    {
      current.displayLink(); // print data
      current = current.next; // move to next link
    }
    System.out.println("");
  }
} // end class SortedList

////////////////////////////////////////////////////////////////
class SortedListApp {
  public static void main(String[] args) { // create new list
    SortedList theSortedList = new SortedList();
    theSortedList.insert(20); // insert 2 items
    theSortedList.insert(40);
    theSortedList.displayList(); // display list
    theSortedList.insert(10); // insert 3 more items
    theSortedList.insert(30);
    theSortedList.insert(50);
    theSortedList.displayList(); // display list
    theSortedList.remove(); // remove an item
    theSortedList.displayList(); // display list
  } // end main()
} // end class SortedListApp
```

### 5.7 sorting a linked list using the insertion sort

```java
// listInsertionSort.java
// demonstrates sorted list used for sorting
// to run this program: C>java ListInsertionSortApp
////////////////////////////////////////////////////////////////
class Link {
  public long dData; // data item
  public Link next; // next link in list
  // ------------------------------------------------------------

  public Link(long dd) // constructor
  {
    dData = dd;
  }
  // -----------------------------------------------------------
} // end class Link

////////////////////////////////////////////////////////////////
class SortedList {
  private Link first; // ref to first item on list
  // ------------------------------------------------------------

  public SortedList() // constructor (no args)
  {
    first = null;
  } // initialize list
  // ------------------------------------------------------------

  public SortedList(Link[] linkArr) // constructor (array
  { // as argument)
    first = null; // initialize list
    for (int j = 0; j < linkArr.length; j++) // copy array
      insert(linkArr[j]); // to list
  }

  // ------------------------------------------------------------
  public void insert(Link k) // insert (in order)
  {
    Link previous = null; // start at first
    Link current = first;
    // until end of list,
    while (current != null && k.dData > current.dData) { // or key > current,
      previous = current;
      current = current.next; // go to next item
    }
    if (previous == null) // at beginning of list
      first = k; // first --> k
    else // not at beginning
      previous.next = k; // old prev --> k
    k.next = current; // k --> old current
  } // end insert()
  // ------------------------------------------------------------

  public Link remove() // return & delete first link
  { // (assumes non-empty list)
    Link temp = first; // save first
    first = first.next; // delete first
    return temp; // return value
  }
  // ------------------------------------------------------------
} // end class SortedList

////////////////////////////////////////////////////////////////
class ListInsertionSortApp {
  public static void main(String[] args) {
    int size = 10;
    // create array of links
    Link[] linkArray = new Link[size];
    for (int j = 0; j < size; j++) // fill array with links
    { // random number
      int n = (int) (java.lang.Math.random() * 99);
      Link newLink = new Link(n); // make link
      linkArray[j] = newLink; // put in array
    }
    // display array contents
    System.out.print("Unsorted array: ");
    for (int j = 0; j < size; j++)
      System.out.print(linkArray[j].dData + " ");
    System.out.println("");
    // create new list
    // initialized with array
    SortedList theSortedList = new SortedList(linkArray);
    for (int j = 0; j < size; j++) // links from list to array
      linkArray[j] = theSortedList.remove();
    // display array contents
    System.out.print("Sorted Array:   ");
    for (int j = 0; j < size; j++)
      System.out.print(linkArray[j].dData + " ");
    System.out.println("");
  } // end main()
} // end class ListInsertionSortApp

```

### 5.8 Doubly Linked List

```java
// doublyLinked.java
// demonstrates doubly-linked list
// to run this program: C>java DoublyLinkedApp
////////////////////////////////////////////////////////////////
class Link {
  public long dData; // data item
  public Link next; // next link in list
  public Link previous; // previous link in list
  // ------------------------------------------------------------

  public Link(long d) // constructor
  {
    dData = d;
  }

  // ------------------------------------------------------------
  public void displayLink() // display this link
  {
    System.out.print(dData + " ");
  }
  // ------------------------------------------------------------
} // end class Link

////////////////////////////////////////////////////////////////
class DoublyLinkedList {
  private Link first; // ref to first item
  private Link last; // ref to last item
  // ------------------------------------------------------------

  public DoublyLinkedList() // constructor
  {
    first = null; // no items on list yet
    last = null;
  }

  // ------------------------------------------------------------
  public boolean isEmpty() // true if no links
  {
    return first == null;
  }

  // ------------------------------------------------------------
  public void insertFirst(long dd) // insert at front of list
  {
    Link newLink = new Link(dd); // make new link
    if (isEmpty()) // if empty list,
      last = newLink; // newLink <-- last
    else
      first.previous = newLink; // newLink <-- old first
    newLink.next = first; // newLink --> old first
    first = newLink; // first --> newLink
  }

  // ------------------------------------------------------------
  public void insertLast(long dd) // insert at end of list
  {
    Link newLink = new Link(dd); // make new link
    if (isEmpty()) // if empty list,
      first = newLink; // first --> newLink
    else {
      last.next = newLink; // old last --> newLink
      newLink.previous = last; // old last <-- newLink
    }
    last = newLink; // newLink <-- last
  }

  // ------------------------------------------------------------
  public Link deleteFirst() // delete first link
  { // (assumes non-empty list)
    Link temp = first;
    if (first.next == null) // if only one item
      last = null; // null <-- last
    else
      first.next.previous = null; // null <-- old next
    first = first.next; // first --> old next
    return temp;
  }

  // ------------------------------------------------------------
  public Link deleteLast() // delete last link
  { // (assumes non-empty list)
    Link temp = last;
    if (first.next == null) // if only one item
      first = null; // first --> null
    else
      last.previous.next = null; // old previous --> null
    last = last.previous; // old previous <-- last
    return temp;
  }

  // ------------------------------------------------------------
  // insert dd just after key
  public boolean insertAfter(long key, long dd) { // (assumes non-empty list)
    Link current = first; // start at beginning
    while (current.dData != key) // until match is found,
    {
      current = current.next; // move to next link
      if (current == null)
        return false; // didn't find it
    }
    Link newLink = new Link(dd); // make new link
    if (current == last) // if last link,
    {
      newLink.next = null; // newLink --> null
      last = newLink; // newLink <-- last
    } else // not last link,
    {
      newLink.next = current.next; // newLink --> old next
      // newLink <-- old next
      current.next.previous = newLink;
    }
    newLink.previous = current; // old current <-- newLink
    current.next = newLink; // old current --> newLink
    return true; // found it, did insertion
  }

  // ------------------------------------------------------------
  public Link deleteKey(long key) // delete item w/ given key
  { // (assumes non-empty list)
    Link current = first; // start at beginning
    while (current.dData != key) // until match is found,
    {
      current = current.next; // move to next link
      if (current == null)
        return null; // didn't find it
    }
    if (current == first) // found it; first item?
      first = current.next; // first --> old next
    else // not first
      // old previous --> old next
      current.previous.next = current.next;
    if (current == last) // last item?
      last = current.previous; // old previous <-- last
    else // not last
      // old previous <-- old next
      current.next.previous = current.previous;
    return current; // return value
  }

  // ------------------------------------------------------------
  public void displayForward() {
    System.out.print("List (first-->last): ");
    Link current = first; // start at beginning
    while (current != null) // until end of list,
    {
      current.displayLink(); // display data
      current = current.next; // move to next link
    }
    System.out.println("");
  }

  // ------------------------------------------------------------
  public void displayBackward() {
    System.out.print("List (last-->first): ");
    Link current = last; // start at end
    while (current != null) // until start of list,
    {
      current.displayLink(); // display data
      current = current.previous; // move to previous link
    }
    System.out.println("");
  }
  // ------------------------------------------------------------
} // end class DoublyLinkedList

////////////////////////////////////////////////////////////////
class DoublyLinkedApp {
  public static void main(String[] args) { // make a new list
    DoublyLinkedList theList = new DoublyLinkedList();
    theList.insertFirst(22); // insert at front
    theList.insertFirst(44);
    theList.insertFirst(66);
    theList.insertLast(11); // insert at rear
    theList.insertLast(33);
    theList.insertLast(55);
    theList.displayForward(); // display list forward
    theList.displayBackward(); // display list backward
    theList.deleteFirst(); // delete first item
    theList.deleteLast(); // delete last item
    theList.deleteKey(11); // delete item with key 11
    theList.displayForward(); // display list forward
    theList.insertAfter(22, 77); // insert 77 after 22
    theList.insertAfter(33, 88); // insert 88 after 33
    theList.displayForward(); // display list forward
  } // end main()
} // end class DoublyLinkedApp
```

### 5.9 Iterator Interface

```java
class Link {
  public long dData; // data item
  public Link next; // next link in list
  // ------------------------------------------------------------

  public Link(long dd) // constructor
  {
    dData = dd;
  }

  // ------------------------------------------------------------
  public void displayLink() // display ourself
  {
    System.out.print(dData + " ");
  }
} // end class Link

////////////////////////////////////////////////////////////////
class LinkList {
  private Link first; // ref to first item on list
  // ------------------------------------------------------------

  public LinkList() // constructor
  {
    first = null;
  } // no items on list yet
  // ------------------------------------------------------------

  public Link getFirst() // get value of first
  {
    return first;
  }

  // ------------------------------------------------------------
  public void setFirst(Link f) // set first to new link
  {
    first = f;
  }

  // ------------------------------------------------------------
  public boolean isEmpty() // true if list is empty
  {
    return first == null;
  }

  // ------------------------------------------------------------
  public ListIterator getIterator() // return iterator
  {
    return new ListIterator(this); // initialized with
  } // this list
  // ------------------------------------------------------------

  public void displayList() {
    Link current = first; // start at beginning of list
    while (current != null) // until end of list,
    {
      current.displayLink(); // print data
      current = current.next; // move to next link
    }
    System.out.println("");
  }
  // ------------------------------------------------------------
} // end class LinkList

////////////////////////////////////////////////////////////////
class ListIterator {
  private Link current; // current link
  private Link previous; // previous link
  private LinkList ourList; // our linked list
  // -------------------------------------------------------------

  public ListIterator(LinkList list) // constructor
  {
    ourList = list;
    reset();
  }

  // -------------------------------------------------------------
  public void reset() // start at 'first'
  {
    current = ourList.getFirst();
    previous = null;
  }

  // -------------------------------------------------------------
  public boolean atEnd() // true if last link
  {
    return (current.next == null);
  }

  // -------------------------------------------------------------
  public void nextLink() // go to next link
  {
    previous = current;
    current = current.next;
  }

  // -------------------------------------------------------------
  public Link getCurrent() // get current link
  {
    return current;
  }

  // -------------------------------------------------------------
  public void insertAfter(long dd) // insert after
  { // current link
    Link newLink = new Link(dd);
    if (ourList.isEmpty()) // empty list
    {
      ourList.setFirst(newLink);
      current = newLink;
    } else // not empty
    {
      newLink.next = current.next;
      current.next = newLink;
      nextLink(); // point to new link
    }
  }

  // -------------------------------------------------------------
  public void insertBefore(long dd) // insert before
  { // current link
    Link newLink = new Link(dd);
    if (previous == null) // beginning of list
    { // (or empty list)
      newLink.next = ourList.getFirst();
      ourList.setFirst(newLink);
      reset();
    } else // not beginning
    {
      newLink.next = previous.next;
      previous.next = newLink;
      current = newLink;
    }
  }

  // -------------------------------------------------------------
  public long deleteCurrent() // delete item at current
  {
    long value = current.dData;
    if (previous == null) // beginning of list
    {
      ourList.setFirst(current.next);
      reset();
    } else // not beginning
    {
      previous.next = current.next;
      if (atEnd())
        reset();
      else
        current = current.next;
    }
    return value;
  }
  // -------------------------------------------------------------
} // end class ListIterator

////////////////////////////////////////////////////////////////


class InterIterApp {
  public static void main(String[] args) throws IOException {
    LinkList theList = new LinkList(); // new list
    ListIterator iter1 = theList.getIterator(); // new iter
    long value;
    iter1.insertAfter(20); // insert items
    iter1.insertAfter(40);
    iter1.insertAfter(80);
    iter1.insertBefore(60);
    while (true) {
      System.out.print("Enter first letter of show, reset, ");
      System.out.print("next, get, before, after, delete: ");
      System.out.flush();
      int choice = getChar(); // get user's option
      switch (choice) {
        case 's': // show list
          if (!theList.isEmpty())
            theList.displayList();
          else
            System.out.println("List is empty");
          break;
        case 'r': // reset (to first)
          iter1.reset();
          break;
        case 'n': // advance to next item
          if (!theList.isEmpty() && !iter1.atEnd())
            iter1.nextLink();
          else
            System.out.println("Can't go to next link");
          break;
        case 'g': // get current item
          if (!theList.isEmpty()) {
            value = iter1.getCurrent().dData;
            System.out.println("Returned " + value);
          } else
            System.out.println("List is empty");
          break;
        case 'b': // insert before current
          System.out.print("Enter value to insert: ");
          System.out.flush();
          value = getInt();
          iter1.insertBefore(value);
          break;
        case 'a': // insert after current
          System.out.print("Enter value to insert: ");
          System.out.flush();
          value = getInt();
          iter1.insertAfter(value);
          break;
        case 'd': // delete current item
          if (!theList.isEmpty()) {
            value = iter1.deleteCurrent();
            System.out.println("Deleted " + value);
          } else
            System.out.println("Can't delete");
          break;
        default:
          System.out.println("Invalid entry");
      } // end switch
    } // end while
  } // end main()
    // -------------------------------------------------------------

  public static String getString() throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    return s;
  }

  // ------------------------------------------------------------
  public static char getChar() throws IOException {
    String s = getString();
    return s.charAt(0);
  }

  // ------------------------------------------------------------
  public static int getInt() throws IOException {
    String s = getString();
    return Integer.parseInt(s);
  }
  // ------------------------------------------------------------
} // end class InterIterApp
```

## chapter.6 Recursion

### 6.1 Triangle Numbers

```java
class TriangleApp {

    public static int triangle(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n + triangle(n - 1));
        }
    }
//-------------------------------------------------------------
    static int theNumber;

    public static void main(String[] args) throws IOException {
        System.out.print(
                "Enter a number: ");
        theNumber = getInt();
        int theAnswer = triangle(theNumber);
        System.out.println(
                "Triangle =" + theAnswer
        );
    } // end main()
}
```

### 6.2 Anagrams

```java
class AnagramApp {

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a word: "); // get word
        String input = getString();
        size = input.length(); // find its size
        count = 0;
        for (int j = 0; j < size; j++) // put it in array
        {
            arrChar[j] = input.charAt(j);
        }
        doAnagram(size); // anagram it
    } // end main()
//-----------------------------------------------------------

    public static void doAnagram(int newSize) {
        if (newSize == 1) // if too small,
        {
            return; // go no further
        }
        for (int j = 0; j < newSize; j++) // for each position,
        {
            doAnagram(newSize - 1); // anagram remaining
            if (newSize == 2) // if innermost,
            {
                displayWord(); // display it
            }
            rotate(newSize); // rotate word
        }
    }
//-----------------------------------------------------------

    public static void rotate(int newSize) {
        int j;
        int position = size - newSize;
        char temp = arrChar[position]; // save first letter
        for (j = position + 1; j < size; j++) // shift others left
        {
            arrChar[j - 1] = arrChar[j];
        }
        arrChar[j - 1] = temp; // put first on right
    }
//-----------------------------------------------------------

    public static void displayWord() {
        if (count < 99) {
            System.out.print(" ");
        }
        if (count < 9) {
            System.out.print(" ");
        }
        System.out.print(++count + " ");
        for (int j = 0; j < size; j++) {
            System.out.print(arrChar[j]);
        }
        System.out.print(" ");
        System.out.flush();
        if (count % 6 == 0) {
            System.out.println("");
        }
    }
}

```

### 6.3 Recursive Binary Search

```java
private int recFind(long searchKey, int lowerBound,
        int upperBound) {
    int curIn;
    curIn = (lowerBound + upperBound) / 2;
    if (a[curIn] == searchKey) {
        return curIn; // found it
    } else if (lowerBound > upperBound) {
        return nElems; // can't find it
    } else // divide range
    {
        if (a[curIn] < searchKey) // it's in upper half
        {
            return recFind(searchKey, curIn + 1, upperBound);
        } else // it's in lower half
        {
            return recFind(searchKey, lowerBound, curIn - 1);
        }
    } // end else divide range
} // end recFind()
```

### 6.4 The Tower Of hanoi

```java
 // towers.java
// solves the towers of Hanoi puzzle
// to run this program: C>java TowersApp

////////////////////////////////////////////////////////////////
 class TowersApp {

    static int nDisks = 3;

    public static void main(String[] args) {
        doTowers(nDisks, 'A', 'B', 'C');
    }
    //----------------------------------------------------------

    public static void doTowers(int topN,
            char from, char inter, char to) {
        if (topN == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
        } else {
            doTowers(topN - 1, from, to, inter);  // from-->inter
            System.out.println("Disk " + topN
                    + " from " + from + " to " + to);
            doTowers(topN - 1, inter, from, to);  // inter-->to
        }
    }
    //---------------------------------------------------------
}  // end class TowersApp
 ///////////////////////////////////////////////////////////////

```

### 6.5 Merge two arrays

```java
 // merge.java
// demonstrates merging two arrays into a third
// to run this program: C>java MergeApp

////////////////////////////////////////////////////////////////
 class MergeApp {

    public static void main(String[] args) {
        int[] arrayA = {23, 47, 81, 95};
        int[] arrayB = {7, 14, 39, 55, 62, 74};
        int[] arrayC = new int[10];
        merge(arrayA, 4, arrayB, 6, arrayC);
        display(arrayC, 10);
    }  // end main()
    //----------------------------------------------------------
// merge A and B into C

    public static void merge(int[] arrayA, int sizeA,
            int[] arrayB, int sizeB,
            int[] arrayC) {
        int aDex = 0, bDex = 0, cDex = 0;
        while (aDex < sizeA && bDex < sizeB) // neither array empty
        {
            if (arrayA[aDex] < arrayB[bDex]) {
                arrayC[cDex++] = arrayA[aDex++];
            } else {
                arrayC[cDex++] = arrayB[bDex++];
            }
        }
        while (aDex < sizeA) // arrayB is empty,
        {
            arrayC[cDex++] = arrayA[aDex++];  // but arrayA isn't
        }
        while (bDex < sizeB) // arrayA is empty,
        {
            arrayC[cDex++] = arrayB[bDex++];  // but arrayB isn't
        }
    }  // end merge()
    //----------------------------------------------------------
// display array

    public static void display(int[] theArray, int size) {
        for (int j = 0; j < size; j++) {
            System.out.print(theArray[j] + " ");
        }
        System.out.println("");
    }
    //----------------------------------------------------------
}  // end class MergeApp
 ////////////////////////////////////////////////////////////////

```

### 6.6 merge sort

```java

class DArray {

    private long[] theArray;          // ref to array theArray
    private int nElems;               // number of data items
    //----------------------------------------------------------

    public DArray(int max) // constructor
    {
        theArray = new long[max];      // create array
        nElems = 0;
    }
    //----------------------------------------------------------

    public void insert(long value) // put element into array
    {
        theArray[nElems] = value;      // insert it
        nElems++;                      // increment size
    }
    //----------------------------------------------------------

    public void display() // displays array contents
    {
        for (int j = 0; j < nElems; j++) // for each element,
        {
            System.out.print(theArray[j] + " ");  // display it
        }
        System.out.println("");
    }
    //----------------------------------------------------------

    public void mergeSort() // called by main()
    {                              // provides workspace
        long[] workSpace = new long[nElems];
        recMergeSort(workSpace, 0, nElems - 1);
    }
    //----------------------------------------------------------

    private void recMergeSort(long[] workSpace, int lowerBound,
            int upperBound) {
        if (lowerBound == upperBound) // if range is 1,
        {
            return;                              // no use sorting
        } else {                                    // find midpoint
            int mid = (lowerBound + upperBound) / 2;
            // sort low half
            recMergeSort(workSpace, lowerBound, mid);
            // sort high half
            recMergeSort(workSpace, mid + 1, upperBound);
            // merge them
            merge(workSpace, lowerBound, mid + 1, upperBound);
        }  // end else
    }  // end recMergeSort()
    //----------------------------------------------------------

    private void merge(long[] workSpace, int lowPtr,
            int highPtr, int upperBound) {
        int j = 0;                             // workspace index
        int lowerBound = lowPtr;
        int mid = highPtr - 1;
        int n = upperBound - lowerBound + 1;       // # of items
        while (lowPtr <= mid && highPtr <= upperBound) {
            if (theArray[lowPtr] < theArray[highPtr]) {
                workSpace[j++] = theArray[lowPtr++];
            } else {
                workSpace[j++] = theArray[highPtr++];
            }
        }
        while (lowPtr <= mid) {
            workSpace[j++] = theArray[lowPtr++];
        }
        while (highPtr <= upperBound) {
            workSpace[j++] = theArray[highPtr++];
        }
        for (j = 0; j < n; j++) {
            theArray[lowerBound + j] = workSpace[j];
        }
    }  // end merge()
    //----------------------------------------------------------
}  // end class DArray

////////////////////////////////////////////////////////////////
 class MergeSortApp {

    public static void main(String[] args) {
        int maxSize = 100;             // array size
        DArray arr;                    // reference to array
        arr = new DArray(maxSize);     // create the array
        arr.insert(64);                // insert items
        arr.insert(21);
        arr.insert(33);
        arr.insert(70);
        arr.insert(12);
        arr.insert(85);
        arr.insert(44);
        arr.insert(3);
        arr.insert(99);
        arr.insert(0);
        arr.insert(108);
        arr.insert(36);
        arr.display();                 // display items
        arr.mergeSort();               // merge sort the array
        arr.display();                 // display items again
    }  // end main()
}  // end class MergeSortApp
 ///////////////////////////////////////////////////////////////

```

### 6.7 Eliminating Recursion (stack based solution)

```java

class Params // parameters to save on stack
{

    public int n;
    public int returnAddress;

    public Params(int nn, int ra) {
        n = nn;
        returnAddress = ra;
    }
}  // end class Params

////////////////////////////////////////////////////////////////
 class StackX {

    private int maxSize;         // size of StackX array
    private Params[] stackArray;
    private int top;             // top of stack
    //-------------------------------------------------------------

    public StackX(int s) // constructor
    {
        maxSize = s;              // set array size
        stackArray = new Params[maxSize];  // create array
        top = -1;                 // no items yet
    }
    //-------------------------------------------------------------

    public void push(Params p) // put item on top of stack
    {
        stackArray[++top] = p;    // increment top, insert item
    }
    //-------------------------------------------------------------

    public Params pop() // take item from top of stack
    {
        return stackArray[top--]; // access item, decrement top
    }
    //-------------------------------------------------------------

    public Params peek() // peek at top of stack
    {
        return stackArray[top];
    }
    //-------------------------------------------------------------
}  // end class StackX

////////////////////////////////////////////////////////////////
 class StackTriangleApp {

    static int theNumber;
    static int theAnswer;
    static StackX theStack;
    static int codePart;
    static Params theseParams;
    //------------------------------------------------------------

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");
        theNumber = getInt();
        recTriangle();
        System.out.println("Triangle=" + theAnswer);
    }  // end main()
    //------------------------------------------------------------

    public static void recTriangle() {
        theStack = new StackX(10000);
        codePart = 1;
        while (step() == false)  // call step() until it's true
 ;                     // null statement
    }
    //------------------------------------------------------------

    public static boolean step() {
        switch (codePart) {
            case 1:                              // initial call
                theseParams = new Params(theNumber, 6);
                theStack.push(theseParams);
                codePart = 2;
                break;
            case 2:                              // method entry
                theseParams = theStack.peek();
                if (theseParams.n == 1) // test
                {
                    theAnswer = 1;
                    codePart = 5;   // exit
                } else {
                    codePart = 3;   // recursive call
                }
                break;
            case 3:                              // method call
                Params newParams = new Params(theseParams.n - 1, 4);
                theStack.push(newParams);
                codePart = 2;  // go enter method
                break;
            case 4:                              // calculation
                theseParams = theStack.peek();
                theAnswer = theAnswer + theseParams.n;
                codePart = 5;
                break;
            case 5:                              // method exit
                theseParams = theStack.peek();
                codePart = theseParams.returnAddress; // (4 or 6)
                theStack.pop();
                break;
            case 6:                              // return point
                return true;
        }  // end switch
        return false;
    }  // end triangle
    //------------------------------------------------------------

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    //------------------------------------------------------------

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
    //-------------------------------------------------------------
}  // end class StackTriangleApp
 ////////////////////////////////////////////////////////////////

```

### 6.8 complete Eliminating Recursion

```java

class StackX {

    private int maxSize;        // size of stack array
    private int[] stackArray;
    private int top;            // top of stack
    //-------------------------------------------------------------

    public StackX(int s) // constructor
    {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }
    //-------------------------------------------------------------

    public void push(int p) // put item on top of stack
    {
        stackArray[++top] = p;
    }
    //-------------------------------------------------------------

    public int pop() // take item from top of stack
    {
        return stackArray[top--];
    }
    //-------------------------------------------------------------

    public int peek() // peek at top of stack
    {
        return stackArray[top];
    }
    //------------------------------------------------------------

    public boolean isEmpty() // true if stack is empty
    {
        return (top == -1);
    }
    //-------------------------------------------------------------
}  // end class StackX

////////////////////////////////////////////////////////////////
 class StackTriangle2App {

    static int theNumber;
    static int theAnswer;
    static StackX theStack;

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");
        theNumber = getInt();
        stackTriangle();
        System.out.println("Triangle=" + theAnswer);
    }  // end main()
    //------------------------------------------------------------

    public static void stackTriangle() {
        theStack = new StackX(10000);     // make a stack
        theAnswer = 0;                   // initialize answer
        while (theNumber > 0) // until n is 1,
        {
            theStack.push(theNumber);     // push value--theNumber;                  // decrement value
        }
        while (!theStack.isEmpty()) // until stack empty,
        {
            int newN = theStack.pop();    // pop value,
            theAnswer += newN;            // add to answer
        }
    }
    //------------------------------------------------------------

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    //------------------------------------------------------------

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
    //------------------------------------------------------------
}  // end class StackTriangle2App

```

## chapter.7 Advanced Sorting

### 7.1 shell sort

```java

class ArraySh {

    private long[] theArray;          // ref to array theArray
    private int nElems;               // number of data items
    //------------------------------------------------------------

    public ArraySh(int max) // constructor
    {
        theArray = new long[max];      // create the array
        nElems = 0;                    // no items yet
    }
    //-------------------------------------------------------------

    public void insert(long value) // put element into array
    {
        theArray[nElems] = value;      // insert it
        nElems++;                      // increment size
    }
    //-------------------------------------------------------------

    public void display() // displays array contents
    {
        System.out.print("A=");
        for (int j = 0; j < nElems; j++) // for each element,
        {
            System.out.print(theArray[j] + " ");  // display it
        }
        System.out.println("");
    }
    //-------------------------------------------------------------

    public void shellSort() {
        int inner, outer;
        long temp;
        int h = 1;                     // find initial value of h
        while (h <= nElems / 3) {
            h = h * 3 + 1;                // (1, 4, 13, 40, 121, ...)
        }
        while (h > 0) // decreasing h, until h=1
        {
            // h-sort the file
            for (outer = h; outer < nElems; outer++) {
                temp = theArray[outer];
                inner = outer;
                // one subpass (eg 0, 4, 8)
                while (inner > h - 1 && theArray[inner - h] >= temp) {
                    theArray[inner] = theArray[inner - h];
                    inner -= h;
                }
                theArray[inner] = temp;
            }  // end for
            h = (h - 1) / 3;              // decrease h
        }  // end while(h>0)
    }  // end shellSort()
    //-------------------------------------------------------------
}  // end class ArraySh

////////////////////////////////////////////////////////////////
 class ShellSortApp {

    public static void main(String[] args) {
        int maxSize = 10;             // array size
        ArraySh arr;
        arr = new ArraySh(maxSize);   // create the array
        for (int j = 0; j < maxSize; j++) // fill array with
        {                          // random numbers
            long n = (int) (java.lang.Math.random() * 99);
            arr.insert(n);
        }
        arr.display();                // display unsorted array
        arr.shellSort();              // shell sort the array
        arr.display();                // display sorted array
    }  // end main()
}  // end class ShellSortApp

```

### 7.2 partitioning

```java

class ArrayPar {

    private long[] theArray;          // ref to array theArray
    private int nElems;               // number of data items
    //-------------------------------------------------------------

    public ArrayPar(int max) // constructor
    {
        theArray = new long[max];      // create the array
        nElems = 0;                    // no items yet
    }
    //-------------------------------------------------------------

    public void insert(long value) // put element into array
    {
        theArray[nElems] = value;      // insert it
        nElems++;                      // increment size
    }
    //-------------------------------------------------------------

    public int size() // return number of items
    {
        return nElems;
    }
    //-------------------------------------------------------------

    public void display() // displays array contents
    {
        System.out.print("A=");
        for (int j = 0; j < nElems; j++) // for each element,
        {
            System.out.print(theArray[j] + " ");  // display it
        }
        System.out.println("");
    }
    //-------------------------------------------------------------

    public int partitionIt(int left, int right, long pivot) {
        int leftPtr = left - 1;           // right of first elem
        int rightPtr = right + 1;         // left of pivot
        while (true) {
            while (leftPtr < right
                    && // find bigger item
                    theArray[++leftPtr] < pivot)
 ;  // (nop)
            while (rightPtr > left
                    && // find smaller item
                    theArray[--rightPtr] > pivot)
 ;  // (nop)
            if (leftPtr >= rightPtr) // if pointers cross,
            {
                break;                      //    partition done
            } else // not crossed, so
            {
                swap(leftPtr, rightPtr);    //    swap elements
            }
        }  // end while(true)
        return leftPtr;                   // return partition
    }  // end partitionIt()
    //-------------------------------------------------------------

    public void swap(int dex1, int dex2) // swap two elements
    {
        long temp;
        temp = theArray[dex1];             // A into temp
        theArray[dex1] = theArray[dex2];   // B into A
        theArray[dex2] = temp;             // temp into B
    }  // end swap()
    //-------------------------------------------------------------
}  // end class ArrayPar

////////////////////////////////////////////////////////////////
 class PartitionApp {

    public static void main(String[] args) {
        int maxSize = 16;             // array size
        ArrayPar arr;                 // reference to array
        arr = new ArrayPar(maxSize);  // create the array
        for (int j = 0; j < maxSize; j++) // fill array with
        {                          // random numbers
            long n = (int) (java.lang.Math.random() * 199);
            arr.insert(n);
        }
        arr.display();                // display unsorted array
        long pivot = 99;              // pivot value
        System.out.print("Pivot is " + pivot);
        int size = arr.size();
        // partition array
        int partDex = arr.partitionIt(0, size - 1, pivot);
        System.out.println(", Partition is at index " + partDex);
        arr.display();                // display partitioned array
    }  // end main()
}
```

### 7.3 Quick Sort Algorithm

```java
// quickSort1.java
// demonstrates simple version of quick sort
// to run this program: C>java QuickSort1App

////////////////////////////////////////////////////////////////
 class ArrayIns {

    private long[] theArray;          // ref to array theArray
    private int nElems;               // number of data items
    //-------------------------------------------------------------

    public ArrayIns(int max) // constructor
    {
        theArray = new long[max];      // create the array
        nElems = 0;                    // no items yet
    }
    //-------------------------------------------------------------

    public void insert(long value) // put element into array
    {
        theArray[nElems] = value;      // insert it
        nElems++;                      // increment size
    }
    //-------------------------------------------------------------

    public void display() // displays array contents
    {
        System.out.print("A=");
        for (int j = 0; j < nElems; j++) // for each element,
        {
            System.out.print(theArray[j] + " ");  // display it
        }
        System.out.println("");
    }
//-------------------------------------------------------------

    public void quickSort() {
        recQuickSort(0, nElems - 1);
    }
    //-------------------------------------------------------------

    public void recQuickSort(int left, int right) {
        if (right - left <= 0) // if size <= 1,
        {
            return;                      //    already sorted
        } else // size is 2 or larger
        {
            long pivot = theArray[right];      // rightmost item
            // partition range
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition - 1);   // sort left side
            recQuickSort(partition + 1, right);  // sort right side
        }
    }  // end recQuickSort()
    //-------------------------------------------------------------

    public int partitionIt(int left, int right, long pivot) {
        int leftPtr = left - 1;           // left    (after ++)
        int rightPtr = right;           // right-1 (after --)
        while (true) {                            // find bigger item
            while (theArray[++leftPtr] < pivot)
 ;  // (nop)
            // find smaller item
            while (rightPtr > 0 && theArray[--rightPtr] > pivot)
 ;  // (nop)
            if (leftPtr >= rightPtr) // if pointers cross,
            {
                break;                    //    partition done
            } else // not crossed, so
            {
                swap(leftPtr, rightPtr);  //    swap elements
            }
        }  // end while(true)
        swap(leftPtr, right);           // restore pivot
        return leftPtr;                 // return pivot location
    }  // end partitionIt()
    //------------------------------------------------------------ public void swap(int dex1, int dex2)  // swap two elements

    {
        long temp = theArray[dex1];        // A into temp
        theArray[dex1] = theArray[dex2];   // B into A
        theArray[dex2] = temp;             // temp into B
    }  // end swap(
    //-------------------------------------------------------------
}  // end class ArrayIns

////////////////////////////////////////////////////////////////
 class QuickSort1App {

    public static void main(String[] args) {
        int maxSize = 16;             // array size
        ArrayIns arr;
        arr = new ArrayIns(maxSize);  // create array
        for (int j = 0; j < maxSize; j++) // fill array with
        {                          // random numbers
            long n = (int) (java.lang.Math.random() * 99);
            arr.insert(n);
        }
        arr.display();                // display items
        arr.quickSort();              // quicksort them
        arr.display();                // display them again
    }  // end main()
}  // end class QuickSort1App
```

###

7.4 Quick Sort median-of-three partitioning

```java
 // quickSort2.java
 // demonstrates quick sort with median-of-three partitioning
 // to run this program: C>java QuickSort2App
 ////////////////////////////////////////////////////////////////
 class ArrayIns {

    private long[] theArray;          // ref to array theArray
    private int nElems;               // number of data items
    //-------------------------------------------------------------

    public ArrayIns(int max) // constructor
    {
        theArray = new long[max];      // create the array
        nElems = 0;                    // no items yet
    }
    //-------------------------------------------------------------

    public void insert(long value) // put element into array
    {
        theArray[nElems] = value;      // insert it
        nElems++;                      // increment size
    }
    //-------------------------------------------------------------

    public void display() // displays array contents
    {
        System.out.print("A=");
        for (int j = 0; j < nElems; j++) // for each element,
        {
            System.out.print(theArray[j] + " ");  // display it
        }
        System.out.println("");
    }
    //-------------------------------------------------------------

    public void quickSort() {
        recQuickSort(0, nElems - 1);
    }
    //-------------------------------------------------------------

    public void recQuickSort(int left, int right) {
        int size = right - left + 1;
        if (size <= 3) // manual sort if small
        {
            manualSort(left, right);
        } else // quicksort if large
        {
            long median = medianOf3(left, right);
            int partition = partitionIt(left, right, median);
            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, right);
        }
    }  // end recQuickSort()
    //-------------------------------------------------------------

    public long medianOf3(int left, int right) {
        int center = (left + right) / 2;
        // order left & center
        if (theArray[left] > theArray[center]) {
            swap(left, center);
        }
        // order left & right
        if (theArray[left] > theArray[right]) {
            swap(left, right);
        }
        // order center & right
        if (theArray[center] > theArray[right]) {
            swap(center, right);
        }
        swap(center, right - 1);             // put pivot on right
        return theArray[right - 1];          // return median value
    }  // end medianOf3()
    //-------------------------------------------------------------

    public void swap(int dex1, int dex2) // swap two elements
    {
        long temp = theArray[dex1];        // A into temp
        theArray[dex1] = theArray[dex2];   // B into A
        theArray[dex2] = temp;             // temp into B
    }  // end swap(
    //-------------------------------------------------------------

    public int partitionIt(int left, int right, long pivot) {
        int leftPtr = left;             // right of first elem
        int rightPtr = right - 1;       // left of pivot
        while (true) {
            while (theArray[++leftPtr] < pivot)  // find bigger
 ;                                  //    (nop)
            while (theArray[--rightPtr] > pivot) // find smaller
 ;                                  //    (nop)
            if (leftPtr >= rightPtr) // if pointers cross,
            {
                break;                    //    partition done
            } else // not crossed, so
            {
                swap(leftPtr, rightPtr);  // swap elements
            }
        }  // end while(true)
        swap(leftPtr, right - 1);         // restore pivot
        return leftPtr;                 // return pivot location
    }  // end partitionIt()
    //-------------------------------------------------------------

    public void manualSort(int left, int right) {
        int size = right - left + 1;
        if (size <= 1) {
            return;         // no sort necessary
        }
        if (size == 2) {               // 2-sort left and right
            if (theArray[left] > theArray[right]) {
                swap(left, right);
            }
            return;
        } else // size is 3
        {               // 3-sort left, center, & right
            if (theArray[left] > theArray[right - 1]) {
                swap(left, right - 1);                // left, center
            }
            if (theArray[left] > theArray[right]) {
                swap(left, right);                  // left, right
            }
            if (theArray[right - 1] > theArray[right]) {
                swap(right - 1, right);               // center, right
            }
        }
    }  // end manualSort()
    //-------------------------------------------------------------
}  // end class ArrayIns

/////////////////////////////////////////////////////////
 class QuickSort2App {

    public static void main(String[] args) {
        int maxSize = 16;             // array size
        ArrayIns arr;                 // reference to array
        arr = new ArrayIns(maxSize);  // create the array
        for (int j = 0; j < maxSize; j++) // fill array with
        {                          // random numbers
            long n = (int) (java.lang.Math.random() * 99);
            arr.insert(n);
        }
        arr.display();                // display items
        arr.quickSort();              // quicksort them
        arr.display();                // display them again
    }  // end main()
}  // end class QuickSort2App

```

### 7.5 Quick Sort 3 (Handling Small Partitions)

```java

// quickSort3.java
// demonstrates quick sort; uses insertion sort for cleanup
// to run this program: C>java QuickSort3App
////////////////////////////////////////////////////////////////
 class ArrayIns {

    private long[] theArray;          // ref to array theArray
    private int nElems;               // number of data items
    //-------------------------------------------------------------

    public ArrayIns(int max) // constructor
    {
        theArray = new long[max];      // create the array
        nElems = 0;                    // no items yet
    }
    //-------------------------------------------------------------

    public void insert(long value) // put element into array
    {
        theArray[nElems] = value;      // insert it
        nElems++;                      // increment size
    }
    //-------------------------------------------------------------

    public void display() // displays array contents
    {
        System.out.print("A=");
        for (int j = 0; j < nElems; j++) // for each element,
        {
            System.out.print(theArray[j] + " ");  // display it
        }
        System.out.println("");
    }
    //-------------------------------------------------------------

    public void quickSort() {
        recQuickSort(0, nElems - 1);
        // insertionSort(0, nElems-1); // the other option
    }
    //-------------------------------------------------------------

    public void recQuickSort(int left, int right) {
        int size = right - left + 1;
        if (size < 10) // insertion sort if small
        {
            insertionSort(left, right);
        } else // quicksort if large
        {
            long median = medianOf3(left, right);
            int partition = partitionIt(left, right, median);
            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, right);
        }
    }  // end recQuickSort()
    //-------------------------------------------------------------

    public long medianOf3(int left, int right) {
        int center = (left + right) / 2;
        // order left & center
        if (theArray[left] > theArray[center]) {
            swap(left, center);
        }
        // order left & right
        if (theArray[left] > theArray[right]) {
            swap(left, right);
        }
        // order center & right
        if (theArray[center] > theArray[right]) {
            swap(center, right);
        }
        swap(center, right - 1);           // put pivot on right
        return theArray[right - 1];        // return median value
    }  // end medianOf3()
    //-------------------------------------------------------------

    public void swap(int dex1, int dex2) // swap two elements
    {
        long temp = theArray[dex1];        // A into temp
        theArray[dex1] = theArray[dex2];   // B into A
        theArray[dex2] = temp;             // temp into B
    }  // end swap(
    //-------------------------------------------------------------

    public int partitionIt(int left, int right, long pivot) {
        int leftPtr = left;             // right of first elem
        int rightPtr = right - 1;       // left of pivot
        while (true) {
            while (theArray[++leftPtr] < pivot)  // find bigger
 ;                                  // (nop)
            while (theArray[--rightPtr] > pivot) // find smaller
 ;                                  // (nop)
            if (leftPtr >= rightPtr) // if pointers cross,
            {
                break;                    //    partition done
            } else // not crossed, so
            {
                swap(leftPtr, rightPtr);  // swap elements
            }
        }  // end while(true)
        swap(leftPtr, right - 1);         // restore pivot
        return leftPtr;                 // return pivot location
    }  // end partitionIt()
    //-------------------------------------------------------------
// insertion sort

    public void insertionSort(int left, int right) {
        int in, out;
        //  sorted on left of out
        for (out = left + 1; out <= right; out++) {
            long temp = theArray[out];    // remove marked item
            in = out;                     // start shifts at out
            // until one is smaller,
            while (in > left && theArray[in - 1] >= temp) {
                theArray[in] = theArray[in - 1]; // shift item to right--in;                      // go left one position
            }
            theArray[in] = temp;          // insert marked item
        }  // end for
    }  // end insertionSort()
    //-------------------------------------------------------------
}  // end class ArrayIns

////////////////////////////////////////////////////////////////
 class QuickSort3App {

    public static void main(String[] args) {
        int maxSize = 16;             // array size
        ArrayIns arr;                 // reference to array
        arr = new ArrayIns(maxSize);  // create the array
        for (int j = 0; j < maxSize; j++) // fill array with
        {                          // random numbers
            long n = (int) (java.lang.Math.random() * 99);
            arr.insert(n);
        }
        arr.display();                // display items
        arr.quickSort();              // quicksort them
        arr.display();                // display them again
    }  // end main()
}

```

### 7.6 Radix sort

We'll discuss the radix sort in terms of normal base-10 arithmetic, which is easier to
visualize. However, an efficient implementation of the radix sort would use base-2
arithmetic to take advantage of the computer's speed in bit manipulation. We'll look
at the radix sort rather than the similar but somewhat more complex radix-exchange
sort. The word radix means the base of a system of numbers. Ten is the radix of the
decimal system and 2 is the radix of the binary system. The sort involves examining
each digit of the key separately, starting with the 1s (least significant) digit.

1.  All the data items are divided into 10 groups, according to the value of their 1s
    digit.
2.  These 10 groups are then reassembled: All the keys ending with 0 go first,
    followed by all the keys ending in 1, and so on up to 9. We'll call these steps a
    sub-sort.
3.  In the second sub-sort, all data is divided into 10 groups again, but this time
    according to the value of their 10s digit. This must be done without changing
    the order of the previous sort. That is, within each of the 10 groups, the order
    ing of the items remains the same as it was after step 2; the sub-sorts must be
    stable.
4.  Again the 10 groups are recombined, those with a 10s digit of 0 first, then
    those with a 10s digit of 1, and so on up to 9.
5.  This process is repeated for the remaining digits. If some keys have fewer digits
    than others, their higher-order digits are considered to be 0.
    Here's an example, using seven data items, each with three digits. Leading zeros are
    shown for clarity.
    421 240 035 532 305 430 124 // unsorted array
    (240 430) (421) (532) (124) (035 305) // sorted on 1s digit
    (305) (421 124) (430 532 035) (240) // sorted on 10s digit
    (035) (124) (240) (305) (421 430) (532) // sorted on 100s digit
    035 124 240 305 421 430 532 // sorted array
    The parentheses delineate the groups. Within each group the digits in the appropri
    ate position are the same. To convince yourself that this approach really works, try it
    on a piece of paper with some numbers you make up.

## chapter.8 Binary Tree

### 8.1 tree class

```java
 // tree.java
// demonstrates binary tree
// to run this program: C>java TreeApp

import java.io.*;
import java.util.*;               // for Stack class

////////////////////////////////////////////////////////////////
 class Node {

    public int iData;              // data item (key)
    public double dData;           // data item
    public Node leftChild;         // this node's left child
    public Node rightChild;        // this node's right child

    public void displayNode() // display ourself
    {
        System.out.print(
        '{
            ');
 System.out.print(iData);
            System.out.print(", ");
            System.out.print(dData);
            System.out.print("} ");
        }
    }  // end class Node

    ////////////////////////////////////////////////////////////////
 class Tree {

        private Node root;             // first node of tree
        // ------------------------------------------------------------

        public Tree() // constructor
        {
            root = null;
        }            // no nodes in tree yet
        // ------------------------------------------------------------

        public Node find(int key) // find node with given key
        {                           // (assumes non-empty tree)
            Node current = root;               // start at root
            while (current.iData != key) // while no match,
            {
                if (key < current.iData) // go left?
                {
                    current = current.leftChild;
                } else // or go right?
                {
                    current = current.rightChild;
                }
                if (current == null) // if no child,
                {
                    return null;                 // didn't find it
                }
            }
            return current;                    // found it
        }  // end find()
        // ------------------------------------------------------------

        public void insert(int id, double dd) {
            Node newNode = new Node();    // make new node
            newNode.iData = id;           // insert data
            newNode.dData = dd;
            if (root == null) // no node in root
            {
                root = newNode;
            } else // root occupied
            {
                Node current = root;       // start at root
                Node parent;
                while (true) // (exits internally)
                {
                    parent = current;
                    if (id < current.iData) // go left?
                    {
                        current = current.leftChild;
                        if (current == null) // if end of the line,
                        {                 // insert on left
                            parent.leftChild = newNode;
                            return;
                        }
                    } // end if go left
                    else // or go right?
                    {
                        current = current.rightChild;
                        if (current == null) // if end of the line
                        {                 // insert on right
                            parent.rightChild = newNode;
                            return;
                        }
                    }  // end else go right
                }  // end while
            }  // end else not root
        }  // end insert()
        // ------------------------------------------------------------

        public boolean delete(int key) // delete node with given key
        {                           // (assumes non-empty list)
            Node current = root;
            Node parent = root;
            boolean isLeftChild = true;
            while (current.iData != key) // search for node
            {
                parent = current;
                if (key < current.iData) // go left?
                {
                    isLeftChild = true;
                    current = current.leftChild;
                } else // or go right?
                {
                    isLeftChild = false;
                    current = current.rightChild;
                }
                if (current == null) // end of the line,
                {
                    return false;                // didn't find it
                }
            }  // end while
            // found node to delete
            // if no children, simply delete it
            if (current.leftChild == null
                    && current.rightChild == null) {
                if (current == root) // if root,
                {
                    root = null;                 // tree is empty
                } else if (isLeftChild) {
                    parent.leftChild = null;     // disconnect
                } else // from parent
                {
                    parent.rightChild = null;
                }
            } // if no right child, replace with left subtree
            else if (current.rightChild == null) {
                if (current == root) {
                    root = current.leftChild;
                } else if (isLeftChild) {
                    parent.leftChild = current.leftChild;
                } else {
                    parent.rightChild = current.leftChild;
                }
            } // if no left child, replace with right subtree
            else if (current.leftChild == null) {
                if (current == root) {
                    root = current.rightChild;
                } else if (isLeftChild) {
                    parent.leftChild = current.rightChild;
                } else {
                    parent.rightChild = current.rightChild;
                }
            } else // two children, so replace with inorder successor
            {
                // get successor of node to delete (current)
                Node successor = getSuccessor(current);
                // connect parent of current to successor instead
                if (current == root) {
                    root = successor;
                } else if (isLeftChild) {
                    parent.leftChild = successor;
                } else {
                    parent.rightChild = successor;
                }
                // connect successor to current's left child
                successor.leftChild = current.leftChild;
            }  // end else two children
            // (successor cannot have a left child)
            return true;                                // success
        }  // end delete()
        // ------------------------------------------------------------
// returns node with next-highest value after delNode
        // goes to right child, then right child's left descendents

        private Node getSuccessor(Node delNode) {
            Node successorParent = delNode;
            Node successor = delNode;
            Node current = delNode.rightChild;   // go to right child
            while (current != null) // until no more
            {                                 // left children,
                successorParent = successor;
                successor = current;
                current = current.leftChild;      // go to left child
            }
            // if successor not
            if (successor != delNode.rightChild) // right child,
            {                                 // make connections
                successorParent.leftChild = successor.rightChild;
                successor.rightChild = delNode.rightChild;
            }
            return successor;
        }
        // ------------------------------------------------------------

        public void traverse(int traverseType) {
            switch (traverseType) {
                case 1:
                    System.out.print("\nPreorder traversal: ");
                    preOrder(root);
                    break;
                case 2:
                    System.out.print("\nInorder traversal:  ");
                    inOrder(root);
                    break;
                case 3:
                    System.out.print("\nPostorder traversal: ");
                    postOrder(root);
                    break;
            }
            System.out.println();
        }
        // ------------------------------------------------------------

        private void preOrder(Node localRoot) {
            if (localRoot != null) {
                System.out.print(localRoot.iData + " ");
                preOrder(localRoot.leftChild);
                preOrder(localRoot.rightChild);
            }
        }
        // ------------------------------------------------------------

        private void inOrder(Node localRoot) {
            if (localRoot != null) {
                inOrder(localRoot.leftChild);
                System.out.print(localRoot.iData + " ");
                inOrder(localRoot.rightChild);
            }
        }
        // ------------------------------------------------------------

        private void postOrder(Node localRoot) {
            if (localRoot != null) {
                postOrder(localRoot.leftChild);
                postOrder(localRoot.rightChild);
                System.out.print(localRoot.iData + " ");
            }
        }
        // ------------------------------------------------------------

        public void displayTree() {
            Stack globalStack = new Stack();
            globalStack.push(root);
            int nBlanks = 32;
            boolean isRowEmpty = false;
            System.out.println(
                    "......................................................");
            while (isRowEmpty == false) {
                Stack localStack = new Stack();
                isRowEmpty = true;
                for (int j = 0; j < nBlanks; j++) {
                    System.out.print(
                }
                ' ');
 while (globalStack.isEmpty() == false) {
                    Node temp = (Node) globalStack.pop();
                    if (temp != null) {
                        System.out.print(temp.iData);
                        localStack.push(temp.leftChild);
                        localStack.push(temp.rightChild);
                        if (temp.leftChild != null
                                || temp.rightChild != null) {
                            isRowEmpty = false;
                        }
                    } else {
                        System.out.print("--");
                        localStack.push(null);
                        localStack.push(null);
                    }
                    for (int j = 0; j < nBlanks * 2 - 2; j++) {
                        System.out.print(
                    }

                ' ');
 }  // end while globalStack not empty
 System.out.println();
                nBlanks /= 2;
                while (localStack.isEmpty() == false) {
                    globalStack.push(localStack.pop());
                }
            }  // end while isRowEmpty is false
            System.out.println(
                    "......................................................");
        }  // end displayTree()
        // ------------------------------------------------------------
    }  // end class Tree

    ////////////////////////////////////////////////////////////////
 class TreeApp {

        public static void main(String[] args) throws IOException {
            int value;
            Tree theTree = new Tree();
            theTree.insert(50, 1.5);
            theTree.insert(25, 1.2);
            theTree.insert(75, 1.7);
            theTree.insert(12, 1.5);
            theTree.insert(37, 1.2);
            theTree.insert(43, 1.7);
            theTree.insert(30, 1.5);
            theTree.insert(33, 1.2);
            theTree.insert(87, 1.7);
            theTree.insert(93, 1.5);
            theTree.insert(97, 1.5);
            while (true) {
                System.out.print("Enter first letter of show, ");
                System.out.print("insert, find, delete, or traverse: ");
                int choice = getChar();
                switch (choice) {
                    case 's':
 theTree.displayTree();
                        break;
                    case 'i':
 System.out.print("Enter value to insert: ");
                        value = getInt();
                        theTree.insert(value, value + 0.9);
                        break;
                    case 'f':
 System.out.print("Enter value to find: ");
                        value = getInt();
                        Node found = theTree.find(value);
                        if (found != null) {
                            System.out.print("Found: ");
                            found.displayNode();
                            System.out.print("\n");
                        } else {
                            System.out.print("Could not find ");
                        }
                        System.out.print(value + '\n
                        ');
 break;
                    case 'd':
 System.out.print("Enter value to delete: ");
                        value = getInt();
                        boolean didDelete = theTree.delete(value);
                        if (didDelete) {
                            System.out.print("Deleted " + value +
                        }
                        '\n
                        ');
 else
 System.out.print("Could not delete ");
                        System.out.print(value + '\n
                        ');
 break;
                    case 't':
 System.out.print("Enter type 1, 2 or 3: ");
                        value = getInt();
                        theTree.traverse(value);
                        break;
                    default:
                        System.out.print("Invalid entry\n");
                }  // end switch
            }  // end while
        }  // end main()
        // ------------------------------------------------------------

        public static String getString() throws IOException {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            return s;
        }
        // ------------------------------------------------------------

        public static char getChar() throws IOException {
            String s = getString();
            return s.charAt(0);
        }
        //------------------------------------------------------------

        public static int getInt() throws IOException {
            String s = getString();
            return Integer.parseInt(s);
        }
        // ------------------------------------------------------------
    }  // end class TreeApp
////////////////////////////////////////////////////////////////

```

## chapter.10 2-3-4 tree

### 10.1 2-3-4 tree class

```java

// tree234.java
// demonstrates 234 tree
// to run this program: C>java Tree234App
import java.io.*;

////////////////////////////////////////////////////////////////
 class DataItem {

    public long dData;          // one data item
    //-------------------------------------------------------------

    public DataItem(long dd) // constructor
    {
        dData = dd;
    }
    //-------------------------------------------------------------

    public void displayItem() // display item, format "/27"
    {
        System.out.print("/" + dData);
    }
    //-------------------------------------------------------------
}  // end class DataItem

////////////////////////////////////////////////////////////////
 class Node {

    private static final int ORDER = 4;
    private int numItems;
    private Node parent;
    private Node childArray[] = new Node[ORDER];
    private DataItem itemArray[] = new DataItem[ORDER - 1];
    // ------------------------------------------------------------
// connect child to this node

    public void connectChild(int childNum, Node child) {
        childArray[childNum] = child;
        if (child != null) {
            child.parent = this;
        }
    }
    // ------------------------------------------------------------
// disconnect child from this node, return it

    public Node disconnectChild(int childNum) {
        Node tempNode = childArray[childNum];
        childArray[childNum] = null;
        return tempNode;
    }
    // ------------------------------------------------------------

    public Node getChild(int childNum) {
        return childArray[childNum];
    }
    // ------------------------------------------------------------

    public Node getParent() {
        return parent;
    }
    // ------------------------------------------------------------

    public boolean isLeaf() {
        return (childArray[0] == null) ? true : false;
    }
    // ------------------------------------------------------------

    public int getNumItems() {
        return numItems;
    }
    // ------------------------------------------------------------

    public DataItem getItem(int index) // get DataItem at index
    {
        return itemArray[index];
    }
    // ------------------------------------------------------------

    public boolean isFull() {
        return (numItems == ORDER - 1) ? true : false;
    }
    // ------------------------------------------------------------

    public int findItem(long key) // return index of
    {                                    // item (within node)
        for (int j = 0; j < ORDER - 1; j++) // if found,
        {                                 // otherwise,
            if (itemArray[j] == null) // return -1
            {
                break;
            } else if (itemArray[j].dData == key) {
                return j;
            }
        }
        return -1;
    }  // end findItem
    // ------------------------------------------------------------

    public int insertItem(DataItem newItem) {
        // assumes node is not full
        numItems++;                          // will add new item
        long newKey = newItem.dData;         // key of new item
        for (int j = ORDER - 2; j >= 0; j--) // start on right,
        {                                 //    examine items
            if (itemArray[j] == null) // if item null,
            {
                continue;                      // go left one cell
            } else // not null,
            {                              // get its key
                long itsKey = itemArray[j].dData;
                if (newKey < itsKey) // if it's bigger
                {
                    itemArray[j + 1] = itemArray[j]; // shift it right
                } else {
                    itemArray[j + 1] = newItem;   // insert new item
                    return j + 1;                 // return index to
                }                           //    new item
            }  // end else (not null)
        }  // end for                     // shifted all items,
        itemArray[0] = newItem;              // insert new item
        return 0;
    }  // end insertItem()
    // ------------------------------------------------------------

    public DataItem removeItem() // remove largest item
    {
        // assumes node not empty
        DataItem temp = itemArray[numItems - 1];  // save item
        itemArray[numItems - 1] = null;           // disconnect it
        numItems--;                             // one less item
        return temp;                            // return item
    }
    // ------------------------------------------------------------

    public void displayNode() // format "/24/56/74/"
    {
        for (int j = 0; j < numItems; j++) {
            itemArray[j].displayItem();   // "/56"
        }
        System.out.println("/");         // final "/"
    }
    // ------------------------------------------------------------
}  // end class Node

////////////////////////////////////////////////////////////////
 class Tree234 {

    private Node root = new Node();            // make root node
    // ------------------------------------------------------------

    public int find(long key) {
        Node curNode = root;
        int childNumber;
        while (true) {
            if ((childNumber = curNode.findItem(key)) != -1) {
                return childNumber;               // found it
            } else if (curNode.isLeaf()) {
                return -1;                        // can't find it
            } else // search deeper
            {
                curNode = getNextChild(curNode, key);
            }
        }  // end while
    }
    // ------------------------------------------------------------
// insert a DataItem

    public void insert(long dValue) {
        Node curNode = root;
        DataItem tempItem = new DataItem(dValue);
        while (true) {
            if (curNode.isFull()) // if node full,
            {
                split(curNode);                   // split it
                curNode = curNode.getParent();    // back up
                // search once
                curNode = getNextChild(curNode, dValue);
            } // end if(node is full)
            else if (curNode.isLeaf()) // if node is leaf,
            {
                break;                            // go insert
            } // node is not full, not a leaf; so go to lower level
            else {
                curNode = getNextChild(curNode, dValue);
            }
        }  // end while
        curNode.insertItem(tempItem);       // insert new DataItem
    }  // end insert()
    // ------------------------------------------------------------

    public void split(Node thisNode) // split the node
    {
        // assumes node is full
        DataItem itemB, itemC;
        Node parent, child2, child3;
        int itemIndex;
        itemC = thisNode.removeItem();    // remove items from
        itemB = thisNode.removeItem();    // this node
        child2 = thisNode.disconnectChild(2); // remove children
        child3 = thisNode.disconnectChild(3); // from this node
        Node newRight = new Node();       // make new node
        if (thisNode == root) // if this is the root,
        {
            root = new Node();                // make new root
            parent = root;                    // root is our parent
            root.connectChild(0, thisNode);   // connect to parent
        } else // this node not the root
        {
            parent = thisNode.getParent();    // get parent
        } // deal with parent
        itemIndex = parent.insertItem(itemB); // item B to parent
        int n = parent.getNumItems();         // total items?
        for (int j = n - 1; j > itemIndex; j--) // move parent's
        {                                      // connections
            Node temp = parent.disconnectChild(j); // one child
            parent.connectChild(j + 1, temp);        // to the right
        }
        // connect newRight to parent
        parent.connectChild(itemIndex + 1, newRight);
        // deal with newRight
        newRight.insertItem(itemC);       // item C to newRight
        newRight.connectChild(0, child2); // connect to 0 and 1
        newRight.connectChild(1, child3); // on newRight
    }  // end split()
    // ------------------------------------------------------------
// gets appropriate child of node during search for value

    public Node getNextChild(Node theNode, long theValue) {
        int j;
        // assumes node is not empty, not full, not a leaf
        int numItems = theNode.getNumItems();
        for (j = 0; j < numItems; j++) // for each item in node
        {                               // are we less?
            if (theValue < theNode.getItem(j).dData) {
                return theNode.getChild(j);  // return left child
            }
        }  // end for                   // we're greater, so
        return theNode.getChild(j);        // return right child
    }
    // ------------------------------------------------------------

    public void displayTree() {
        recDisplayTree(root, 0, 0);
    }
    // ------------------------------------------------------------

    private void recDisplayTree(Node thisNode, int level,
            int childNumber) {
        System.out.print("level=" + level + " child=" + childNumber + " ");
        thisNode.displayNode();               // display this node
        // call ourselves for each child of this node
        int numItems = thisNode.getNumItems();
        for (int j = 0; j < numItems + 1; j++) {
            Node nextNode = thisNode.getChild(j);
            if (nextNode != null) {
                recDisplayTree(nextNode, level + 1, j);
            } else {
                return;
            }
        }
    }  // end recDisplayTree()
    // -------------------------------------------------------------\
}  // end class Tree234

////////////////////////////////////////////////////////////////
 class Tree234App {

    public static void main(String[] args) throws IOException {
        long value;
        Tree234 theTree = new Tree234();
        theTree.insert(50);
        theTree.insert(40);
        theTree.insert(60);
        theTree.insert(30);
        theTree.insert(70);
        while (true) {
            System.out.print("Enter first letter of ");
            System.out.print("show, insert, or find: ");
            char choice = getChar();
            switch (choice) {
                case 's':
 theTree.displayTree();
                    break;
                case 'i':
 System.out.print("Enter value to insert: ");
                    value = getInt();
                    theTree.insert(value);
                    break;
                case 'f':
 System.out.print("Enter value to find: ");
                    value = getInt();
                    int found = theTree.find(value);
                    if (found != -1) {
                        System.out.println("Found " + value);
                    } else {
                        System.out.println("Could not find " + value);
                    }
                    break;
                default:
                    System.out.print("Invalid entry\n");
            }  // end switch
        }  // end while
    }  // end main()
    //-------------------------------------------------------------

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    //-------------------------------------------------------------

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }
    //------------------------------------------------------------

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
    //------------------------------------------------------------
}  // end class Tree234App
 ///////////////////////////////////////////////////////////////

```

### chapter.11 Hash Tables

```java
 // hash.java
// demonstrates hash table with linear probing
// to run this program: C:>java HashTableApp

import java.io.*;

////////////////////////////////////////////////////////////////
 class DataItem {                                // (could have more data)

    private int iData;               // data item (key)
    //-------------------------------------------------------------

    public DataItem(int ii) // constructor
    {
        iData = ii;
    }
    //-------------------------------------------------------------

    public int getKey() {
        return iData;
    }
    //-------------------------------------------------------------
}  // end class DataItem

////////////////////////////////////////////////////////////////
 class HashTable {

    private DataItem[] hashArray;    // array holds hash table
    private int arraySize;
    private DataItem nonItem;        // for deleted items
    // ------------------------------------------------------------

    public HashTable(int size) // constructor
    {
        arraySize = size;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1);   // deleted item key is -1
    }
    // ------------------------------------------------------------

    public void displayTable() {
        System.out.print("Table: ");
        for (int j = 0; j < arraySize; j++) {
            if (hashArray[j] != null) {
                System.out.print(hashArray[j].getKey() + " ");
            } else {
                System.out.print("** ");
            }
        }
        System.out.println("");
    }
    // ------------------------------------------------------------

    public int hashFunc(int key) {
        return key % arraySize;       // hash function
    }
    // ------------------------------------------------------------

    public void insert(DataItem item) // insert a DataItem
    // (assumes table not full)
    {
        int key = item.getKey();      // extract key
        int hashVal = hashFunc(key);  // hash the key
        // until empty cell or -1,
        while (hashArray[hashVal] != null
                && hashArray[hashVal].getKey() != -1) {
            ++hashVal;                 // go to next cell
            hashVal %= arraySize;      // wraparound if necessary
        }
        hashArray[hashVal] = item;    // insert item
    }  // end insert()
    // ------------------------------------------------------------

    public DataItem delete(int key) // delete a DataItem
    {
        int hashVal = hashFunc(key);  // hash the key
        while (hashArray[hashVal] != null) // until empty cell,
        {                               // found the key?
            if (hashArray[hashVal].getKey() == key) {
                DataItem temp = hashArray[hashVal]; // save item
                hashArray[hashVal] = nonItem;       // delete item
                return temp;                        // return item
            }
            ++hashVal;                 // go to next cell
            hashVal %= arraySize;      // wraparound if necessary
        }
        return null;                  // can't find item
    }  // end delete()
    // ------------------------------------------------------------

    public DataItem find(int key) // find item with key
    {
        int hashVal = hashFunc(key);  // hash the key
        while (hashArray[hashVal] != null) // until empty cell,
        {                               // found the key?
            if (hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];   // yes, return item
            }
            ++hashVal;                 // go to next cell
            hashVal %= arraySize;      // wraparound if necessary
        }
        return null;                  // can't find item
    }
    // ------------------------------------------------------------
}  // end class HashTable

////////////////////////////////////////////////////////////////
 class HashTableApp {

    public static void main(String[] args) throws IOException {
        DataItem aDataItem;
        int aKey, size, n, keysPerCell;
        System.out.print("Enter size of hash table: ");
        size = getInt();
        System.out.print("Enter initial number of items: ");
        n = getInt();
        keysPerCell = 10;
        // make table
        HashTable theHashTable = new HashTable(size);
        for (int j = 0; j < n; j++) // insert data
        {
            aKey = (int) (java.lang.Math.random()
                    * keysPerCell * size);
            aDataItem = new DataItem(aKey);
            theHashTable.insert(aDataItem);
        }
        while (true) // interact with user
        {
            System.out.print("Enter first letter of ");
            System.out.print("show, insert, delete, or find: ");
            char choice = getChar();
            switch (choice) {
                case 's':
                    theHashTable.displayTable();
                    break;
                case 'i':
                    System.out.print("Enter key value to insert: ");
                    aKey = getInt();
                    aDataItem = new DataItem(aKey);
                    theHashTable.insert(aDataItem);
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    aKey = getInt();
                    theHashTable.delete(aKey);
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    aKey = getInt();
                    aDataItem = theHashTable.find(aKey);
                    if (aDataItem != null) {
                        System.out.println("Found " + aKey);
                    } else {
                        System.out.println("Could not find " + aKey);
                    }
                    break;
                default:
                    System.out.print("Invalid entry\n");
            }  // end switch
        }  // end while
    }  // end main()
    //-------------------------------------------------------------

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    //-------------------------------------------------------------

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }
    //------------------------------------------------------------

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
    //-------------------------------------------------------------
}  // end class HashTableApp
 ////////////////////////////////////////////////////////////////

```
