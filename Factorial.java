// import java.util.Scanner;

public class Factorial {

    public static int calculateFactorial(int n) {
        int fact = 1;
        for(int i=2; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

    public static int binCoeff(int n , int r){
        int fact_n = calculateFactorial(n);     // Factorial function is act as a helper function
        int fact_r = calculateFactorial(r);
        int fact_nmr = calculateFactorial(n - r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        System.out.println(binCoeff(5, 2));
    }
}
