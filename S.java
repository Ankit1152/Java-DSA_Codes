public class S {
    public static void main(String[] args) {
        String s1 = "Rohan is a good boy";
        String s2 = "Atul";

        // if(s1.compareTo(s2) == 0){
        //     System.out.println("Both the strings are equal");
        // }else if(s1.compareTo(s2) > 0){
        //     System.out.println("s1 is greater than s2");
        // }else{
        //     System.out.println("s2 is greater than s1");
        // }
    

        // Total number of characters excluding whitespaces
        int counter = 0;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != ' '){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
