/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa;

/**
 *
 * @author aanassar
 */
// selectSort.java
// demonstrates selection sort
// to run this program: C>java SelectSortApp
////////////////////////////////////////////////////////////////
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
