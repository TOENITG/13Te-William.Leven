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
public class Tutorials extends MethodsAndObjects{

    public static void main(String[] args) {
        path();
        
    }
    
    public void path(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        
        super.setname(input.nextLine());
       
        super.birth_date();
        
        this.say();
        super.Say();
    }
    
    public void say(){
        System.out.println("All variables were stored localy in the parrent class so the child class cant print them");
        System.out.println("but the superclass can");
    }
}
