public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(10, 20));
        System.out.println(calc.sum((float)10.25, (float)10.25));
        System.out.println(calc.sum(10, 20, 30));

        Deer d = new Deer();
        d.eat();
    }
}
// Method Overloading(Compile Time or Static Polymorphism)
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}

// Method Overriding(Dynamic or Runtime Polymorphism) 
class Animal{
    void eat(){
        System.out.println("Eats Anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}
