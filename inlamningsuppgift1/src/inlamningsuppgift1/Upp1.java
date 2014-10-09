/*
 * 
 * 
 * 
 */

package inlamningsuppgift1;
import javax.swing.JOptionPane;
import java.text.DateFormatSymbols;

/**
 * @author William Leven
 * @teacher ToEn ITG
 * @version 1.0.0 2014-10-09 16:21
 */
public class Upp1 {

    public static void main(String[] args) {
        
        // Asking for I/O and storing in variables
        String Name = JOptionPane.showInputDialog("Skriv ditt namn", "Namn");
        String SocNumber = JOptionPane.showInputDialog("Skriv ditt personnummer", "xxxxxx-xxxx");
        String Adress = JOptionPane.showInputDialog("Skriv din adress", "Exempelvägen xx");
        
        // Extracting birth date from SocNumber
        String BirthDate_day = SocNumber.trim().substring(4, 6).replace("0", "");
        int BirthDate_month_int = Integer.parseInt(SocNumber.trim().substring(2, 4).replace("0", ""));
        
        // turning the month int to a string with the name of the month
        String BirthDate_month_result = new DateFormatSymbols().getMonths()[BirthDate_month_int-1];
        
        // Sending message to user
        JOptionPane.showMessageDialog(null, "Välkommen " + Name + ", då du fyller den " + BirthDate_day + " " + BirthDate_month_result + " kommer vi komma till dig på " + Adress + " och fira dig.", "automatiskt meddelande", JOptionPane.PLAIN_MESSAGE);
        
        // stop memory leaks
        System.exit(0);
    }
    
}
