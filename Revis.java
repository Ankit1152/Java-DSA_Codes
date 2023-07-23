import java.util.Arrays;
public class Revis {
    public static void main(String[] args) {
        String s1 = "Earth";
        String s2 = "thrae";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length()==s2.length()){
            char s1char[] = s1.toCharArray(); 
            char s2char[] = s2.toCharArray();

            Arrays.sort(s1char);
            Arrays.sort(s2char);

            boolean result = Arrays.equals(s1char,s2char);

            if(result){
                System.out.println("Anagrams");
            }else{
                System.out.println("They are not anagrams");
            }
        }else{
            System.out.println("Not Angrams");
        }
    }
}
