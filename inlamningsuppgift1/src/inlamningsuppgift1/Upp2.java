/**
 * No licence
 */

package inlamningsuppgift1;

import java.util.ArrayList;         // Dynamic Arrays (ArrayLists)
import java.util.Arrays;            // Array handling (asList)
import javax.swing.JOptionPane;     // Interactive panes (JOptionPanes)

/**
 * @author William Leven
 * @teacher ToEn ITG
 * @version 1.0.0 2014-10-09 20:54
 */
public class Upp2 {

    public static void main(String[] args) {
        
        //Seting up variables
        //- Using ArrayList to make the array dynamic.
        ArrayList words = new ArrayList();
        int stop = 0;
        
        while ( stop == 0) {
            // Geting input from user
            //- .add & .size is used as im working with ArrayLists.
            //- +1 @(words.size()+1) as array positions start at 0
            words.add(JOptionPane.showInputDialog("Skriv in ord nr. " + (words.size()+1)));
            
            // Printing out "words"
            //- Arrays.asList is used to call all values from the array
            JOptionPane.showMessageDialog(null, Arrays.asList(words), "Dina Ord", JOptionPane.PLAIN_MESSAGE);
            
            // Asking if the user wants to contingue in order to give a way out of the loop.
            //- If answer is no "stop" will take the value of 1
            stop = JOptionPane.showConfirmDialog(null, "Vill du lägga till ett ord till?","Igen", JOptionPane.YES_NO_OPTION);
        }
        
        // Closes all open panes when program ends
        System.exit(0);
       
    }
    
}
