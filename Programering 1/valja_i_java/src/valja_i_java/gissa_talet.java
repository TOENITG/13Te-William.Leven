package valja_i_java;

import javax.swing.JOptionPane;

/**
 * @author Willaim Leven "Gurgy"
 * @teacher ToEn ITG
 * @version 1.1.1
 */
public class gissa_talet {
    // Field variables
    int number = (int) (Math.random() * 100 + 1); // Number the user should guess
    
    public void run(){
        // Predefined variables and default values.
        boolean correct;
        int tries = 0;
        
        do{
            // Getting user input and checks if its correct.
            correct = check(input());
            // Add one to numbe rof tries.
            tries++;
            
        }
        while(!correct);
        
        // Choosing apropiate message.
        switch(tries){
            case 1:
                JOptionPane.showMessageDialog(null, "Yeay, you guessed the correct number on your 1:st try.", "GRATZ!", JOptionPane.PLAIN_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Yeay, you guessed the correct number on your 2:nd try.", "GRATZ!", JOptionPane.PLAIN_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Yeay, you guessed the correct number on your 2:rd try.", "GRATZ!", JOptionPane.PLAIN_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Yeay, you guessed the correct number on your " + tries + ":th try.", "GRATZ!", JOptionPane.PLAIN_MESSAGE);
                break;
        }
        
    }
    
    private int input(){
        
        // Predefined variables and default values.
        int input = 1;
        boolean correct;
        boolean inrange;
        
        // Loops untill user specefies a number that doesnt pass any errors and is within range.
        do{
            do{
                try{
                    // Grabbing input
                    input = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess a numer. (1-100)", "Guess!", JOptionPane.QUESTION_MESSAGE));
                    correct = true;
                }catch(NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Type your guess with numbers etc (1, 22, 46)!","Error", JOptionPane.WARNING_MESSAGE);
                    correct = false;
                }
            }while(!correct);
            
            // Checking if the number is within range
            inrange = !(input < 1 || input > 100);
            if (!inrange){
                JOptionPane.showMessageDialog(null, "Your number has to be between 1- 100.","Error", JOptionPane.WARNING_MESSAGE);
            }
        }while(!inrange);
                
        return input;
    }
    
    private boolean check(int num){
        // Predefined variables and default values.
        boolean correct;
        
        // Choosing message and return value.
        if( num == number){
            correct = true;
            
        }else if(num < number){
            correct = false;
            
            // Choosing message.
            if(number - num > 70){
                JOptionPane.showMessageDialog(null, "You are very far off, try a higher number!", "Your number was: " + num, JOptionPane.INFORMATION_MESSAGE);
            }else if(number - num > 50){
                JOptionPane.showMessageDialog(null, "You are far off, try a higher number!", "Your number was: " + num, JOptionPane.INFORMATION_MESSAGE);
            }else if(number - num > 30){
                JOptionPane.showMessageDialog(null, "You are close, try a higher number!", "Your number was: " + num, JOptionPane.INFORMATION_MESSAGE);
            }else if(number - num > 10){
                JOptionPane.showMessageDialog(null, "You are very close, try a higher number!", "Your number was: " + num, JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "The number is just behind the corner, try a higher number!", "Your number was: " + num, JOptionPane.INFORMATION_MESSAGE);
            }
            
        }else{
            correct = false;
            
            // Choosing message.
            if(num - number > 70){
                JOptionPane.showMessageDialog(null, "You are very far off, try a lower number!", "Your number was: " + num, JOptionPane.INFORMATION_MESSAGE);
            }else if(num - number > 50){
                JOptionPane.showMessageDialog(null, "You are far off, try a lower number!", "Your number was: " + num, JOptionPane.INFORMATION_MESSAGE);
            }else if(num - number > 30){
                JOptionPane.showMessageDialog(null, "You are close, try a lower number!", "Your number was: " + num, JOptionPane.INFORMATION_MESSAGE);
            }else if(num - number > 10){
                JOptionPane.showMessageDialog(null, "You are very close, try a lower number!", "Your number was: " + num, JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "The number is just behind the corner, try a lower number!", "Your number was: " + num, JOptionPane.INFORMATION_MESSAGE);
            }
        }
        return correct;
    }

}
    