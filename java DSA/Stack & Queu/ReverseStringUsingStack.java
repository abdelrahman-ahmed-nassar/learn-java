/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa;

/**
 *
 * @author aanassar
 */
class StackX {

    private int maxSize;
    private char[] stackArray;
    private int top;
    //-------------------------------------------------------------

    public StackX(int max) // constructor
    {
        maxSize = max;
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
    //-------------------------------------------------------------
}  // end class StackX

////////////////////////////////////////////////////////////////



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
