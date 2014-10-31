
/*
 * No licence aplies
 */
package uppg2;
import java.util.*; // used for user input

/**
 * @author William Leven
 * @teacher ToEn ITG
 * @version 1.0.0 2014-10-26 03:02
 */
public class On {
     
    
    public static void main(String[] args) {
        
        // grabs number
        double answer = input("use as base:", true);
        
        //grabs number and prints answer
        answer = answer + input("add to your first number:", true);
        System.out.println("Addition: " + answer);
        
        //grabs number and prints answer
        answer = answer - input("subtrakt with:", true);
        System.out.println("Subtraktion: " + answer);
        
        //grabs number and prints answer
        answer = answer * input("multiply with:", true);
        System.out.println("Multiplikation: " + answer);
        
        //grabs number and prints answer
        answer = answer / input("divide by:", false);
        System.out.println("Division: " + answer);
        

    }
    static double input (String message, boolean zero_allowed){ //the sting for end of message and the bool to check if zeros should be allowed.
        
        System.out.println("Please enter a number to " + message);
        
        // local variables
        double temp = 0;
        boolean check = false;
        
        do { //loops the code untill user specefies a number that doesnt throw an error or is 0
            
            try{ //error handling for phrasing errors
                
                Scanner scan = new Scanner(System.in);  //builds scanner inside of loop to clean stream
                
                temp = scan.nextDouble();
                check = true; //tells the program that no errors were found
            }
            catch (InputMismatchException e) {       //error message
                
                System.out.println("You didn't enter a number, remember to use , as comma!");
                System.out.println("Try again:");
            }
            
            // check if number is zero
            if (temp == 0 && zero_allowed == false){
                check = false;  // tells te program to ask for a new number
                System.out.println("You can not use zero!");
                System.out.println("Try again:");
            }
            
        }
        while (check == false);
                
        return temp;
    }
    
}
