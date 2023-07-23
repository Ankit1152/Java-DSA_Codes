import java.util.HashSet;

public class ContainsDuplicate {
    // Time Complexity = O(n^2) = Brute Force
    // public static boolean toCheckDuplicate(int numbers[]){
    //     for(int i=0; i<numbers.length-1; i++){
    //         for(int j=i+1; j<numbers.length; j++){
    //             if(numbers[i] == numbers[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    // Time Complexity = O(n)  using set
    public static boolean toCheckDuplicate(int numbers[]){
        HashSet <Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length; i++){
            if(set.contains(numbers[i])){
                return true;
            }else{
                set.add(numbers[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int numbers[] = {1,1,2,3,4,5};
        System.out.println(toCheckDuplicate(numbers));
    }
}
