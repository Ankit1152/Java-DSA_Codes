public class StringSubstring {
    // UserDefined Method of getSubstring
    public static String subString(String str, int si, int ei){
        String subString = "";
        for(int i=si; i<ei; i++){
            subString += str.charAt(i);
        }
        return subString;
    }
    public static void main(String[] args) {
        String s1 = "Helloworld";
        // System.out.println(s1.substring(0,5)); // Pre-defined method in java
        System.out.println(subString(s1,0,5));
        System.out.println();
    }
}
