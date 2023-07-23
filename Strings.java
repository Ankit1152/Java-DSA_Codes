import java.util.Scanner;

public class Strings {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str1 = new String("xyz@#123");

        // // Strings are IMMUTABLE :- data cannot be changed or modified
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Ankit Kumar";
        // System.out.println(fullName.length());

        // Concatenation 
        String firstName = "Ankit";
        String lastName = "Kumar";
        String fullName = firstName+" "+lastName;
        // System.out.println(fullName);

        // printLetters(fullName);


        
    }
}
