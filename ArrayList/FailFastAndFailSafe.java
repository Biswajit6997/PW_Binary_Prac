import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndFailSafe {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);

        Iterator itr = al.iterator();

        // Fail fast
        while (itr.hasNext()) {
            System.out.println(itr.next());
            // al.add(100);

        }
// fail Safe
        CopyOnWriteArrayList alt=new CopyOnWriteArrayList<>();
        alt.add(10);
        alt.add(20);
        alt.add(30);
        alt.add(40);
        System.out.println(alt);
        Iterator it1=alt.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
            alt.add(100);//here we cannot add 100 but run with any fail safe
            
        }


    }
}
