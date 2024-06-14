public class Bitwise_Operators{

    public static void allBitwiseOperators(){
        // Bitwise AND  
        System.out.println( (7 & 6) ); 

        // Bitwise OR
        System.out.println( (5 | 6) );

        // Bitwise XOR
        System.out.println( (5 ^ 6));

        // Bitwise NOT
        System.out.println( ~(3) );

        // Bitwise Left Shift
        System.out.println( (5 << 4 )); 

        // Bitwise Right Shift
        System.out.println( (6 >> 1));
    }

    // Given a number N, the task is to check whether the number is even or odd using Bitwise Operators.
    //We kknow that if, LSB is 0 the number is EVEN else it is ODD when LSB is 1
    public static void evenOdd(int num){
        //bitmask - Number to be ANDed - 0001 - explicit value
        int bitmask = 0;  
        if((num & bitmask)==0 ){
    //         1 0 1 1  (11 in binary)
    //      &  0 0 0 1
    //    ------------------
    //         0 0 0 1
            System.out.println("Even Number");
        }  else {
            System.out.println("Odd Number");
        }
    }

    public static int getIthBit(int num, int i){
        int bitmask = (1 << i); //
        if((num & bitmask)== 0){
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int num, int i){
        int bitmask = (1 << i);
            return num | bitmask;
    }

    public static int clearIthBit(int num, int i){
        int bitmask = ~(1 << i);
        return num & bitmask;
    }

    public static int updateIthBit(int n, int i, int newbit){
        // if(newbit == 0){
        //     return clearIthBit(n, 1);
        // } else{
        //     return setIthBit(n, 1);
        // }

        n = clearIthBit(n, i);
        int bitmask = newbit << i;
        return n | bitmask;

    }

    public static int clearIBits(int n, int i){
        int bitmask = (~0 )<< i;
        return n & bitmask;
    }

    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) ==0;
    }

    public static int countSetBits(int n){
        int count =0;
        while(n > 0){
            if( (n & 1)!= 0){ //check/Get Last Bit 
                count++;
            }
            n = n>>1; //Right Shift - To check LSB
        }
        return count;
    }

        public static int findExpo(int a, int n){
            int ans =1;
            while(n > 0){
                if( (n & 1) != 0){
                    ans = ans * a;
                }
                a = a*a;
                n = n >> 1;
            }
            return ans;
        }

        private static int swapTwoNumbers(int x, int y){
            x = x^y;
            y = x^y;
            x = x^y;
            System.out.println("Swapped Values: "+x+" "+y);
            return 1;
        }

        public static void addOneToInteger(){
            int x = 7;
            System.out.println("X + 1 = " + -(~x));
        }

    public static void main(String[] args) {
        // allBitwiseOperators();
        // evenOdd(9);
        System.out.println(getIthBit(11, 2));
        // System.out.println(setIthBit(10, 2));
        // System.out.println(clearIthBit(10, 1));
        // System.out.println(updateIthBit(10, 2, 1));
        // System.out.println(clearIBits(15, 2));
        // System.out.println(isPowerOfTwo(16));
        // System.out.println(countSetBits(4));
        // System.out.println(findExpo(3, 5));
        // addOneToInteger();
        // swapTwoNumbers(4, 5);
    }
    
} 