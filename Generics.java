// User created Generic class
// class BankAccount<T>{
//     T t1;

//     BankAccount(T t1){
//         this.t1 = t1;
//     }

//     public void display(){
//         System.out.println(t1);
//     }

//     // Generic method
//     public <T> void depositMoney(T[] money){
//         for (T val : money) {
//             System.out.print(val+" ");
//         }
//         System.out.println();
//     }
// }

// Bounded Parameter type
class BankAccount<T extends Number>{
    public void display(T[] t1){
        for (T i : t1) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

public class Generics {
    public static void main(String[] args) {
        // BankAccount<String> b1 = new BankAccount<>("Hello");
        // BankAccount<Integer> b2 = new BankAccount<>(25);

        // b1.display();
        // b2.display();

        // Integer m1[] = {500,800,1000};
        // Double m2[] = {1000.2,5000.5,6000.25};

        // b1.depositMoney(m1);
        // b2.depositMoney(m2);


        // BankAccount<Number> b3 = new BankAccount<>();
        BankAccount<Integer> b1 = new BankAccount<>();
        BankAccount<Double> b2 = new BankAccount<>();

        Integer m1[] = {12,25,35,45};
        Double m2[] = {12.253,52.256,35.123,52.259};
        b1.display(m1);
        b2.display(m2);



    }
}


