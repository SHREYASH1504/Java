public class Operator {
    static void main() {
        int a = 15;
        int b = 10;

        // Arithmetic Operators
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int rem = a%b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div); // int / int = int, float/int = float, double/int = double
        System.out.println(rem);

        // Comparison Operators
        int x = 10;
        int y = 11;
        System.out.println(x == y); // equal to
        System.out.println(x != y); // not equal to
        System.out.println(x >= y); // grater than or equal to
        System.out.println(x <= y); // less than or equal to
        System.out.println(x > y);  // greater than
        System.out.println(x < y);  // less than
        System.out.println();


        // Logical operators
        boolean alpha = true;
        boolean beta = false;
        System.out.println(alpha && beta);
        System.out.println(alpha || beta);
        System.out.println(!alpha);

        // Assignment Operator
        /*
            a+=5 -> a = a+5;
            a-=5 -> a = a-5;
            a*=5 -> a = a*5;
            a/=5 -> a = a/5;
            a%=5 -> a = a%5;    
        */

        // unary operators
        /*
            ++a pre-incement = incement then utilize
            a++ post-increment = first utilize then increment
            a--, --a = same for the decrement
        */

    }
}
