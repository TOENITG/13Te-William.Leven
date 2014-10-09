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
        String Name = JOptionPane.showInputDialog("Skriv ditt namn", "Namn");
        String SocNumber = JOptionPane.showInputDialog("Skriv ditt personnummer", "xxxxxx-xxxx");
        String Adress = JOptionPane.showInputDialog("Skriv din adress", "Exempelvägen xx");
        
        // Extracting birth date from SocNumber
        String BirthDate = SocNumber.trim().substring(2, 6);
        
        // Sending message to user
        JOptionPane.showMessageDialog(null, "Välkommen " + Name + ", då du fyller den " + BirthDate + " kommer vi komma till dig på " + Adress + " och fira dig.", "automatiskt meddelande", JOptionPane.PLAIN_MESSAGE);
        /** TODO
         * 
         */
    }
    
}
