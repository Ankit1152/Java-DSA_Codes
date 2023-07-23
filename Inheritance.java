public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();

        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);
    }
}

// Parent class / Base class
// Multilevel Inheritance
// class Animal{
//     String color;   //Properties

//     void eat(){     // methods
//         System.out.println("Eats");
//     }
//     void breath(){
//         System.out.println("Breathes");
//     }
// }
// class Mammals extends Animal{
//     int legs;
// }
// class Dog extends Mammals{
//     String breed;
// }

// Child class / Sub class
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swims in water");
//     }
// }


// Hierarchical Inheritance
class Animal{
    String color;   //Properties

    void eat(){     // methods
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breathes");
    }
}
class Mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("Walk");
    }
}
class Dog extends Animal{
    String breed;
}

class Birds extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}