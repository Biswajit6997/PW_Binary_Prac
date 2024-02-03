// Hashset and LinkedhasSet in java

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetandLinkHashSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();
        hs.add(100);
        hs.add(20);
        hs.add(400);
        hs.add(50);
        System.out.println(hs);// [400, 50, 100, 20]

        /******************************* */

        // LinkedHasSet is the combinationof linkedlist and hash table so here insertion is pre reserved
        LinkedHashSet hs1 = new LinkedHashSet<>();
        hs1.add(100);
        hs1.add(20);
        hs1.add(400);
        hs1.add(50);
        System.out.println(hs1);// [100, 20, 400, 50]

    }
}
