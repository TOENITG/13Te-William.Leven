/*
 * 
 * 
 * 
 */

package inlamningsuppgift1;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * @author William Leven
 * @teacher ToEn ITG
 * @version 1.0.0
 */
public class Upp2 {

    public static void main(String[] args) {
        
        //seting up variable(s)
        ArrayList words = new ArrayList();
        int i = 0;
        int stop = 0;
        
        while ( stop == 0) {
            // geting input from user
            words.add(JOptionPane.showInputDialog("Skriv in ord nr. " + (words.size()+1)));
            //printing out "words"
            JOptionPane.showMessageDialog(null, Arrays.asList(words), "Dina Ord", JOptionPane.PLAIN_MESSAGE);
            //making sure the program doesnt overwrite the prev value
            i ++;
            // asking if the user wants to add a new value
            stop = JOptionPane.showConfirmDialog(null, "Vill du lägga till ett ord till?","Igen", JOptionPane.YES_NO_OPTION);
            
        }
        System.exit(0);
        // stop memory leaks
       
    }
    
}
