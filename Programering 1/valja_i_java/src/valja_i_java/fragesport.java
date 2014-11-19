package valja_i_java;

/**
 * @author Willaim Leven "Gurgy"
 * @teacher ToEn ITG
 * @version 1.1.1
 */
public class fragesport {
    
    public void run(){
        // Predefined vars.
        int points = 0;
        String[] questions = {};
        String[] answers = {};
        String[] altanswers = {};
        
        // Loops trough questions.
        for(int i = 0; i < 15; i++){
            
            // Grabbinging user input
            String answer = input;
            
            // checks if answer is correct
            if( 9 < i && answer.equalsIgnoreCase(altanswers[i-10])){
                points++;
                //sho message gratz you get a point
            }
            else if(answer.equalsIgnoreCase(answers[i])){
                points++;
                //sho message gratz you get a point
            }
            else{
                // show fail message
            }
            
        }
    }
}
