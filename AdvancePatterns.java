public class AdvancePatterns {

    public static void hollow_Rectangle(int rows , int columns){
        // Outer loop
        for(int i = 0; i < rows; i++){
            // Inner loop - Columns
            for(int j = 0; j < columns; j++){
                // cell - [i,j]
                if(i == 0 || i == rows-1 || j == 0 || j == columns-1){
                    // boundary cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
                        // ****
                        // *  *
                        // *  *
                        // ****

    public static void inverted_half_pyramid_with_numbers (int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
                        // 1 2 3 4 5 
                        // 1 2 3 4   
                        // 1 2 3     
                        // 1 2
                        // 1

    


    public static void inverted_rotated_half_pyramid(int rows){
        // Outer loop
        for(int i=1; i<=rows; i++){
            // spaces
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            // Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

                        //      *
                        //     **
                        //    ***
                        //   ****
                        //  *****






    public static void floyds_Triangle(int n){
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
                        // 1 
                        // 2 3   
                        // 4 5 6 
                        // 7 8 9 10
                        // 11 12 13 14 15

    public static void main(String[] args) {
        hollow_Rectangle(4, 4);
        // inverted_rotated_half_pyramid(5);
        // inverted_half_pyramid_with_numbers(5);
        // floyds_Triangle(5);
    }
}
