import java.util.*;

// Intersection of 2 arrays :- Total number of common elements from both the arrays     O(n+m)
public class Intersection_2_Arrays {
    public static int intersection(int arr1[], int arr2[]) {
        HashSet <Integer> set = new HashSet<>();
        int count = 0;
        for(int element : arr1){
            set.add(element);
        }

        for(int element : arr2){
            if(set.contains(element)){
                count++;
                System.out.print(element+" ");
                set.remove(element);
            }
        }

        return count;
    }
    public static void main(String[] args) {
        // int arr1[] = {7,3,9};
        // int arr2[] = {6,3,9,2,9,4};
        int arr1[] ={1,4,3,2,5,8,9};
        int arr2[] ={6,3,2,7,5};
        
        System.out.println(intersection(arr1, arr2));
    }
}
