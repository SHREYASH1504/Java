import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// Set -> 1. HashSet
//        2. LinkedHashSet
//        3. TreeSet

public class HashSetBasics {
    public static void main(String[] args) {
        
        // Set<Integer> st = new HashSet<>(); //  O(1)
        // st.add(10);
        // st.add(20);
        // st.add(30);
        // st.add(40);
        // st.add(50);
        // st.add(50);
        // st.add(40);
        // st.add(30);
        // st.add(20);
        // st.add(10);
        // System.out.println(st);
        // elements are stored randomly and does not store duplicate elements
        // elements are stored according to their hash codes in hash function

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);

        s2.add(3);
        s2.add(4);
        s2.add(5);
        s2.add(6);

        System.out.println(s1);
        // retains all the elements in the set that are also present in another specified set
        s1.retainAll(s2); // true or throws exception
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.containsAll(s2));
        System.out.println(s2.containsAll(s1));

        // Set<Integer> st = new LinkedHashSet<>(); // O(n)
        // st.add(10);
        // st.add(20);
        // st.add(30);
        // st.add(40);
        // st.add(50);
        // st.add(50);
        // st.add(40);
        // st.add(30);
        // st.add(20);
        // st.add(10);
        // System.out.println(st); // 10 20 30 40 50 
        // here order is preserved
        // duplicate are not stored

        Set<Integer> st = new TreeSet<>(); // O(logn)
        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);
        st.add(50);
        st.add(50);
        st.add(40);
        st.add(30);
        st.add(20);
        st.add(10);
        System.out.println(st);
        // elements are stored in sorted ascending order

    }
}
