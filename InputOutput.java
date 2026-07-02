import java.math.BigInteger;
import java.util.Scanner;

public class InputOutput {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vakue for First Input: ");
        int firstInput = sc.nextInt();
        System.out.print("Enter the value for second Input: ");
        int secInput = sc.nextInt();

        int ans = firstInput + secInput;
        System.out.println("Sum of values: " + ans);

        // other input types
        System.out.print("Enter the value for Big Integer: ");
        BigInteger bg = sc.nextBigInteger();

        System.out.print("Enter the value for flag: ");
        boolean flag = sc.nextBoolean();

        System.out.print("Enter the value for short: ");
        short s = sc.nextShort();
        
        System.out.print("Enter the value for float: ");
        float fl = sc.nextFloat();

        // best practise, prevents source leak
        sc.close();        

    }
}