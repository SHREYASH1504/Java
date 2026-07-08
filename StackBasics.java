import java.util.*;

public class StackBasics {
    static void main() {

        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack); // [10, 20, 30]

        // Peek top element
        System.out.println("Top: " + stack.peek()); // 30

        // Pop top element
        System.out.println("Removed: " + stack.pop()); // 30

        System.out.println(stack); // [10, 20]

        // Check if empty
        System.out.println("Is Empty? " + stack.empty()); // false

        // Search element (1-based position from top)
        System.out.println("Position of 10: " + stack.search(10)); // 2

        Deque<Integer> stack2 = new ArrayDeque<>();
        stack2.push(100);
        stack2.push(200);
        stack2.push(300);
        stack2.push(400);
        System.out.println(stack2);

        stack2.pop();
        System.out.println(stack2);

        System.out.println(stack2.peek());
        System.out.println(stack2.peekFirst());
        System.out.println(stack2.peekLast());
    }
}
