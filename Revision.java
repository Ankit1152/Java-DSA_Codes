public class Revision {
    // Convert Binary to Decimal....
    public static void binToDec(int binNum){
        int pow = 0;
        int decNum = 0;    
        while (binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println(decNum);
    }




    // Convert Decimal to Binary....
    public static void decToBin(int decNum){
        int pow = 0;
        int binNum = 0;

        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + (rem *(int) Math.pow(10,pow));
            pow++;
            decNum = decNum / 2;
        }

        System.out.println(binNum);
    }




    // To check a number is prime or not
    public static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


    // Primes in Range.....
    public static void primesInRange(int n){
        for(int i=2; i <= n; i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }


    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }else{
            return false;
        }
    }






    
    public static void inverted_rotated_half_pyramid(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    

    public static void hollow_Rectangle(int rows, int columns){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=columns; j++){
                if(i == 1 || i == rows || j == 1 || j == columns){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void printSubarray(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }



    // Largest And Smallest Value in the Array...
    public static void getLargestSmallest(int numbers[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
            if(numbers[i]<min){
                min  = numbers[i];
            }
        }
        System.out.println("Largest Value = "+max);
        System.out.println("Smallest element in the Array is : "+min);
    }



    // Binary Search
    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int last = numbers.length - 1;

        while (start <= last) {
            int mid = (start + last)/2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid + 1;
            }else{
                last = mid - 1;
            }
        }
        return -1;
    }
    


    // Reverse an array...
    public static void reverse(int numbers[]){
        int start = 0;
        int end = numbers.length - 1;

        while(start < end){
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;
        }
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
    }


    // Print Pairs in the Array
    public static void printPairs(int numbers[]){
        int tp = 0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
            System.out.print("("+numbers[i]+","+numbers[j]+")");
            tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs = "+tp);
    }

    // print subarrays
    public static void printSubarrays(int numbers[]){
        int ts = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays = "+ts);
    }
   

    public static void bruteForce(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                int currSum = 0;
                for(int k=start; k<=end; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum sum of subarrays = "+maxSum);
    }


    public static void kadanes(int numbers[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            cs += numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
            // System.out.println(ms);
        }
        System.out.println("Maximum subarray sum = "+ms);
    }

    // public static int trappedRainwater(int height[]){
    //     // 1. For each bar we calculate left max bar 
    //     int n = height.length;
    //     int leftmax [] = new int [n]; 
    //     leftmax[0] = height[0];
    //     for(int i=1; i<n; i++){
    //         leftmax[i] = Math.max(height[i] , leftmax[i-1]);
    //     }    
    //     // 2. For each bar we calculate right max bar
    //     int rightmax [] = new int [n];
    //     rightmax[n-1] = height[n-1];
    //     for(int i=n-2; i>=0; i--){
    //         rightmax[i] = Math.max(rightmax[n-1], height[n-1]);
    //     } 

    //     // 3. Loop
    //     int trappedwater = 0;
    //     for(int i=0; i<n; i++){
    //         int waterlevel = Math.min(leftmax[i] , rightmax[i]);
    //         trappedwater += waterlevel - height[i];
    //     }

    //     return trappedwater;
    // }
    public static void main(String[] args) {
        // binToDec(101);
        // decToBin(15);
        // System.out.println(isPrime(131));
        // primesInRange(100);
        // System.out.println(isEven(17));
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        // bruteForce(numbers);
        kadanes(numbers);
        // printSubarrays(numbers);
        // reverse(numbers);
        // int key = 8;
        // System.out.println("Key value at index "+binarySearch(numbers, key));
        // getLargestSmallest(numbers);
        // printSubarray(numbers);
    }

}
