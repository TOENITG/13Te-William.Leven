package valja_i_java;

import javax.swing.JOptionPane;

/**
 * @author Willaim Leven "Gurgy"
 * @teacher ToEn ITG
 * @version 1.1.1
 */
public class uppslag {
    
    // Predefined variables with default values.
    Object alternatives[] = { "Naruto" , "Lain", "Death Note" , "Avatar"}; 
    String naruto = "<html><center>Naruto Uzumaki, a hyperactive and knuckle-headed ninja, lives in Konohagakure, the Hidden Leaf village.<br> Moments prior to his birth, a huge demon known as the Kyuubi, the Nine-tailed Fox, attacked Konohagakure and wreaked havoc. <br> In order to put an end to the Kyuubi's rampage, the leader of the village, the 4th Hokage, sacrificed his life and sealed the monstrous beast inside the newborn Naruto.</center></html>";
    String lain = "<html><center>Lain Iwakura appears to be an ordinary girl, with almost no experience with computers.<br> Yet the sudden suicide of a schoolmate, and a number of strange occurrences, conspire to pull Lain into the world of the Wired, where she gradually learns that nothing is what it seems to be... <br>not even Lain herself.</center></html>";
    String deno = "<html><center>Yagami Light is a 17-year-old genius from Japan who is tired of his life, school, and the state of the world as he knows it.<br> One day, on the way home from class, Light stumbles upon a dark notebook with \"Death Note\" written on the front. <br>Intrigued by its appearance, Light reads the first few sentences, only to find out that it states that anyone whose name is written inside will die.<br> Discarding it as a joke, Light continues his daily activities.<br> Soon after though, his human curiosity takes the better of him and prompts Light to try the notebook, discovering the truth behind first sentence.<br> Now, with power in his hands, Yagami Light is on a quest to change the world and become God of the New World.<br> His path to holy status won't be easy however, as another genius, known as L, is working against Light's beliefs and Light himself. <br>Who will win this power of Gods between humans?</center></html>";
    String avatar = "<html><center>When the hostile Fire Nation threatens to enslave the Water, Earth, and Air Nations, a reluctant and irresponsible boy must face his destiny as the Avatar,<br> the Chosen One who can restore the world order. <br>This new animated series centers on twelve-year-old Aang, who must forgo his selfish wandering to learn to master his latent powers over the four elements.<br> Only then can he conquer the Firebenders, the evil nation that threatens the world. </center></html>";
    
    public void run(){
        // Grabing user input.
        Object Subject = JOptionPane.showInputDialog(null, "Choose your subject:", "Choose!", JOptionPane.PLAIN_MESSAGE, null, alternatives, this);
        
        // Shows apropiate information to user.
        if(Subject == "Naruto"){
            
            JOptionPane.showMessageDialog(null, naruto, (String) Subject, JOptionPane.INFORMATION_MESSAGE);
        }else if(Subject == "Lain"){
            
            JOptionPane.showMessageDialog(null, lain, (String) Subject, JOptionPane.INFORMATION_MESSAGE);
        }else if(Subject == "Death Note"){
            
            JOptionPane.showMessageDialog(null, deno, (String) Subject, JOptionPane.INFORMATION_MESSAGE);
        }else if(Subject == "Avatar"){
            
            JOptionPane.showMessageDialog(null, avatar, (String) Subject, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
