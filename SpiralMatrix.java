public class SpiralMatrix {
    public static void printSpiral(int matrices[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrices.length-1;
        int endCol = matrices[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            // top Boundary
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrices[startRow][j]+" ");
            }  

            
            // Right Boundary
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrices[i][endCol]+" ");
            }

            // Bottom boundary
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrices[endRow][j]+" ");
            }

            // Left boundary
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrices[i][startCol]+" ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        
        System.out.println();
    }
    public static void main(String[] args) {
        int matrices[][] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16},
                            {17,18,19,20}
                           };
        
        printSpiral(matrices);
    }
}
