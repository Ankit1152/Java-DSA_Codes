import java.util.Scanner;

public class BreakKeyword {
    public static void main(String[] args) {
        // for(int i = 1; i <= 5; i++){
        //     if(i==4){
        //         break;
        //     }
        //     System.out.println(i);
        // }

        // int counter = 1;
        // do{
        //     System.out.println(counter+" My name is Ankit Kumar");
        //     counter++;
        // }while(counter <= 10);

        Scanner sc = new Scanner (System.in);

        // do{
        //     System.out.print("Enter the number :");
        //     int n = sc.nextInt();
        //     if(n % 10 == 0){
        //         break;
        //     }
        //     System.out.println(n);
        // }while(true);

        do{
            System.out.print("Enter the number :");
            int n = sc.nextInt();

            if(n % 10 == 0){
                continue;
            }
            System.out.println("Number was "+n);
            
        }while(true);
    }
}
