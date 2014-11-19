package sorting;

/**
 * @author Willaim Leven "Gurgy"
 * @teacher ToEn ITG
 * @version 1.2.3
 */
public class SelectionSort {
    public int[] SelectionSort(int[] us) {
        // i - solving
        // n - current
        // li - index of lowest
        int li = 0;
        
        // Loops trough the array, finding highest number for eaxh index.
        for (int i = 0; i < us.length -1; i++){
            // Loops trough the array in search of highest number.
            for (int n = i; n < us.length; n++){
                // Keeps the highest number in memory.
                if( n == 0 || us[n] < us[li]){
                    li = n;
                }
            }
            
            // Switch places with the highest number.
            int temp = us[i];
            us[i] = us[li];
            us[li] = temp;
        }
        return us;
    }
    

}
