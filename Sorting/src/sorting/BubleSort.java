package sorting;

/**
 * @author Willaim Leven "Gurgy"
 * @teacher ToEn ITG
 * @version 1.1.9
 */
public class BubleSort {
    
    public int[] BubleSort(int[] us) {
        
        // Predefined variables.
        boolean swaped = true;
        
        while (swaped) { // Loops untill it have run trough the whole array without swapping any number
            swaped = false;
            
            // Loops trough the whole array
            for (int i = 0; i < us.length - 1; i++){
                
                // Makes sure the highest number is to the right for each possition.
                if (us[i] > us[i+1]){
                    int temp = us[i];
                    us[i] = us[i+1];
                    us[i+1] = temp;
                    swaped = true;
                }
            }
        }
        return us;
    }


}
