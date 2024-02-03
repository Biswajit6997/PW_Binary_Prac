
// PriorityQueue follow Min Heap data Structure

import java.util.PriorityQueue;

public class PriorityQueueEg {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue<>();
        pq.add(25);
        
        pq.add(10);
        pq.add(100);
        pq.add(45);
        pq.add(35);
        pq.add(123);
        pq.add(435);
        pq.add(25);
        // pq.add("pw");
        System.out.println(pq);//[10, 25, 100, 45, 35, 123, 435]
    }
}
