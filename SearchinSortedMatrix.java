public class SearchinSortedMatrix {
        public static boolean staircaseSearch1(int matrices[][],int key){
            int row = 0 , col = matrices[0].length-1; 
            
            while(row < matrices.length && col >= 0 ){
                if(matrices[row][col] == key){
                    System.out.println("Key found at ("+row+","+col+")");
                    return true;
                }else if(key > matrices[row][col]){
                    row++;
                }else{
                    col--;
                }
            }
            System.out.println("Key not found");
            return false;
        }

        public static boolean staircaseSearch2(int matrix[][], int key){
            int row = matrix.length-1, col = 0;

            while(row >= 0 && col < matrix[0].length){
                if(key == matrix[row][col]){
                    System.out.println("Key found at index ("+row+","+col+")");
                    return true;
                }
                else if(key < matrix[row][col]){
                    row--;
                }else{
                    col++;
                }
            }
            System.out.println("Key not found");
            return false;
        }
    public static void main(String[] args) {
        int matrices[][] = {
                            {10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}
                            };
        staircaseSearch1(matrices,33);
        staircaseSearch2(matrices,30);

    }
}
