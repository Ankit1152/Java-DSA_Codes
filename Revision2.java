import java.util.HashSet;

public class Revision2 {
    // Maximum and Minimum Element in an Array
    public static void getMinMax(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min = arr[i];
            }

            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    // Reverse the Array
    public static void reverse(int numbers[]){
        int start = 0;
        int end = numbers.length-1;

        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
    }

    // Maximum-Subarray using Kadanes algorithm
    public static void maxSubArray(int numbers[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            cs += numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Maximum Subarray is : "+ms);
    }

    // Contains Duplicate (Brute Force)   Time Complexity = (O(n^2))
    public static boolean containsDuplicate(int a[]){
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    return true;
                }
            }
        }
        return false;
    }

    // Contains duplicate = Time complexity ( O(n) )
    public static boolean toCheckDuplicate(int arr[]){
        HashSet <Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])){
                return true;
            }else{
                set.add(arr[i]);
            }
        }
        return false;
    }
   
    public static void main(String[] args) {
        // int arr[] = {10,20,45,65};
        // getMinMax(arr);

        // int numbers[] = {12,50,45,60};
        // reverse(numbers);

        // int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        // maxSubArray(numbers);

        int a[] = {1,1,1,3,3,4,3,2,4,2};
        // System.out.println(containsDuplicate(a));
        System.out.println(toCheckDuplicate(a));

        
    }
}
