import java.util.*;

public class Hashing2 {
    public static void main(String[] args) {
/*      
    In java, HashMap is a class which implements the Map interface which allows us to store the data in the
    form of key - value pair, where keys should be unique.
    This class is found in java util package  
    It is unordered data structure
 */        
        HashMap <String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("China", 150);
        map.put("USA" , 50);

        System.out.println(map.size());

        System.out.println(map);

        map.put("China", 200);
        System.out.println(map);

        // Search 
        if(map.containsKey("China")){
            System.out.println("Key is present in the map");
        }else{
            System.out.println("Key is not present in the map");
        }

        // To get the value of the key
        System.out.println(map.get("China"));   // Key exists
        System.out.println(map.get("Indonesia")); // key not exits

 
        // Iteration on Hashmaps using entrySet
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Iteration on hashmaps using Set of keys
        Set <String> keys = map.keySet(); 

        for (String k : keys) {
            System.out.println("keys = "+k+" values = "+map.get(k));
        }

        // Remove
        // System.out.println(map.remove("China"));     // It also returns the value of the removed key
        // System.out.println(map);

        // // Clear()
        // map.clear();

        // // isEmpty()
        // System.out.println(map.isEmpty());



        // LinkedHashmap maintains the order of the keys values   It internally uses the doubly linked list
        LinkedHashMap <String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("USA", 50);

        System.out.println(lhm);


/*      TreeMap stores the data based on the sorted keys
        It internally uses the Red black trees (a type of BST) or self balancing trees
        
        put, get, remove  :- complexity O(logn)
*/
        TreeMap <String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("Indonesia", 50);
        tm.put("USA", 90);

        System.out.println(tm);

    }
}
