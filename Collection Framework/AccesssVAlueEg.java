
import java.util.*;
import java.util.Map.*;

public class AccesssVAlueEg {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "Rohan");// Entry
        map.put(2, "Rohit");
        map.put(3, "Rahul");
        map.put(4, "Ramesh");

        System.out.println(map); 

        System.out.println(map.get(4));// Ramesh

        Set keySet = map.keySet();// return keys
        Iterator itr1 = keySet.iterator();
        while (itr1.hasNext()) {
            // System.out.println(itr1.next());
            Integer key=(Integer)itr1.next();
            System.out.println(key);

        }

        Collection values = map.values();// return the values
        Iterator itr2 = values.iterator();
        while (itr2.hasNext()) {
            // System.out.println(itr2.next());
            String it=(String)itr2.next();
            System.out.println(it);

        }

        Set en = map.entrySet();// return both value and keys
        Iterator itr3 = en.iterator();
        while (itr3.hasNext()) {
            // System.out.println(itr3.next());
            Entry data=(Entry)itr3.next();
            System.out.println(data.getKey()+ " : " +data.getValue());

        }

       

       
    }

}
