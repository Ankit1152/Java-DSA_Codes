import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();


        if(n == 2){
            System.out.println("Prime no");
        }else{

            boolean isPrime = true;

            for(int i=2; i<=Math.sqrt(n); i++){
                if(n % i == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.println("Prime No");
            }else{
                System.out.println("Not Prime No");
            }
        }
       
    }
}
