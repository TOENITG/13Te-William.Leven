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
public class Upp2 {

    public static void main(String[] args) {
        
        //seting up variable(s)
        String[] words = new String[5];
        
        // geting input from user
        for (int i=0; i<words.length; i++) {
            words[i] = JOptionPane.showInputDialog("Skriv in ord nr. " + i+1);
        }
        /** ToDo:
         * get 5 user input trough loop and store them in array
         * 
         * print out the array as one word
         */
    }
    
}
