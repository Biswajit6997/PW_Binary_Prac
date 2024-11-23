
// import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map2 {
    public static void main(String[] args) {
        Map mp = new HashMap<>();
        mp.put(1, "Rohan");
        mp.put(2, "Rohit");
        mp.put(3, "Rahul");
        mp.put(4, "Ramesh");
        System.out.println(mp);

        // TO access the key with value
        System.out.println(mp.get(4));

        // To Access The Key Only

        Set keySet = mp.keySet();
        Iterator itr1 = keySet.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());

        }
        // To Accesss The Value

        Collection val = mp.values();
        Iterator itr2 = val.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());

        }
        // To Access The All Key With value

        Set allval = mp.entrySet();
        Iterator itr3 = allval.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
            // ----------OR-------

        }

        Set<Map.Entry<Integer, String>> allval1 = mp.entrySet();
        System.out.println("Key-Value Pairs:");
        for (Map.Entry<Integer, String> data : allval1) {
            System.out.println(data.getKey() + " : " + data.getValue());
        }

    }
}
