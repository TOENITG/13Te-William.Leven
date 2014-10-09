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
        String BirthDate_month_result;
        switch (BirthDate_month_int) {
            case 1:
                BirthDate_month_result = "januari";
                break;
            case 2:
                BirthDate_month_result = "februari";
                break;
            case 3:
                BirthDate_month_result = "mars";
                break;
            case 4:
                BirthDate_month_result = "april";
                break;
            case 5:
                BirthDate_month_result = "maj";
                break;
            case 6:
                BirthDate_month_result = "juni";
                break;
            case 7:
                BirthDate_month_result = "juli";
                break;
            case 8:
                BirthDate_month_result = "augusti";
                break;
            case 9:
                BirthDate_month_result = "september";
                break;
            case 10:
                BirthDate_month_result = "oktober";
                break;
            case 11:
                BirthDate_month_result = "november";
                break;
            case 12:
                BirthDate_month_result = "december";
                break;
            default:
                BirthDate_month_result = "Error 99999";
                break;
        }
        
        // Sending message to user
        JOptionPane.showMessageDialog(null, "Välkommen " + Name + ", då du fyller den " + BirthDate_day + " " + BirthDate_month_result + " kommer vi komma till dig på " + Adress + " och fira dig.", "automatiskt meddelande", JOptionPane.PLAIN_MESSAGE);
        
        // stop memory leaks
        System.exit(0);
    }
    
}
