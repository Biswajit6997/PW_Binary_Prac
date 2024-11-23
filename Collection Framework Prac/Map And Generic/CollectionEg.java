import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection.*;

public class CollectionEg {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add(10);
        al.add(100);
        al.add(1450);
        al.add(5);
        al.add(50);
        al.add(70);
        
        System.out.println(al);
        Collections.sort(al);
        System.out.println("After sorting...");
        System.out.println(al);


        ////////////////////
        ArrayList al2=new ArrayList<>();
        al2.add("Biswajit");
        al2.add("Amit");
        al2.add("Rabin");
        al2.add("Rahul");
        al2.add("Tina");
        al2.add("Susmita");
        System.out.println(al2);
        Collections.sort(al2);

        System.out.println("After sorting...");
        System.out.println(al2);

        System.out.println("---------------------------");
        ArrayList al3=new ArrayList<>();
        al3.add(10);
        al3.add(20);
        al3.add(30);
        al3.add(40);
        al3.add(50);
       
        System.out.println(al3);
        // Binary Search Methods --> If number not present in the arraylist it will print negative value
        int idx=Collections.binarySearch(al3, 30);
        System.out.println(idx);//2
        // Rotate the arrraylist
        Collections.rotate(al3, 3);
        System.out.println(al3);
        // suffle the arraylist--> Randomly suffle
        Collections.shuffle(al3);
        System.out.println(al3);
        
        // Frequency
        System.out.println(Collections.frequency(al3, 20));
    }
}
