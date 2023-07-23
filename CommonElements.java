import java.util.HashSet;
public class CommonElements {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,2,4,1};
        int arr2[] = {1,6,4,2,4,1};
        
        // HashSet <Integer> set = new HashSet<>();
        // for(int i=0; i<arr1.length; i++){
        //     for(int j=0; j<arr2.length; j++){
        //         if(arr1[i] == arr2[j]){
        //             set.add(arr1[i]);
        //             break;
        //         }
        //     } 
        // }
        // for(int value : set){
        //     System.out.print(value+" ");
        // }




        // This code is for unique elements in both the array
        // int array1[] = {1,2,3,4,5};
        // int array2[] = {1,2,3,6};
        // HashSet <Integer> set = new HashSet<>();
        // for(int value:array1){
        //     set.add(value);
        // }
        // for(int value:array2){
            // boolean b = set.add(value);
        //     if(b==false){
        //         System.out.print(value+" ");
        //     }
        // }



        // this code is for duplicacy in both the array
        HashSet <Integer> set1 = new HashSet<>();
        HashSet <Integer> set2 = new HashSet<>();

        // this loop removes the duplicacy of the array
        for(int val : arr1){
            set1.add(val);
        }
        // this loop removes the duplicacy of the array
        for(int val : arr2){
            set2.add(val);
        }
        for(int val : set1){
            boolean b = set2.add(val);
            if(b == false){
                System.out.print(val+" ");
            }
        }
    }
}
