import java.util.Arrays;
import java.util.Collections;

public class BasicSorting {
    // Bubble Sort:- It is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements
    //  if they are in the wrong order.This algorithm is not suitable for large data sets 
    // as its average and worst-case time complexity is quite high.

    public static void bubbleSort(Integer arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void printArray(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer arr[] = {5,1,4,3,2};
        // bubbleSort(arr);
        // Arrays.sort(arr);    // Inbuilt Sort
        // printArray(arr);
        Arrays.sort(arr,0,3);    // 1 4 5 3 2
        // printArray(arr);

        // Arrays.sort(arr,Collections.reverseOrder());  // Decreasing order
        // printArray(arr);   

        // Arrays.sort(arr,0,3,Collections.reverseOrder());
        // printArray(arr);
    }
}
