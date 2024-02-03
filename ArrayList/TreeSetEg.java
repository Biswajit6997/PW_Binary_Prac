import java.util.TreeSet;

public class TreeSetEg {
    public static void main(String[] args) {
        
        TreeSet ts=new TreeSet();
        ts.add(100);
        ts.add(40);
        ts.add(230);
        ts.add(70);
        ts.add(30);
        ts.add(24);
        ts.add(13);
        System.out.println(ts);//[13, 24, 30, 40, 100, 230]

        // ts.higher(50);
        System.out.println(ts.higher(50));
        System.out.println(ts.lower(50));


        System.out.println(ts.ceiling(30));
        System.out.println(ts.floor(30));
    }
    
}
