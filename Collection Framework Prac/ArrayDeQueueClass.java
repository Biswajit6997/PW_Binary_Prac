import java.util.ArrayDeque;

public class ArrayDeQueueClass {
    public static void main(String[] args) {
        ArrayDeque ad1=new ArrayDeque<>();

        ad1.add(100);
        ad1.add(200);
        ad1.add(300);
        System.out.println(ad1);
        ad1.addFirst(10);
        ad1.addLast(20);
        System.out.println(ad1);

        ad1.add("PW");

        System.out.println(ad1);
        ad1.offer(256);
        ad1.offerFirst(101);
        ad1.offerLast(201);
        System.out.println(ad1);

    }
}
