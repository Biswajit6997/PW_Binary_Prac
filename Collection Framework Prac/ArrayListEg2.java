import java.util.ArrayList;
import java.util.List;

public class ArrayListEg2 {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);
        System.out.println(al1.contains(200));
        System.out.println(al1.indexOf(200));
        System.out.println(al1.size());
        al1.clear();// To clear the arralist

        System.out.println(al1);

        //////////////////////////////////////////
        List a1=new ArrayList();
        a1.add(100);
        a1.add(200);
        System.out.println(a1);



    }
}
