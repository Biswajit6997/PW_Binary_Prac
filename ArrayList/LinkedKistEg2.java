import java.util.LinkedList;

public class LinkedKistEg2 {
    public static void main(String[] args) {
        LinkedList ll1=new LinkedList<>();
        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        ll1.add(300);
        System.out.println(ll1);

        System.out.println(ll1.get(2));//300

        System.out.println(ll1.indexOf(300));//2
        System.out.println(ll1.lastIndexOf(300));//3
        System.out.println(ll1.getFirst());//100
        System.out.println(ll1.getLast());//300

        ll1.push(500);
        System.out.println(ll1);
        // System.out.println(ll1.peek());
        System.out.println(ll1.pop());
    }
}
