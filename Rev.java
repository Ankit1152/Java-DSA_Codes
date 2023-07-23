import java.util.Arrays;
public class Rev {
    public static boolean anagrams(String str, String str2){
        str = str.toLowerCase();
        str2 = str2.toLowerCase();

        if(str.length() == str2.length()){
            char strArr[] = str.toCharArray();
            char str2Arr[] = str2.toCharArray();

            Arrays.sort(strArr);
            Arrays.sort(str2Arr);

            if(Arrays.equals(strArr, str2Arr)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // String str = "Ankit";
        // String str2 = "kinta";
        // System.out.println(anagrams(str, str2));
        String str = "aaaabbbccccdd";
        System.out.println(compress(str));
    }
}
