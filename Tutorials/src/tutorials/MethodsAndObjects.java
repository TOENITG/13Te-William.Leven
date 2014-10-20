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
public class MethodsAndObjects {
    // a variable that can be used only in this class
    private static String Names;
    private static String ss;
        
    //constructor will be called whenever you make an object of the class
    //- Name is recived from the main class when building the object
    public void setname(String name) {
        Names = name;
        
        }
    
    // a methos that can be used outside of class and doest return a value(void).
    public void Say() {
        System.out.println("Hi " + Names + ", With birth date: " + ss);
    }
    
    //a method that extracts birth date from ss number
    public void birth_date(){
        Scanner input = new Scanner(System.in);
        System.out.println("Whats your ss number?");
        
        ss = input.nextLine().substring(2, 6);
        
    }
}
