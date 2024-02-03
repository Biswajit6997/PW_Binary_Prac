import java.util.ArrayDeque;

public class ArrayDeQueueEg {
    public static void main(String[] args) {
        ArrayDeque ad=new ArrayDeque<>();
        ad.add(100);
        ad.add(200);
        ad.add(300);
        System.out.println(ad);//[100, 200, 300]
        ad.addFirst(500);
        ad.addLast(3000);
        System.out.println(ad);//[500, 100, 200, 300, 3000]

        ad.offer("PW");
        ad.offerFirst("1");
        ad.offerLast("22");
        System.out.println(ad);//[1, 500, 100, 200, 300, 3000, PW, 22]
    }
}
