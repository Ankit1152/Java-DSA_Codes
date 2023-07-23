public class Largest_Among_3 {
    public static void main(String []args){
        int a = 10, b = 5, c = 20;

        if ((a >= b) && (a >= c)){
            System.out.println("Largest is "+a);
        }
        else if(b >= c){
            System.out.println("Largest is "+b);
        }
        else{
            System.out.println("Largest is "+c);
        }
    }
}
