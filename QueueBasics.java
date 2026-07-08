import java.util.*;

public class QueueBasics {
    static void main() {

        // LinkedList implementation of Queue
        Queue<Integer> q = new LinkedList<>();

        // Array implementation of Queue
        // Queue<String> q = new ArrayQueue<>();

        // Priority Queue implementation of Queue
        // Queue<String> q = new PriorityQueue<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        // can also use 'add()' but after being unsuccessful it throws exception
        System.out.println(q);

        q.peek(); // returns head of queue 
        // can also use 'element()' but after being unsuccessful it throws exception
        System.out.println(q.peek());

        q.poll(); // returns head od queue
        // can also use 'remove()' but after being unsuccessful it throws exception
        System.out.println(q);

        /* *************************************************************************************** */
 
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offer(100);
        dq.offer(200);
        dq.offerFirst(300);
        dq.offerLast(400);
        System.out.println(dq);

        dq.pollLast();
        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq);
        
        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());


    }
}
