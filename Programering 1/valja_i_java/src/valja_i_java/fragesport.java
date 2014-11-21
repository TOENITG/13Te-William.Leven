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
        String[] questions = {"Price for one cup?", 
            "Universe life and everything.", 
            "Can eat a whole family pizza.", 
            "Who is the author?" , 
            "Creepers contains?", 
            "Whitch game does the people on patrik's computer play?",
            "Lain is .... of the web.",
            "13Te consists of ... pupils."};
        String[] answers = {"5", "42", "Nils", "William", "TNT", "bridge", "godess", "12"};
        String[] altanswers = {"5kr", null, "Nils Grötlund", "William Leven", "dynamite", "cards", "emperror", "twelve"};
        
        // Loops trough questions.
        for(int i = 0; i < questions.length; i++){
            
            // Grabbinging user input
            String answer = JOptionPane.showInputDialog(null, questions[i], "Question nr " + (i+1) + "!", JOptionPane.QUESTION_MESSAGE);
            
            // checks if answer is correct
            if(answer.equalsIgnoreCase(altanswers[i]) || answer.equalsIgnoreCase(answers[i])){
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
                        "Your final score is: " + points + "/" + questions.length + " Points.",
                        "Final score.", JOptionPane.INFORMATION_MESSAGE);
    }
}
