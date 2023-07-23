import java.util.Scanner;

        // Entry controlled loop  :- for loop and while loop :- the condition is checked first and the loop is executed 
        //                           if the condition is true
        // In exit controlled loop, the loop is executed and then the condition is checked

public class SumN {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
