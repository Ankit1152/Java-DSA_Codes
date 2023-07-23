import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hashing {
    public static void main(String[] args) {
/*      Hashing in java is the technique that enables us to store the data in the form of key-value pairs,
        by modifying the original key using the hash function so that we can use these modified keys as
        the index of an array and store the associated data at that index location in the Hash table for
        each key.

        It stores unique elements, unordered and null value is allowed 

        Hashset is internally implemented in the form of hashmap
*/
        HashSet <Integer> set = new HashSet<>();
        // Add elements
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(5);
        set.add(1);

        // set.add("Delhi");
        // set.add("Mumbai");
        // set.add("Kolkata");
        // set.add("Chennai");


        System.out.println(set.size());
        System.out.println(set);

        // Search
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }

       // Remove
        set.remove(1);

        if(!set.contains(1)){
            System.out.println("Set does not contain 1");
        }

        Iterator <Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }



        /* Linked HashSet:-Linked hashset is similar to linked hashmap .Linked HashMap is used to implement the 
           linked HashSet. It maintains the order of insertion using Doubly linked list. Null values are allowed
           Performance :- LHM < HM
                          LHS < HS

        */ 
        LinkedHashSet <String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Kolkata");
        lhs.add("Chennai");

        System.out.println(lhs);



        /* TreeSet :- TreeSet is internally imlemented in the form of TreeMap.
           Sorted in ascending order. Null values are not allowed. 
           TreeSet is less optimized as compare to HashSet, LinkedHashmap because the Time Complexity of TreeSet is 
           O(logn) in insert, remove and other operation
           All function of the hashset is present in the TreeSet and LinkedHashset
        */
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Kolkata");
        ts.add("Chennai");

        System.out.println(ts);
    }
}
