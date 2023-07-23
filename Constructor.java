public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ankit";
        s1.rollNo = 15;
        s1.password = "abcde";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 95;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100; 
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i] );
        }
        // Student s2 = new Student("Ankit");
        // Student s3 = new Student(15);
    }
}
class Student{
    String name;
    int rollNo;
    String password;
    int marks[];

    // Copy Constructor :- Copies all the properties of one object to another object
    // Shallow Copy Constructor   Changes reflect....only references copiedd
    // Student (Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollNo = s1.rollNo;
    //     this.marks = s1.marks;
    // } 

    // Deep copy constructor Changes don't reflect  new creation of array or something
    Student (Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
    // Non - Parameterized constructor 
    Student(){
        marks = new int[3];
        System.out.println("Non parameterized constructor is called..");
    }
    // Parameterized Constructor
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int roll){
        marks = new int[3];
        this.rollNo = roll;
    }
}
