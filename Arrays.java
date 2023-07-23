import java.util.Scanner;

// Arrays is a linear data structure.It is a list of elements of same datatype
// It stores the elements or data in contiguous memory location  
// it is pass by reference to the function
public class Arrays {

    // Passing Arrays as function arguements....
    public static void update(int marks[]) {
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }




    // Linear Search      O(n)
    public static int linearSearch(int numbers[] ,int key){
        for(int i=0; i<numbers.length; i++){
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

   


    // To find the smallest and largest value in the array...
    public static int getLargestSmallest(int numbers[]){

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is "+smallest);
        return largest;
    }





    // To check a given array is sorted or not
    public static boolean isSorted(int array[]){
        for(int i=0; i<array.length-1; i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }

    
    public static void main(String[] args) {
        // int marks[] = {95 , 96 , 98};
        // update(marks);

        // To print the Arrays....
        // for(int i=0; i<marks.length; i++){
        //     System.out.print(marks[i]+" ");
        // }
        // System.out.println();
       
        

        // Scanner sc = new Scanner(System.in);
        int numbers[] = {2,4,6,6,10,12,14,16};
        // int key = sc.nextInt();

        // int index = linearSearch(numbers , key);
        // if(index == -1){
        //     System.out.println("Key not exist in the list");
        // }else{
        //     System.out.println("key found at index "+index);
        // }

        // System.out.println("Largest value is "+getLargestSmallest(numbers));

        System.out.println(isSorted(numbers));
    }




    public static void sort(char[] s1char) {
    }    
}
