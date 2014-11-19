package sorting;

/**
 * @author Willaim Leven "Gurgy"
 * @teacher ToEn ITG
 * @version 1.0.0
 */
public class ImprovedSelectionSort {
    
    private static int[] myImprovedSort(int[] us) {
        // i & length-1-i - solving
        // n - current
        // li - index of lowest
        // hi - index of highest
        
        // Predefined variables.
        int li;
        int hi;
        
        // Loops (lenght of array / 2) times
        for (int i = 0; i < (us.length)/2+1; i++){
            
            // Default values
            hi = i;
            li = i;
            
            // Loops trough all unsorted values in search for the highest and lowest one.
            for (int n = i; n < us.length-i; n++){
                
                // Saves highest and lowest values
                if(us[n] < us[li]){
                    li = n;
                }
                if(us[n] > us[hi]){
                    hi = n;
                }
            }
            
            // Only swaps if highest and lowest arent the same.
            if ( us[hi] != us[li]){
                
                // Swaping lowest
                int temp = us[i];
                us[i] = us[li];
                us[li] = temp;
                
                // Makes sure that index of highest is moved too if the 
                // highest number is moved in the first swap process.
                if (hi == i){
                    hi = li;
                }
                
                // Swaping highest
                temp = us[us.length-1-i];
                us[us.length-1-i] = us[hi];
                us[hi] = temp;
            }
            
        }
        return us;
    }
    

}
