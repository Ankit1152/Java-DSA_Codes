import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using For loop
        for (int i = 1; i <= 4; i++) {
            System.out.println("****");
        }
        System.out.println();

        
        // Using while loop
        int line = 1;
        while(line <= 4){
            System.out.println("****");
            line++;
        }
    }
}
