public class Capegemini {
    public static void divisible(int n){
        for(int i=5; i<=n; i++){
            if(i % 5 == 0 || i % 7 == 0){
                System.out.print(i+" ");
            }
        }
    }

    
    public static void toCheckPerfect(int n){
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        if(sum == n){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not Perfect number");
        }
    }
    public static void main(String[] args) {
        int n = 28;
        // divisible(n);
        toCheckPerfect(n);
    }

}
