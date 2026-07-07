import java.util.Scanner;

public class Arrays {
    static void main() {

        // declaration
        // int arr[];

        // allocation
        // arr = new int[3];

        // initialization
        // int arr[] = {4, 8, 2, 0, 9};

        // accessing element in array
        // value at 0th index : arr[0];

        int brr[] = {10, 20, 30, 40, 50};
        int n = brr.length;

        for(int i=0; i<n; i++) {
            System.out.print(brr[i] + ", ");
        }
        System.out.println();

        // other way
        for(int val : brr) {
            System.out.print(val + " ");
        }
        System.out.println();


        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int crr[] = new int[m];
        for(int j=0; j<m; j++) {
            System.out.print("Provide input for index " + j + ": ");
            crr[j] = sc.nextInt();
        }

        // 2d array

        // declaration
        // int arr[][];

        // allocation
        // arr = new int[3][4];

        // initialization
        // int arr[][] = {
        //                {4, 8, 2, 0, 9},
        //                {1, 2, 3, 4, 5}
        //              };

        // rowLength = arr.length;
        // colLength = arr[0].length;
    }
}
