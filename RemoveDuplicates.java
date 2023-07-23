import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {10,20,30,10,15,20};
        HashSet <Integer> set = new HashSet<>();
        for(int val : arr){
            set.add(val);
        }
        for(int value:set){
            System.out.print(value+" ");
        }
    }
}
