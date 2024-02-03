import java.util.ArrayList;

public class ArrayListeg2 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList<>();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(400);
        System.out.println(al1.contains(200));// true
        System.out.println(al1.indexOf(300));// 2
        System.out.println(al1.size());// 4
        al1.ensureCapacity(10);// min capacity
        al1.trimToSize();
        System.out.println(al1.size());// 4

        // al1.clear();//clear the all object
        System.out.println(al1);//[]
    }
}
