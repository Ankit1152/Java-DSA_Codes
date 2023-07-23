public class Dec_To_Bin {

    public static void decToBin(int decNo){
        int myNum = decNo;
        int pow = 0;
        int binNum = 0;

        while(decNo > 0){
            int rem = decNo % 2;
            binNum = binNum + (rem * (int) Math.pow(10,pow));
            pow++;
            decNo = decNo / 2;
        }

        System.out.println("Binary form of "+myNum+" = "+binNum);
    }
    public static void main(String[] args) {
        decToBin(12);
    }
}
