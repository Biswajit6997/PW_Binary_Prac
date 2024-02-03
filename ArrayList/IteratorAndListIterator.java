// Iterator and ListIterartor In java

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorAndListIterator {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add(100);
        al.add("pw");
        al.add(200);
        al.add(10);
        al.add(20);
        al.add(30);
        // System.out.println(al);
        //For loop
        // for(int i=0;i<al.size();i++){
        //     System.out.println(al.get(i));
        // }
        // Fpr each loop
        // for (Object obj : al) {
        //     System.out.println(obj);
            
        // }
        // Iterator itr=al.iterator();
        // while (itr.hasNext()) {
        //     // System.out.println(itr.next());
            
        // }

        ListIterator li=al.listIterator(al.size());
        while (li.hasPrevious()) {
            System.out.println(li.previous());// reverse output
            
        }
        
            
        
    }
    
}
