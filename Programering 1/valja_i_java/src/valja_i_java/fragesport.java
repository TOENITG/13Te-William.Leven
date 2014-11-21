package valja_i_java;

import javax.swing.JOptionPane;

/**
 * @author Willaim Leven "Gurgy"
 * @teacher ToEn ITG
 * @version 1.1.1
 */
public class fragesport {
    
    public void run(){
        // Predefined vars with default values.
        int points = 0;
        String[] questions = {"Price for one cup?", "Universe life and everything.", "Can eat a whole family pizza."};
        String[] answers = {"5", "42", "Nils"};
        String[] altanswers = {};
        
        // Loops trough questions.
        for(int i = 0; i < 15; i++){
            
            // Grabbinging user input
            String answer = JOptionPane.showInputDialog(null, questions[i], "Question nr " + (i+1) + "!", JOptionPane.QUESTION_MESSAGE);
            
            // checks if answer is correct
            if( 9 < i && answer.equalsIgnoreCase(altanswers[i-10])){
                points++;
                JOptionPane.showMessageDialog(null, 
                        "Your answer '" + answer + "' is correct and you have been rewarded one point. " + " Now you got " + points + " point(s).",
                        questions[i], JOptionPane.INFORMATION_MESSAGE);
            }
            else if(answer.equalsIgnoreCase(answers[i])){
                points++;
                JOptionPane.showMessageDialog(null, 
                        "Your answer '" + answer + "' is correct and you have been rewarded one point. " + " Now you got " + points + " point(s).",
                        questions[i], JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, 
                        "Your answer '" + answer + "' is wrong and you have not been rewarded any points. " + " You still got " + points + " point(s).",
                        questions[i], JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
        JOptionPane.showMessageDialog(null, 
                        "Your final score is: " + points + " Point(s).",
                        "Final score.", JOptionPane.INFORMATION_MESSAGE);
    }
}
