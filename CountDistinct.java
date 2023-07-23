import java.util.HashSet;
import java.util.Scanner;

public class CountDistinct {
    public static void main(String[] args) {
        // int num[] = {4,3,2,5,6,7,3,4,2,1};
        // HashSet <Integer> set = new HashSet<>();

        // // O(n)
        // for (Integer value : num) {
        //     set.add(value);
        // }

        // System.out.println("Total unique elements = "+set.size());

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // System.out.println(isPrime(n));
        // System.out.println(factorial(n));
        // int arr[] = {10,20,30,40,50,60};
        // reverse(arr);
            // System.out.println(binarySearch(arr, 50));
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }

        // System.out.println(reverseNumb(n));
    }

    // public static boolean isPrime(int n){
    //     if(n == 2){
    //         return true;
    //     }

    //     for(int i=2; i<n; i++){
    //         if(n % i == 0){
    //             return false;
    //         } 
    //     }
    //     return true;
    // }

        // public static int factorial(int n){

        //     if(n == 0 || n == 1){
        //         return 1;
        //     }
            
        //     int fact = 1;
        //     for(int i=2; i<=n; i++){
        //         fact *= i;
        //     }
        //     return fact;
        // }


        // public static void reverse(int arr[]){
        //     int first = 0;
        //     int last = arr.length - 1;

        //     while (first < last) {
        //         int temp = arr[last];
        //         arr[last] = arr[first];
        //         arr[first] = temp;

        //         first++;
        //         last--;
        //     }
        // }


            // public static int binarySearch(int arr[], int key){
            //     int start = 0;
            //     int end = arr.length - 1;

            //     while (start <= end) {
            //         int mid = (start+end)/2;

            //         if(arr[mid] == key){
            //             return mid;
            //         }else if(arr[mid] < key){
            //             start++;
            //         }else{
            //             end--;
            //         }
            //     }
            //     return -1;
            // }


        // public static int reverseNumb(int n){
        //     int reverse = 0;

        //     while(n > 0){
        //         int lastDigit = n % 10;
        //         reverse = reverse * 10 + lastDigit;
        //         n = n/10;
        //     }
        //     return reverse;
        // }   
}
