public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "Amity";

        Student s2 = new Student();
        // System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "MS MEMORIAL";

        System.out.println(s2.schoolName);
        System.out.println(s1.schoolName);
    }
}
class Student{
    static int returnPercentage(int phy, int chem, int maths){
        return (phy + chem + maths)/3;
    }
    String name;
    int rollno;
    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
