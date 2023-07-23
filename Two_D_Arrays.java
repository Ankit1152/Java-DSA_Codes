import java.util.*;
public class Two_D_Arrays{

    public static int getLargestSmallest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(largest < matrix[i][j]){
                    largest = matrix[i][j];
                }

                if(smallest > matrix[i][j]){
                    smallest = matrix[i][j];
                }
            }             
        }
        System.out.println("Largest element is "+largest);
        return smallest;     
    }

    public static void search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at index ("+i+","+j+")");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int matrix[][] = new int[3][3];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        search(matrix, 5);
        System.out.println("Smallest number is "+getLargestSmallest(matrix));
    }
}

