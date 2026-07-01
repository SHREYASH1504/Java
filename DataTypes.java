public class DataTypes {
    static void main() {

        // Numeric - short, byte, int, long
        byte num1 = 100; // range - -127 to 127
        short num2 = 500; // -32767 to 32767
        int num3 = 50000; // -2^31 to 2^31
        long num4 = 949494989; // -2^61 to 2^61
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        // floating
        float num5 = 1.23f; // 6 to 7 decimal digits
        double num6 = 1.552395832352; // upto 1 decimal digits;
        System.out.println(num5);
        System.out.println(num6);

        // other 
        boolean systemOK = true;
        System.out.println(systemOK);

        char c = 'a';
        System.out.println(c);




    }
}