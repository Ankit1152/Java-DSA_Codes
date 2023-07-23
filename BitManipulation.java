public class BitManipulation {
    // Q1...
    // Odd-Even Question using bit manipulation
    public static void oddEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
    // Operations on bits
    // 1.Get ith bit
    public static int getBit(int n, int i){
        int bitmask = 1 << i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
     
    // 2.Set ith bit
    public static int setBit(int n, int i){
        int bitmask = 1 << i;
        return n | bitmask;
    } 

    // 3.Clear ith bit
    public static int clearBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    } 

    // 4.update ith bit
    public static int updateBit(int n,int i,int newBit){
        // 1st way...
        // if(newBit == 0){
        //     return clearBit(n, i);
        // }else{
        //     return setBit(n, i);
        // }

        // 2nd way...
        n = clearBit(n, i);
        int bitmask = newBit << i;
        return n | bitmask;
    } 

    // 5.Clear last i bits
    public static int clearlastIbits(int n,int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    
    // Q2.Check if a number is power of two or not
    public static boolean isPowerofTwo(int n){
        return (n & (n-1))== 0;
    }

    // Q3.Count set bits in a number
    public static int countSetBits(int n){
        int count = 0;
        while (n>0) {
            if((n&1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {   
        // oddEven(3);
        // oddEven(11);
        // oddEven(14);

        // System.out.println(getBit(10, 2));
        // System.out.println(setBit(10, 2));
        // System.out.println(clearBit(10, 1));
        // System.out.println(updateBit(10, 2, 1));
        // System.out.println(clearlastIbits(15, 2));

        System.out.println(isPowerofTwo(32));
        System.out.println(countSetBits(10));
    }
}
