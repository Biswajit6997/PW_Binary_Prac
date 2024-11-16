import java.util.*;

public class ArrayListEg {

    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(400);
        System.out.println(al1);


        ArrayList al2=new ArrayList();
        al2.add(100);
        al2.add("Pw skills");
        al2.add("a");
        al2.add(200);
        System.out.println(al2);
        al2.add(1.1);
        System.out.println(al2);


        ArrayList al3=new ArrayList<>();
        al3.add(100);
        al2.add(200);
        al3.add(400);
        al3.addAll(al2);
        System.out.println(al3);
        System.out.println("..............................");
        al3.add(3,"Biswajit");//[100, 400, 100, Biswajit, Pw skills, a, 200, 1.1, 200]
        System.out.println(al3);
        




    }
}