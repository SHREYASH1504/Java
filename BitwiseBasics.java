public class BitwiseBasics {
    public static void main() {

        /*
            & - AND
            | - OR
            ^ - XOR
            ~ - NOT
            << - Left Shift
            >> - Right Shift
            >>> - Undigned Right Shift
        */

        int a = 5;
        int b = 6;

        // AND
        /*
            1 & 1 = 1
            1 & 0 = 0
            0 & 1 = 0
            0 & 0 = 0
        */
        System.out.println(a & b);

        // OR
        /*
            1 | 1 = 1
            1 | 0 = 1
            0 | 1 = 1
            0 | 0 = 0
        */
        System.out.println(a | b);

        // XOR
        /* same value = 0, different value = 1
            1 ^ 1 = 0
            1 ^ 0 = 1
            0 ^ 1 = 1
            0 ^ 0 = 0
        */
        System.out.println(a ^ b);

        // NOT
        /* 
            ~1 = 0
            ~0 = 1
        */
       System.out.println(~a);

       // Left Shift
       /*
          5    - 00000000 00000000 00000000 00000101
        5 << 1 - 00000000 00000000 00000000 00001010 = 10
        slide each number to left by 1 bit
        - most significant bit get lost and 
          at place of least significant bit we place 0 
        therefore, 5 << 1 = 5 * (2^1) = 10
                   5 << i = 5 * (2 ^ i)
       */
       int n = 5;
       for(int i=1; i<=33; i++) {
        n = n << 1;
        System.out.println(n);
       }

        // Right Shift
        /*
          5    - 00000000 00000000 00000000 00000101
        5 >> 1 - 00000000 00000000 00000000 00000010
        - least significant bit get lost and 
          at place of most significant bit we place 0
          therefore, 10 >> 1 = 10 / (2^1) = 5
                     10 >> i = 10 / (2^i) 
        */
        int m = 100;
        for(int i=1; i<=32; i++) {
           n =  n >> 1;
           System.out.println(n);
        }

        
        

    }
}