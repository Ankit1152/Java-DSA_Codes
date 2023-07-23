// ArrayList is a inbuilt linear dataStructure in java which stored the data in a linear fashion. 
// Collections :- Class    Collection :- Interface


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {
    public static void swap(ArrayList <Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,temp);

        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList <>();

        // Add elements O(1)
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);          // [10, 20, 30, 40]

        //  Get elements O(1)
        int element = list.get(0);
        System.out.println(element);       // 10

        // add element in between  O(n) 
        list.add(2,25);
        System.out.println(list);          //  [10, 20, 25, 30, 40]

        // Set element O(n)
        list.set(0,35);
        System.out.println(list);          // [35, 20, 25, 30, 40]


        // Print Reverse of an ArrayList    O(n)
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");   // 40 30 25 20 35
        }
        System.out.println();



        // Maximum in an ArrayList    O(n)
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            max = Math.max(max, list.get(i));
        }
        System.out.println("Maximum value is "+max);



        // delete element O(n)
        System.out.println(list.remove(3)); // 30
        System.out.println(list);          // [35, 20, 25, 40]

        // size
        int size = list.size();
        System.out.println(size);          // 4

        //  Loops
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");   // 35 20 25 40
        }
        System.out.println();

        // using foreach loop
        for (Integer value : list) {
            System.out.print(value+" ");         //  35 20 25 40
        }
        
        System.out.println();

        //  Using Iterator in Collections class
        Iterator <Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");    //  35 20 25 40
        }

        System.out.println();

        // Sorting
        Collections.sort(list);                // Ascending Order       
        System.out.println(list);              //  [20, 25, 35, 40]
        
                              // Comparator :- It's a function in java which defines the way of sorting logic 
        Collections.sort(list,Collections.reverseOrder());  // Descending Order
        System.out.println(list);

        // addAll()        Add all the elements of the list in the current list
        List <Integer> newList = new ArrayList<>();       // Creation of another list
        newList.add(100);
        newList.add(200);
        list.addAll(newList);
        System.out.println(list);                    //  [20, 25, 35, 40, 100, 200]

        //  removes the value directly from the list
        list.remove(Integer.valueOf(200));
        System.out.println(list);                    //  [20, 25, 35, 40, 100]

         // contains()  it returns true or false
        System.out.println(list.contains(100));     // true

        //  clear() the list
        list.clear();
        System.out.println(list);                    // []

        // Swap two values at index 1 and 3
        list.add(9);
        list.add(7);
        list.add(10);
        list.add(15);
        list.add(6);

        int index1 = 1;
        int index2 = 3;
        System.out.println(list);
        swap(list,index1,index2);

    }
}
