import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        // for(int line = 1; line <= 10; line++){
        //     for(int star = 1; star <= line; star++){
        //         System.err.print("*");
        //     }
        //     System.out.println();
        // }



        
        // Inverted star Pattern
        // int n = sc.nextInt();
        // for(int line=1; line<=n; line++){
        //     for(int s=1; s<=n-line+1; s++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
      



        // for(int line = 1; line <= 4; line++){
        //     for(int star = 4; star >= line; star--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }





        // Half Pyramid Pattern....
        // int n = sc.nextInt();
        // for(int line = 1; line <= n; line++){
        //     // numbers print
        //     for(int number = 1; number <= line; number++){
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }






        // Character Pattern
        int n = 5;
        char ch = 'A';

        for(int line=1; line<=n; line++){
            for(int chars=1; chars<=line; chars++){  
                System.out.print(ch);
                ch++;                                                                                     
            }
            System.out.println();
        }
    }
}
