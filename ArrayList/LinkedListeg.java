import java.util.LinkedList;

public class LinkedListeg {
    public static void main(String[] args) {

        LinkedList ll1=new LinkedList();
        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        System.out.println(ll1); //[100, 200, 300]


        LinkedList ll2=new LinkedList();
        ll2.add("PW");
        ll2.add(100);
        ll2.add("j");
        ll2.add("a");
        System.out.println(ll2); //[PW, 100, j, a]


       System.out.println(ll2.indexOf("j")); 
       System.out.println(ll1.getFirst());//100
       ll2.add(2,"Biswajit");
       System.out.println(ll2);//[PW, 100, Biswajit, j, a]

       System.out.println(ll2.peek());//pw
       System.out.println(ll2);  //[PW, 100, Biswajit, j, a]
       System.out.println(ll2.poll());//pw
       System.out.println(ll2);  //[100, Biswajit, j, a]






    }
}
