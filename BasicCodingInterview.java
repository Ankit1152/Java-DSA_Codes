import java.util.*;
import java.util.Arrays;

public class BasicCodingInterview {

    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }


    public static int calculateFactorial(int n) {
        int fact = 1;
        for(int i=2; i<=n; i++){
            fact *= i;
        }
        return fact;
    }


    public static void getMatchingElements(int arr[]){
        HashSet <Integer> set = new HashSet<>();
        for (int val : arr) {
            boolean result = set.add(val);
            if (result == false) {
                System.out.print(val+" ");
            } 
        }
    }


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
    }

    public static void main(String[] args) {
        // Q1. Count vowels and strings
        // String str = new Scanner(System.in).next();
        // str = str.toLowerCase();
        // int vowels = 0, consonants = 0;
        // for(int i=0; i<str.length(); i++){
        //     if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
        //         vowels++;
        //     }else{
        //         consonants++;
        //     }
        // }

        // System.out.println("Vowels :"+vowels);
        // System.out.println("Consonants "+ consonants);



        
        // Q2 find sum of any n numbers given by user
        // int n = new Scanner(System.in).nextInt();
        // int sum = 0;
        // int arr[] = new int[n];
        // for(int i=0; i<n; i++){
        //     arr[i] = new Scanner(System.in).nextInt();
        // }
        // for(int i=0; i<n; i++){
        //     sum = sum+arr[i];
        // }
        // System.out.println(sum);




        // Q3. Palindrome Number
        // int n = new Scanner(System.in).nextInt();
        // int temp = n;
        // int reverse = 0;
        // while(n > 0){
        //     int lastDigit = n % 10;
        //     reverse = reverse * 10 + lastDigit;
        //     n = n/10;
        // }
        // if(reverse == temp){
        //     System.out.println("palindrome");
        // }else{
        //     System.out.println("Not palindrome");
        // }




        // Q4. Swapping two number without third variable
        // int a = 10;
        // int b = 20;
        
        // System.out.println("Before swapping:");
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);
        
        // Swapping without third variable
        // a = a + b;
        // b = a - b;
        // a = a - b;
        
        // System.out.println("After swapping:");
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);



        // Q5. Palindrome String or not
        // String str = "madam";
        // System.out.println(isPalindrome(str));




        // Q6. Sum of n numbers
        // int n = new Scanner(System.in).nextInt();
        // int sum = 0;
        // int i = 1;
        // while (i <= n){
        //     sum += i;
        //     i++;
        // }
        // System.out.println(sum);



        // Q7. String Reverse
        // StringBuilder sb = new StringBuilder("");
        // String str = "Madam";
        // str = str.toLowerCase();
        // for(int i=str.length()-1; i>=0; i--){
        //     sb.append(str.charAt(i));
        // }
        // System.out.println(sb);

        // if(sb.toString().equals(str)){
        //     System.out.println("palindrome");
        // }else{
        //     System.out.println("Not Palindrome");
        // }


        // Q8. Factorial of a number
        // System.out.println(calculateFactorial(5));


        // Q9. Find the number of occurences of a character in a string
        // String str = "My name is Ankit Kumar";
        // int count = 0;
        // char search = 'a';

        // for (int i = 0; i < str.length(); i++) {
        //     if(str.charAt(i) == search){
        //         count++;
        //     }
        // }
        // System.out.println("Number of character 'a' is :- "+count);


        // Q10. Anagrams or not
        // String s1 = "earth";
        // String s2 = "thrae";
        // Convert Strings to lowercase. Why? so that we don't have to check
        //separately for lower & uppercase.
        // s1 = s1.toLowerCase();
        // s2 = s2.toLowerCase(); 

        // if(s1.length() == s2.length()){
        //     char s1char[] = s1.toCharArray();
        //     char s2char[] = s2.toCharArray();
            
        //     Arrays.sort(s1char);
        //     Arrays.sort(s2char);

        //     boolean result = Arrays.equals(s1char, s2char);
        //     if(result){
        //         System.out.println(s1 +" and "+s2+" are anagrams of each other");
        //     }else{
        //         System.out.println("Not anagrams of each other");
        //     }
        // }
        // else{
        //     System.out.println("Not anagrams of each other");
        // }


        // Q11. Find common elements in an array
        // int arr[] = {1,2,3,4,5,1,2,6,7};
        // getMatchingElements(arr);



        // Q12. Reverse an array elements
        // int numbers[] = {1,2,3,4,5};
        // reverse(numbers);
        // for(int i=0; i<numbers.length; i++){
        //     System.out.print(numbers[i]+" ");
        // }


        // Q12. Fibonacchi Series using Recursion
        // Q13. Factorial of a number using Recursion
        // Q13. Reverse a Linked List

        // Q14. Binary Search
        // Q15. Second Largest element in an array



        // Q16. Remove all occurences of a given character from the input string
        String str = "Australia";
        str = str.replace("a", "");
        System.out.println(str);
    }
}
