import java.util.*;

public class PriorityQueueBasics {
    static void main() {

        // less value has higher priority -> min heap
        Queue<Integer> pq = new PriorityQueue<>(); 

        // bigger value has higher priority -> max heap
        // Queue<Integer> pq = new PriorityQueue<>((a, b) -> b-a); 
        
        pq.offer(40);
        pq.offer(50);
        pq.offer(10);
        pq.offer(8);
        System.out.println(pq);

        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);

    }
}
