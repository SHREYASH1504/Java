import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* 
   Map -> 1. HashMap O(1)
          2. TreeMap O(logn)
          3. EnumMap 
          4. LinkedHashMap o(n)
          5. WeakHashMap
*/


public class MapBasics {
    public static void main(String[] args) {
        
        // Map implementation using HashMap
        // Map<Key, value> numbers = new HashMap<>();
        // Keys are unique values associated with individual values
        // A map cannot contain duplicate keys
        
        Map<String, String> mp = new HashMap<>();
        
        // insertion
        mp.put("in", "India");
        mp.put("en", "England");
        mp.put("us", "United States");
        mp.put("in", "India2");
        System.out.println(mp);

        Map<String, String> mp2 = new HashMap<>();
        mp2.put("br", "Brazil");

        System.out.println("Before : " + mp2);
        mp2.putAll(mp);
        System.out.println("After: " + mp2);

        // deletion
        mp2.remove("en");
        System.out.println(mp2);

        System.out.println(mp2.size());
        // mp2.clear();
        // System.out.println(mp2.size());

        // putIfAbsent()
        mp2.putIfAbsent("is", "india3");
        System.out.println(mp2);

        // getOrDefault
        System.out.println(mp2.getOrDefault("us", "NONE"));
        System.out.println(mp2.getOrDefault("usa", "NONE"));

        // containsKey()
        System.out.println(mp2.containsKey("in"));

        // containsValue()
        System.out.println(mp2.containsValue("United States of America"));

        // replace(K, V) - replace the value of key K with new specified value V
        System.out.println(mp2);
        mp2.replace("is", "Indonesia");
        System.out.println(mp2);

        // replace(K, oldValue, newValue) - replaces the value of the key with the new value only if the key K is associated with the value oldValue
        mp2.replace("is", "Indonesia", "Isarel");
        System.out.println(mp2);

        // remove(K) - removes the entry form the map represented by the key K


        // remove(K, V) - removes the entry from the map that has key K associated with the value V


        // keySet() - return a set of all the keys present in a map
        Set<String> keyset = mp2.keySet();
        System.out.println("Keys: " + keyset);

        // values() - returns a collection of all the values present in a map
        Collection<String> valueSet = mp2.values();
        System.out.println("Values: " + valueSet);

        // entrySet() - returns a set of all the key/value mapping present in a map
        Set<Map.Entry<String, String>> entrySet= mp2.entrySet();
        System.out.println("Printing Entries: " + entrySet);

        // Iterating over a map
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}
