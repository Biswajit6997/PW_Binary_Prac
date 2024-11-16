/*
Iterator and ListIterator in java

Iterator -->

ListIterator --> 
 
 */

import java.util.*;
import java.util.Iterator;

public class Iterator_ListIterator {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(50);
        al.add(200);
        al.add(300);
        System.out.println(al);
/* 
        // For Printing
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        System.out.println(".....................................................");
        // Using For Each Loop
        for(Object j:al){
            System.out.println(j);
        }
            */


    // Using Iterator

    Iterator itr=al.iterator();
    while (itr.hasNext()) {
        System.out.println(itr.next());
        
    }
    System.out.println("......................................................");

    // Using ListIterator

    ListIterator litr=al.listIterator(al.size());
    while (litr.hasPrevious()) {
        System.out.println(litr.previous());// Print in Reverse Order
        
    }







        
    }
}
