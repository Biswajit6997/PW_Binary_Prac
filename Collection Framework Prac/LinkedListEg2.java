import java.util.LinkedList;

public class LinkedListEg2 {
    public static void main(String[] args) {
        LinkedList ll1=new LinkedList();
        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        ll1.add(400);
        ll1.add(400);
        System.out.println(ll1);

        System.out.println(ll1.get(1));
        System.out.println(ll1.indexOf(300));

        System.out.println(ll1.lastIndexOf(400));
        System.out.println(ll1.getFirst());
        ll1.push(10);
        System.out.println(ll1);
        
        System.out.println(ll1.pop());
        // Some methods
        System.out.println(".........................................................................");


        System.out.println(ll1.get(1));
        System.out.println(ll1.indexOf(400));
        System.out.println(ll1.lastIndexOf(400));
        System.out.println(ll1.getFirst());








    }
}
