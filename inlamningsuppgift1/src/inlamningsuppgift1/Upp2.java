/*
 * 
 * 
 * 
 */

package inlamningsuppgift1;

import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 * @author William Leven
 * @teacher ToEn ITG
 * @version 1.0.0
 */
public class Upp2 {

    public static void main(String[] args) {
        
        //seting up variable(s)
        String[] words = new String[5];
        
        for (int i=0; i<words.length; i++) {
            // geting input from user
            words[i] = JOptionPane.showInputDialog("Skriv in ord nr. " + (i+1));
            //printing out "words"
            JOptionPane.showMessageDialog(null, Arrays.asList(words), "Dina Ord", JOptionPane.PLAIN_MESSAGE);
        }
        
        /** ToDo:
         * 
         * print out the array as one word
         */
    }
    
}
