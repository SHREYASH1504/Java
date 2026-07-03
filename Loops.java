public class Loops {
    static void main() {

        // "for" loop
        for(int i=1; i<=5; i++) {
            System.out.println(i);
        }

        // nested for loop
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                System.out.print(i);
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // break keyword : get out of that loop

        // continue keyword : current loop k updation step pr le jaega

        // while loop 
        int a = 1;      // initialization 
        while(a <=5 ) { // condition
            System.out.println(a);
            a++;        // updation
        }



    }
}
