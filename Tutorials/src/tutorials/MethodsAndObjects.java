/*
 * No licence
 */

package tutorials;

/**
 * @author Willaim Leven "Gurgy"
 * @teacher ToEn ITG
 * @version 1.0.0
 */
public class MethodsAndObjects {
    // a variable that can be used only in this class
    private String Names;
        
    //constructor will be called whenever you make an object of the class
    //- Name is recived from the main class when building the object
    MethodsAndObjects(String name) {
        Names = name;
        
        }
    
    // a methos that can be used outside of class and doest return a value(void).
    public void Say() {
        System.out.println("Hi " + Names);
    }
    
    //a method that extracts birth date from ss number
    public String birth_date(String ss){
        
        String temp = ss.substring(2, 6);
        return temp;
    }
}
