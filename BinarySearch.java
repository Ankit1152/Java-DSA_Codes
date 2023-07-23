public class BinarySearch {
    public static int binarySearch(int numbers[], int key){
            int start = 0;
            int end = numbers.length - 1;
            if(numbers.length == 0){
                return -1;
            }
            while(start <= end){
                int midpoint = (start + end)/2;
                if(numbers[midpoint] == key){
                    return midpoint;
                    
                }else if(key > numbers[midpoint]){
                    start = midpoint+1;
                }else{
                    end = midpoint-1;
                }
            } 
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {10,20,30,40,50,60,70};
        System.out.println(binarySearch(numbers , 50));
    }
}
