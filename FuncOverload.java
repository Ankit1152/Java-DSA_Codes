public class FuncOverload {

    // Overloading using no of params

    // public static int  sum(int a , int b) {
    //     return a+b;
    // }

    // public static int sum(int a , int b , int c){
    //     return a + b + c;
    // }

    // Overloading using datatypes....

    public static int  sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a , float b) {
        return a + b;
    }
    public static void main(String[] args) {
        // System.out.println(sum(10,20));
        // System.out.println(sum(54,12,20));

        System.out.println(sum(10, 30));
        System.out.println(sum(12.25f, 20.25f));
    }
}
