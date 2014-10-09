/*
 * 
 * 
 * 
 */

package inlamningsuppgift1;

import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.ArrayList;

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
        
        while (true) {
            // geting input from user
            words.add(JOptionPane.showInputDialog("Skriv in ord nr. " + (words.size()+1)));
            //printing out "words"
            JOptionPane.showMessageDialog(null, Arrays.asList(words), "Dina Ord", JOptionPane.PLAIN_MESSAGE);
            //making sure the program doesnt overwrite the prev value
            i ++;
        }
        
        /** ToDo:
         * 
         */
    }
    
}
