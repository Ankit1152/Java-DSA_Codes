public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();  // created a pen object called p1
        p1.setColor("Green");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("blue");
        System.out.println(p1.getColor());

        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "Ankit Kumar";
        // myAcc.setPassword("abcdef");
        // myAcc.getPassword();
    }
}
// class BankAccount{
//     public String username;
//     private String password;

//     public void setPassword(String pwd){
//         password = pwd;
//     }

//     public void getPassword(){
//         System.out.println(password);
//     }
// }
class Pen{
    // Properties
    private String color;
    private int tip;

    // Getter methods
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    // Setter Methods
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
}

// class Student{
//     String name;
//     int age;
//     float percentage;

//     void setName(String newName){
//         name = newName;
//     }
//     void setAge(int newAge){
//         age = newAge;
//     }
//     void setPercentage(int phy, int chem, int maths){
//         percentage = (phy + chem + maths) / 3;
//     }
// }
