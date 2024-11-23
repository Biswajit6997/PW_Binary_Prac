/*
 HashTable and TreeMap
 */

import java.util.Hashtable;
import java.util.TreeMap;

public class Map4 {
    public static void main(String[] args) {
        Hashtable hs=new Hashtable<>();
        hs.put(1, "Rohit");
        hs.put(2  , "Rahul");
        hs.putIfAbsent(4, "Biswajit");
        hs.put(3, "Sourav");
        System.out.println(hs);


        // TreeMap  --> Accending Order Maintain
        

        TreeMap tm=new TreeMap<>();
        tm.put(1, "A");
        tm.put(2, "B");
        tm.put(3, "C");
        System.out.println(tm);

    }
}
