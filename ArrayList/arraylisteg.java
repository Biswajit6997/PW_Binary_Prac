
// video 216
// ?ArrayList
import java.util.ArrayList;

public class arraylisteg {

    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(400);
        System.out.println(al1);//[100, 200, 300, 400]


        ArrayList al2=new ArrayList<>();
        al2.add("Biswajit");
        al2.add(10);
        al2.add("rahul");
        al2.add(4.4);
        al2.add("pw java");
        System.out.println(al2);//[Biswajit, 10, rahul, 4.4, pw java]


        ArrayList al3=new ArrayList<>();
        al3.add("Biswajit");
        al3.add("java");
        al3.add(500);
        al3.addAll(al2);//add all the collection of al2
        System.out.println(al3);//[Biswajit, java, 500, Biswajit, 10, rahul, 4.4, pw java]


        ArrayList al4=new ArrayList<>();
        al4.add("b");
        al4.add("i");
        al4.add("s");
        al4.add("w");
        al4.add("a");
        // al4.addAll(2, PWSkills);
        System.out.println(al4);//[b, i, s, w, a]
        al4.add(3, "PW");
        System.out.println(al4);//[b, i, s, PW, w, a]






    }
}