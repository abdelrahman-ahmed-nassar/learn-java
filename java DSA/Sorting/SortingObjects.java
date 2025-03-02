/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa;

/**
 *
 * @author aanassar
 */
public class Person {

    private String lastName;
    private String firstName;
    private int age;
    //----------------------------------------------------------

    public Person(String last, String first, int a) {                               // constructor
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

////////////////////////////////////////////////////////////////
 class ArrayInOb {

    private Person[] a;               // ref to array a
    private int nElems;               // number of data items
    //-------------------------------------------------------------

    public ArrayInOb(int max) // constructor
    {
        a = new Person[max];               // create the array
        nElems = 0;                        // no items yet
    }
    //-------------------------------------------------------------
// put person into array

    public void insert(String last, String first, int age) {
        a[nElems] = new Person(last, first, age);
        nElems++;                          // increment size
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
            Person temp = a[out];       // remove marked person
            in = out;                   // start shifting at out
            while (in > 0
                    && // until smaller one found,
                    a[in - 1].getLast().compareTo(temp.getLast()) > 0) {
                a[in] = a[in - 1];         // shift item to the right--in;                    // go left one position
            }
            a[in] = temp;               // insert marked item
        }  // end for
    }  // end insertionSort()
    //-------------------------------------------------------------
}  // end class ArrayInOb
 ///////////////////////////////////////////////////////////////
