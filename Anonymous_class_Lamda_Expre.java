// Functional Interface :- Interface that has only one method
interface DemoAno{
    void method1(int a);      // by default    methods in interface is public and abstract in nature
    // void method2();
}
public class Anonymous_class_Lamda_Expre {
    public static void main(String[] args) {
        // Anonymous class 
        // DemoAno obj = new DemoAno() {        //Here i am not creating the object of the interface 
        //                                      //i am creating the object the child class or anonymous class
        //     @Override
        //     public void method1() {
        //         System.out.println("I am method 1");
        //     }

        //     @Override
        //     public void method2() {
        //         System.out.println("I am method 2");
        //     }
        // };

        // obj.method1();
        // obj.method2();



        
        // Lambda Expression
        DemoAno obj = (a) -> {
            System.out.println("This is method 1 "+a);
        };
        obj.method1(6);
    }
}
