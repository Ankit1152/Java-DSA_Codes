public class Revise {
    public static int binDec(int bin){
        int pow = 0;
        int decNo = 0;

        while (bin > 0) {
            int last = bin % 10;
            decNo = decNo + last * (int) Math.pow(2, pow);
            pow++;
            bin = bin / 10;
        }

        return decNo;
    }
    public static void main(String[] args) {
        int bin = 101;
        System.out.println(binDec(bin));
    }
}
