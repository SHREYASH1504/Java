import java.util.Scanner;

public class ArrayProblems {


    static double calculateAverage(int arr[]) { // O(n), O(1)
        int size = arr.length;
        int ans = 0;

        for(int i=0; i<size; i++) {
            ans += arr[i];
        }

        double avg = ans / size;
        
        return avg;
    }

    static void multiplyTen(int arr[]) { // O(n), O(1)
        for(int i=0; i<arr.length; i++) {
            arr[i] *= 10;
        }
    }

    static int LinearSearch(int arr[], int element) { // O(n), O(1)
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    static int maxElement(int arr[]) { // O(n), O(1)
        int maxi = arr[0];
        for(int i=1; i<arr.length; i++) {
            // if(arr[i] > maxi) {
            //     maxi = arr[i];
            // }
            maxi = Math.max(maxi, arr[i]);
        }

        return maxi;
    }
    
    static int[] posAndNegSum(int arr[]) { // O(n), O(1)
        int pos = 0;
        int neg = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] >= 0) {
                pos += arr[i];
            }
            else {
                neg += arr[i];
            }
        }

        int ans[] = {pos, neg};
        return ans;
    }

    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of array: ");
        // int size = sc.nextInt();

        int arr[] = {21, -85, 40, 61, 13, -9, 50, -30};

        // for(int i=0; i<size; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // double avg = calculateAverage(arr);
        // System.out.println("The Average is: " + avg);

        // multiplyTen(arr);
        // for(int i=0; i<size; i++) {
        //     System.out.println(arr[i]);
        // }

        // int index = LinearSearch(arr, 4);
        // System.out.println(index);

        // int maxValue = maxElement(arr);
        // System.out.println(maxValue); 

        // int ans[] = posAndNegSum(arr);
        // System.out.println("Positive Sum: " + ans[0]);
        // System.out.println("Negative Sum: " + ans[1]);

        
    }
}