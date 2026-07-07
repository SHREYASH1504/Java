import java.util.Scanner;

public class Strings {
    static void main() {

        // the name of the string is stored in stack
        // the initialized string characters are stored inside 'heap' in "string pool"

        // String str = "Love";
        // String str = new String("Love");

        // String firstName = "Shreyash";
        // String lastName = new String("Nikhare");

        // character at index 0 -> firstName.charAt(0));

        // length of the string -> firstName.length();

        // string is immutable -> cannot change

        // comparing strings
        String name1 = "Love";
        String name2 = "Love";

        /* 
        (1) : == 
            
            if(name1 == name2) {
                System.out.println("both strings are same");
            }
            else {
                System.out.println("Both strings are not same");
            }

            *** Here it is not checking the intialization of both strings
                it is checking the name of the strings are pointing towards the same name
        */

        /* 
        (2) : .equals()
            -> case sensitive  
            -> acutally compare the value of the string  
            if(name1.equals(name2)) {  // true or false
                System.out.println("both strings are same"); 
            }
            else {
                System.out.println("Both strings are not same");
            }
        */

        /* 
        (3) : .equalsIgnoreCase()
            -> not case sensitive  
            -> acutally compare the value of the string
              if(name1.equalsIgnoreCase(name2)) {
                System.out.println("both strings are same");
            }
            else {
                System.out.println("Both strings are not same");
            }
        */

        // Inputs -> 1. next()       ...only take the first word, eliminates everything after first space
        //        -> 2. nextLine()   ...take entire thing
         /*
            Scanner sc = new Scanner(System.in);
            String sentence = sc.nextLine();
            System.out.println("Your sentence is : " + sentence);
            String word = sc.next();
            System.out.println("Your word is : " + word);
        */

        // String name = "   Love   ";
        // name = name.trim(); // removes the spaces befire and after the word
        // System.out.println(name);

        // String name = "Love";
        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());

        // String str = "My name is Shreyash";
        // System.out.println(str.substring(3, 6));
        // // here 3 is inclusive and 6 is exclusive
        // System.out.println(str.contains("Shreyash"));
        // System.out.println(str.contains("shryrrr"));
        
        // int num = 5112;
        // String str = String.valueOf(num);  // converts int to string
        // System.out.println(num + 1);
        // System.out.println(str + 1);

        // String str = "My name is Shreyash";
        // System.out.println(str.endsWith(" Shreyash"));
        // System.out.println(str.startsWith("My"));

        // Converting string into char array
        // String name = "Shreyash";
        // char[] ch = name.toCharArray();
        // for(char c : ch) {
        //     System.out.println("The character is: " + c);
        // }

        // splits the string into string array based on given criteria
        // String input = "My,name,is,Shreyash";
        // String[] output = input.split(",");
        // for(String ch : output) {
        //     System.out.println(ch);
        // }
        
        // replaces a char in string with other char
        String name = "shreaysh";
        String output = name.replace("s", "A");
        System.out.println("Original: " + name + "\n" + "Replaced name: " + output);

        




    }
}
