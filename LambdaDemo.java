public class LambdaDemo {
// Lambda expression with the help of functional interface
    interface Sum{
        int sum(int a, int b);
    }

    interface StringLength{
        int getLength(String str);
    }
    public static void main(String[] args) {
        Sum obj = (a,b)-> {
            return a + b;
        };
        System.out.println(obj.sum(5,10));

        StringLength sl = str -> str.length();

        System.out.println(sl.getLength("Ankit"));
    }
}
