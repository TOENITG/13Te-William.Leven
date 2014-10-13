/**
 * No licence
 */

package inlamningsuppgift1;

import javax.swing.JOptionPane;         // Interactive panes (JOptionPanes)
import java.text.DateFormatSymbols;     // Converting int to month string (.getMonth)

/**
 * @author William Leven
 * @teacher ToEn ITG
 * @version 1.0.1 2014-10-09 21:00
 */
public class Upp1 {

    public static void main(String[] args) {
        
        // Asking for I/O and saving to variables
        String Name = JOptionPane.showInputDialog("Skriv ditt namn", "Namn");
        String SocNumber = JOptionPane.showInputDialog("Skriv ditt personnummer", "xxxxxx-xxxx");
        String Adress = JOptionPane.showInputDialog("Skriv din adress", "Exempelvägen xx");
        
        // Extracting birth date from SocNumber
        // - .trim is used to remmove any blanks
        // - .substring extracts the desired letters
        // - .replace is used to remove any zeros
        // - Integer.parseInt converts the string to an int.
        String BirthDate_day = SocNumber.trim().substring(4, 6);
        int BirthDate_month_int = Integer.parseInt(SocNumber.trim().substring(2, 4));
        
        // Turning the month int to a string with the name of the month
        // - DateFormatSymbols().getMonths()[] convert the int to a string holding the month
        // - -1 @[BirthDate_month_int-1] is used because the method starts counting at zero.
        String BirthDate_month_name = new DateFormatSymbols().getMonths()[BirthDate_month_int-1];
        
        // Sending message to user
        JOptionPane.showMessageDialog(null, "Välkommen " + Name + ", då du fyller den " + BirthDate_day + " " + BirthDate_month_name + " kommer vi komma till dig på " + Adress + " och fira dig.", "automatiskt meddelande", JOptionPane.PLAIN_MESSAGE);
        
        // Closes all open panes when program ends
        System.exit(0);
    }
    
}
