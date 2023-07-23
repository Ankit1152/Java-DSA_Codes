public class Str {
    public static void main(String[] args) {
        String str = "abcacabdebvgdara";
        int frequency = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a'){
                frequency++;
            }
        }
        System.out.println(frequency);

       
    }
}
