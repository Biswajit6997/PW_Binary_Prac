import java.util.TreeSet;

public class TreeSetEg {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(125);
        ts.add(500);
        ts.add(200);
        ts.add(20);
        System.out.println(ts);
        System.out.println(ts.higher(50));
        System.out.println(ts.lower(50));


        System.out.println(ts.ceiling(50));
        System.out.println(ts.floor(50));


    }
}
