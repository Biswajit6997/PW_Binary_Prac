// LinkedList Class In java --> Module 43

import java.util.LinkedList;

public class LinkedListClassEg {
    public static void main(String[] args) {
       LinkedList ll=new LinkedList();
       ll.add(100);
       ll.add(200);
       System.out.println(ll);
       LinkedList ll2=new LinkedList<>();

       ll2.add("Pw");
       ll2.add(200);
       ll2.add(300);
       ll2.add(400);
       ll2.add(500);
       ll2.add("Biswajit");
       System.out.println(ll2);
       System.out.println(ll2.peek());
       System.out.println(ll2.poll());
       System.out.println(ll2);
       





    }
}
