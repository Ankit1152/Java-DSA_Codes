public class DiagonalSum {

    // Brute force      O(n^2)
    // public static void diagonalSum(int matrix[][]){
    //     int sum=0;
    //     for(int i=0; i<matrix.length; i++){
    //         for(int j=0; j<matrix[0].length; j++){
    //             // Pd
    //             if(i == j){
    //                 sum+=matrix[i][j];
    //             }
    //             //sd
    //             if(i+j == matrix.length-1){
    //                 sum+=matrix[i][j];
    //             }
    //         }
    //     }
    //     System.out.println(sum);
    // }

    public static void diagonalSum(int matrices[][]){     // O(n)
        int sum = 0;
        for(int i=0; i<matrices.length; i++){
            // Primary Diagonal     (i == j)
            sum += matrices[i][i];
            // Secondary Diagonal   (i + j == n-1) 
            if(i != matrices.length-1-i){
                sum += matrices[i][matrices.length-1-i];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int matrices[][] = {{0,1,2,3},
                            {4,5,6,7},
                            {8,9,10,11},
                            {12,13,14,15}
                           };
        
        // diagonalSum(matrices);
        System.out.println(matrices.length);
    }
}
