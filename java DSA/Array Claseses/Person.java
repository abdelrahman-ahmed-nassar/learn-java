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
}  // end c
