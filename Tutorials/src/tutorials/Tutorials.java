/*
 * No licence
 */

package tutorials;
import java.util.Scanner;
/**
 * @author Willaim Leven "Gurgy"
 * @teacher ToEn ITG
 * @version 1.0.0
 */
public class Tutorials {

    public static void main(String[] args) {
        
        Scanner user_input = new Scanner(System.in);
        
        //building object of MAO class and sending "William" to the constructor
        MethodsAndObjects MAO = new MethodsAndObjects("william");
        //building a second object of MAO class and sending "Jonny" to the constructor
        MethodsAndObjects MAO2 = new MethodsAndObjects("jonny");
        
        System.out.println("hello are you user:");
        System.out.println("1.William");
        System.out.println("2.Jonny");
        
        // creating temp variable with user input
        String temp = user_input.nextLine();
        
        if (temp.equals("1")) {
            // calling method Say in the first object
            MAO.Say();
        }
        else if (temp.equals("2")) {
            // calling method say in the second object
            MAO2.Say();
        }
        
        System.out.println("Whats your ss number?");
        temp = user_input.nextLine();
        
        // sending temp variable to MAO class and gets birth date back
        String bd = MAO.birth_date(temp);
        System.out.println("your birthdate is: "+bd);
        
    }

}
