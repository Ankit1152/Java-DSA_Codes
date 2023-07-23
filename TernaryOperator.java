public class TernaryOperator {
    public static void main(String[] args) {
        int number = 5;

        // Ternary Operator
        //  Variable =    (Condition) ?   statement1 : statement2;
        String type = ((number % 2) == 0) ? "Even" : "Odd";
        System.out.println(type);

        int marks = 20;
        String result = (marks >= 33) ? "Pass" : "Fail";
        System.out.println(result); 
    }
}
