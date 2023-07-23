public class WaveSort {

    // Time Complexity = O(n)
    public static void waveSort(int arr[]){
        for(int i=1; i<arr.length; i+=2){
            if(arr[i] > arr[i-1]){
                swap(arr,i,i-1);
            }

            if(arr[i]>arr[i+1]  && i<arr.length-1){
                swap(arr,i,i+1);
            } 
        }
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,7,5,6,2};   // 3 1 7 4 6 2 5
        waveSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");   
        }
    }
}
