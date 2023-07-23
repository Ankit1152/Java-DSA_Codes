import java.util.HashSet;
import java.util.Scanner;

public class Interview {
    // Program to count the no of digits in a Number n
    public static int countDigits(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            n = -n;
        }
        int counter = 0;
        while(n != 0){
            n = n / 10;
            counter++;
        }
        return counter;
    }
    // Frequency of a given digit in a Number n
    public static int frequencyDigits(int n, int d){
        if(n==0 && d==0){
            return 1;
        }
        if(n<0){
            n = -n;
        }
        int frequency = 0;
        while(n != 0){
            int digit = n % 10;
            if(digit==d){
                frequency++;
            }
            n = n / 10;
        }
        return frequency;
    }

    // Power x to the power n
    public static double pxn(double x, int n){
        if(n==0){
            return 1;
        }
        return x * Math.pow(x,n-1);
    }

    // Count the vowels and consonants in a string
    public static void countVowelsConsonants(String str){
        int vowels = 0;
        int consonants = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("Vowels = "+vowels);
        System.out.println("Consonants = "+consonants);
    }
    
    // Print unique characters in a string
    public static void printUnique(String str){
        HashSet <Character> unique = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(unique.contains(ch)){
                unique.remove(ch);
            }else{
                unique.add(ch);
            }
        }
        for(Character ch : unique){
            System.out.print(ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();  
        // System.out.println(countDigits(n));
        // int n = sc.nextInt();
        // int d = sc.nextInt();
        // System.out.println(frequencyDigits(n, d));
        // double x = sc.nextDouble();
        // int n = sc.nextInt();
        // System.out.println(pxn(x, n));
        // String str = "i am learning data sructure using java";
        // countVowelsConsonants(str);
        String str = "abcab";
        Interview.printUnique(str);
    }
}
