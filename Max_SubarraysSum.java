public class Max_SubarraysSum {

    // Basic approach - Brute Force
    public static void maxSubarraySum(int numbers[]){
        // int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){      // to find the starting of the array
            int start = i;
            for(int j=i; j<numbers.length; j++){  // to find the ending of the array
                int end = j;
                int currSum = 0;
                for(int k=start; k<=end; k++){    // to print elements between starting and ending of the array
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Subarray Sum = "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxSubarraySum(numbers);
    }
}
