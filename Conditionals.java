import java.util.Scanner;

public class Conditionals {
    static void main() {

        // if-else
        int score = 15;
        if(score > 10) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

        // if-else-if ladder
        int accuracy = 75;
        if(accuracy <= 50) { // condition 1
            System.out.println("Poor accuracy");
        }
        else if(accuracy > 50 && accuracy <= 75) { // condition 2
            System.out.println("Average Accuracy");
        }
        else if(accuracy > 75 && accuracy <= 95) { // condition 3
            System.out.println("Good Accuracy");
        }
        else { // default condition (optional)
            System.out.println("Beat Accuracy");
        }


        // nested if-else ladder
        boolean hasSubscription = true;
        int solvedproblems = 200;

        if(hasSubscription)
        {
            if(solvedproblems >= 150) {
                System.out.println("Unlocked Advanced Problems");
            }
            else {
                System.out.println("Solve more questions");
            }
        }
        else {
            System.out.println("Upgrade to Premium Subscription");
        }

        // Ternary Operator
        int streak = 35;
        String status = (streak >= 30) ? "Consistent" : "Inconsistent"; 
        System.out.println(status);

        // Switch Statement
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of day: ");
        int day = sc.nextInt();

        switch(day) {
            case 1: 
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thursday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6: 
                System.out.println("Saturday");
                break;
            default: 
                System.out.println("Sunday");
                break;

        }


    }
}
