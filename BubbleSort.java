public class BubbleSort {
    // In bubble sort, we push the largest element at the end by swapping with adjacent elements
    // in each iteration  TC = O(n^2)
    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    // In Selection sort, we extract the smallest element and keep at the starting of the array
    // one swap per one iteration    TC = O(n^2)
    public static void selectionSort(int arr[]){
        // Outer loop = it runs n-1 times
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


    // In Insertion sort, we divide the array into two parts sorted and unsorted.
    // Then we pick the element from unsorted and keep the element in the correct position in sorted part
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        // bubbleSort(arr);
        selectionSort(arr);
        printArray(arr);
    }
}
