import java.util.Arrays;
public class Anagrams {
    public static void main(String[] args) {
        String s1 = "earth";
        String s2 = "thrae";

        //Convert Strings to lowercase. Why? so that we don't have to check
        //separately for lower & uppercase.
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase(); 

        if(s1.length() == s2.length()){
            char s1char[] = s1.toCharArray();
            char s2char[] = s2.toCharArray();
            
            Arrays.sort(s1char);
            Arrays.sort(s2char);

            boolean result = Arrays.equals(s1char, s2char);
            if(result){
                System.out.println(s1 +" and "+s2+" are anagrams of each other");
            }else{
                System.out.println("Not anagrams of each other");
            }
        }
        else{
            System.out.println("Not anagrams of each other");
        }
    }
}
