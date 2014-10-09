/*
 * 
 * 
 * 
 */

package inlamningsuppgift1;
import javax.swing.JOptionPane;

/**
 * @author William Leven
 * @teacher ToEn ITG
 * @version 1.0.0
 */
public class Upp1 {

    public static void main(String[] args) {
        
        // Asking for I/O and storing in variables
        String Name = JOptionPane.showInputDialog("Namn","Skriv ditt namn");
        String SocNumber = JOptionPane.showInputDialog("xxxxxx-xxxx","Skriv ditt personnummer");
        String Adress = JOptionPane.showInputDialog("Exempelvägen xx","Skriv din adress");
        
        // Extracting birth date from SocNumber
        String BirthDate = SocNumber.trim().substring(2, 6);
        
        /** TODO
         * 
         * Skriv ut:
         * Välkommen <Namn>, då du fyller den <födelsedagen> kommer vi komma till dig, <Address> och fira dig. Detta är ett automatiskt meddelande.
         * 
         * 
         * 
         */
    }
    
}
