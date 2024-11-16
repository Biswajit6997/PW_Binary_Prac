//  HashSet and LinkedHashSet in Java 


// HashSet -->hashing --> HashTable -->  Order of Insertion is Not Preserved --> defalut --> 16 

// LinkedHashSet --> Hashing DS --> Order of Insertion is Preserved

import java.util.*;

public class HashSet_LinkedHashSet {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add(100);
        hs.add(25);
        hs.add(75);
        hs.add(200);
        System.out.println(hs);// [100, 200, 25, 75]


        LinkedHashSet hs1=new LinkedHashSet();
        hs1.add(100);
        hs1.add(25);
        hs1.add(75);
        hs1.add(200);
        System.out.println(hs1);// [100, 200, 25, 75]


    }
    
}
