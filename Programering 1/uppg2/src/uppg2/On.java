/*
 * No licence aplies
 */
package uppg2;
import java.util.*; // Used for the Scanner method and it's exceptions.

/**
 * @author William Leven
 * @teacher ToEn ITG
 * @version 1.1.2 2014-11-04 07:11
 */
public class On {
     
    
    public static void main(String[] args) {
        
        // Using the input method to get user input.
        // arg1 :: String suffix for message.
        // arg2 :: true/false Is a zero allowed as input?
        double answer = input("use as base: ", true);
        
        answer = answer + input("add to your first number: ", true);
        System.out.println("Addition: " + answer);
        
        answer = answer - input("subtrakt with: ", true);
        System.out.println("Subtraktion: " + answer);
        
        answer = answer * input("multiply with: ", true);
        System.out.println("Multiplikation: " + answer);
        
        answer = answer / input("divide by: ", false);
        System.out.println("Division: " + answer);
    }
    
    // arg1 :: String suffix for message.
    // arg2 :: true/false Is a zero allowed as input?
    static double input (String message, boolean zero_allowed){ 
        
        // Defining local variables & building Scanner scan.
        double temp = 0;
        boolean check = false;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter a number to " + message);
        
        do { // Loops the code untill user specefies a number that doesnt throw an error (or is 0).
            
            try{ 
                
                temp =  Double.parseDouble(scan.nextLine()); // Scans user stream and converts to double.
                check = true; // Tells the program that no errors were found.
            }
            catch (NumberFormatException e) {    // Catches covertion errors.
                
                // Checks if input contained any "," and cooses apropiate error message.
                if (e.toString().contains(",")){    
                    System.out.println("You have to use . as decimal separator!");
                    
                } else {
                    System.out.println("You didn't enter a number!");
                }
                
                System.out.print("Try again: ");
            }
            
            // Checks if number is zero.
            if (temp == 0 && !zero_allowed){
                check = false;  // tells te program to ask for a new number
                System.out.println("You can not use zero!");
                System.out.print("Try again: ");
            }
        } while (!check);
        
        return temp;
    }
}