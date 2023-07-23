public class RecursionBasics {
    // Print decreasing order numbers
    public static void printDecreasing(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDecreasing(n-1);
    }
    // Print increasing order numbers
    public static void printIncreasing(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n+" ");
    }
    // Print factorial of a number
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n * fnm1;
        return fn;
    }
    // Print sum of a natural number
    public static int calcSum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = calcSum(n-1);
        int sn = n + snm1;
        return sn;
    }
    // Print Nth fibonacci number
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    // To check whether the array is sorted or not   O(n)
    public static boolean isSorted(int arr[],int i){
        // Base case
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    // first occurence of the key   O(n)
    public static int firstOccurence(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    // first occurence of the key
    public static int lastOccurence(int arr[], int key ,int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, 1+1);
        if(isFound == -1 && arr[i] == key ){
            return i;
        }
        return isFound;
    }

    // Calculate x to the power n...
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x * power(x, n-1);
    }

    // Remove duplicates from String
    public static void removeDuplicates(String str, int idx, boolean map[], StringBuilder newStr){
        // Base case 
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        // Kaam
        char currCh = str.charAt(idx);
        if(map[currCh - 'a'] == true){
            removeDuplicates(str, idx+1, map, newStr);
        }else{
            map[currCh - 'a'] = true;
            removeDuplicates(str, idx+1, map, newStr.append(currCh));
        }
    }
    public static void main(String[] args) {
        // printDecreasing(10);
        // printIncreasing(10);
        // System.out.println(factorial(5));
        // System.out.println(calcSum(5));
        // System.out.println(fib(23));
        // System.out.println(fib(24));
        // System.out.println(fib(25));
        // System.out.println(fib(26));
        // System.out.println(fib(27));
        // System.out.println(fib(28));
        // int arr[] = {1,2,3,4,5};
        // System.out.println(isSorted(arr, 0));
        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println(firstOccurence(arr, 5, 0));
        // System.out.println(power(2, 10));

        removeDuplicates("appnnaacollege", 0, new boolean[26], new StringBuilder());
    }
}
