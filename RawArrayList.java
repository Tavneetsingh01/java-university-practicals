import java.util.ArrayList;
public class RawArrayList {
    public static void main(String[] args) {
        // Declaration of raw array list
        ArrayList Arrl1 = new ArrayList();

        // Assigning values to this raw array list;
        Arrl1.add(5); // Here we are providing it with value 5  which is of primitive data type Int But Arraylist only
        // takes array of objects. so, here the .add() function automatically converts this primitive data type to an
        // object by using an Integer wrapper function Internally.
        // Here the integer wrapper function is used internally because here the primitive data type passed to the
        // .add() function  is of type Integer here.
        // This whole phenomena of automatically converting primitive data type to an object is called Autoboxing.

        // Creating Integer object and Float Object
        Integer InOb1 = new Integer(6);
        Float FlOb1 = new Float(0.7F);

        // Adding objects to the ArrayList Arrl1
        Arrl1.add(InOb1);
        Arrl1.add(FlOb1);

        // This gives us all the elements present in Raw Array List
        System.out.println("Values Contained in Raw Array List are: "+Arrl1+"\n");

        // Now if we want to get particular element from Raw Array list we need to know its data type
        // at what location which type of data is stored in Raw Array List.
        // so that we can do its Typecasting and extract Dta from our Raw Array List.
        // here as we know that at first 2 location/Indexes integer type of objects(data) are stored and at
        // Third and Last the object (data) of type float is stored.
        Integer Ind1 = (Integer) Arrl1.get(0);
        Integer Ind2 = (Integer) Arrl1.get(1);
        Float Fld1 = (Float) Arrl1.get(2);
        // Here in above lines Ind1 , Ind2 contains the integer values contained at index 0 and 1 respectively
        // of the Raw ArrayList Arrl1 and Fld1 contains the Float type data Contained at index 2 of the
        // Raw ArrayList Arrl1.

        System.out.println("Value at Index 0 of Raw ArrayList Arrl1 is: " + Ind1);
        System.out.println("Value at Index 1 of Raw ArrayList Arrl1 is: " + Ind2);
        System.out.println("Value at Index 2 of Raw ArrayList Arrl1 is: " + Fld1);

    }

}
