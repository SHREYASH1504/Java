import java.util.*;


public class JCF {
    static void main() {

        // Interface    Concrete class
        // List   ->    1. ArraytList
        //              2. LinkedList   
        //              3. Stack
        //              4. Vector

        // ways of creating ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        // List<Integer> list = new ArrayList<>();
        // Collection<Integer> list = new ArrayList<>();

        // add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        // remove
        list.remove(0); // give index here
        System.out.println(list);

        // addAll
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(103);
        
        list.addAll(list2);
        System.out.println(list);
        System.out.println(list.size());
        
        // removes all element form that ArrayList
        list2.clear();
        System.out.println(list2.size());

        // iterator - returns an iterator to access elements of the collection
        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        // get
        System.out.println(list.get(2));

        // set
        list.set(0, 100);
        System.out.println(list);

        // toArray
        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(13);
        list3.add(14);
        Object[] arr = list3.toArray();
        for(Object obj : arr) {
            System.out.println(obj);
        }

        // contains - is element present or not
        System.out.println(list3.contains(10));

        // sorting
        System.out.println("List Before Sorting : " + list);
        Collections.sort(list); // sort in ascending order
        System.out.println("List After Sorting Asc: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("List After Sorting Desc: " + list);
        
        // clone
        ArrayList<Integer> newList = (ArrayList<Integer>)list.clone();
        System.out.println("Printing NewList: " + newList);

        // ensureCapacity()
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100); // marks arraylist will intialially have a 100 size
        System.out.println(marks.isEmpty());

        // indexOf()
        System.out.println(list3.indexOf(14));

    }
}
