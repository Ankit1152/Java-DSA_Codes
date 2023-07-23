public class Qoops {
    public static void main(String[] args) {
        Vehicles obj1 = new Car();
        obj1.print();    // Vehicles object refer only its own method 

        Vehicles obj2 = new Vehicles();
        obj2.print1();
    }
}

class Vehicles{
    public void print1(){
        System.out.println("Vehicles");
    }
}

class Car extends Vehicles{
    public void print(){
        System.out.println("Car");
    }
}