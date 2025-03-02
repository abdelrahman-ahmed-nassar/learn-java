/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa;

/**
 *
 * @author aanassar
 */
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
