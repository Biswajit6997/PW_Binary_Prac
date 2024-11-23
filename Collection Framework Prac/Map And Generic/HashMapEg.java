// package Map And Generic;

// HashMap nad LinkedhashMap
import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapEg {
    public static void main(String[] args) {
        HashMap hs=new HashMap<>();
        hs.put(null, 10);
        hs.put(0 , "virat");
        hs.put(3, "Rohit");
        hs.put(4, "Rohan");

        System.out.println(hs);


        LinkedHashMap lhm=new LinkedHashMap<>();
        lhm.put("Biswajit", "biswa");
        lhm.put("4", "Kolhili");
        lhm.put("virat", "Kcfngjgji");
        System.out.println(lhm);
    }
}
