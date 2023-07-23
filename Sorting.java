public class Sorting {

    // Selection Sort   O(n^2)
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){ 
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr1[] = {7,8,3,1,2};
        int arr[] = {5,1,4,3,2};
        // selectionSort(arr);
        bubbleSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
