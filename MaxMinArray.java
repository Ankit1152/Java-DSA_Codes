public class MaxMinArray {
    public static int getMaxMin(int array[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Largest value = "+max);
        return min;
    }
    public static void main(String[] args) {
        int array[] = {10,20,30,50,60};
        System.out.println("Smallest value = "+getMaxMin(array));
    }
}
