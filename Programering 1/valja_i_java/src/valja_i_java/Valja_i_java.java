package valja_i_java;

import javax.swing.JOptionPane;

/**
 * @author Willaim Leven "Gurgy"
 * @teacher ToEn ITG
 * @version 1.1.1
 */
public class Valja_i_java {

    public static void main(String[] args) {
        // Predefined variables with default values.
        boolean quit = false; 
        Object[] programs = {"Frågesport!", "Gissa talet!", "Uppslag!", "Quit"}; // Button texts for first dialogue.
        
        // Loop untill user decides to quit.
        do{
            // Grab input from user.
            int answer = JOptionPane.showOptionDialog(null,"Which program do you want to run?","Choose!",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,programs,programs[3]);
            
            // Execute users choise.
            switch(answer){
                case 0:
                    fragesport fragesport = new fragesport();
                    fragesport.run();
                    break;
                    
                case 1:
                    gissa_talet gissa_talet = new gissa_talet();
                    gissa_talet.run();
                    break;
                    
                case 2:
                    uppslag uppslag = new uppslag();
                    uppslag.run();
                    break;
                    
                case 3:
                    
                    // Asking if the user is sure that he want to quit.
                    if(0 == JOptionPane.showOptionDialog(null, "Are you sure you want to Quit?", "Quit?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null)){
                        quit = true;
                    }
                    break;
            }
        }while(!quit);
        
    }
    
}
