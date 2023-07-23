import java.util.Scanner;
public class Interfaces2 {
    public static void main(String[] args) {
        Client c = new Developer();
        c.input();
        c.output();
    }
}

interface Client{
    void input();    // by default public and abstract
    void output();   // by default public and abstract   
}

class Developer implements Client{
    String name;
    Double salary;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        name = sc.nextLine();

        System.out.println("Enter your salary :");
        salary = sc.nextDouble();
    }

    public void output(){
        System.out.println("Your name is "+name);
        System.out.println("Your salary is "+salary);
    }
}