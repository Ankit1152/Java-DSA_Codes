import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        String s1 = new Scanner(System.in).next();
        int counter = 0;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u'){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
 