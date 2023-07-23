import java.util.*;
public class Union_2_Arrays {

    // Union of 2 Arrays    O(n+m)    :- Total number of unique and common elements after combining two sets or arrays
    public static int union_2_Arrays(int arr1[],int arr2[]){    
        HashSet <Integer> set = new HashSet<>();

        for(int val : arr1){
            set.add(val);
        }

        for(int val : arr2){
            set.add(val);
        }
        for (int val : set) {
            System.out.println(val);
        }
        
        return set.size();
    }       
    public static void main(String[] args) {
        int arr1[] = {7,3,9};  
        int arr2[] = {6,3,9,2,9,4};
        System.out.println("Total unique elments = "+union_2_Arrays(arr1,arr2));
    }
}
