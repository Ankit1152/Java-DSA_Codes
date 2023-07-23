public class PrimesinRange {

    // Helper Function
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int range){
        for(int i = 2; i <= range; i++){
            if(isPrime(i)){
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primesInRange(100);
    }
}
